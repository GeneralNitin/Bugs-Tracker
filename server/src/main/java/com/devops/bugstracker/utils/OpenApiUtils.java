package com.devops.bugstracker.utils;

import com.devops.bugstracker.annotation.BugsTrackerApiResponse;
import com.google.common.base.CaseFormat;
import io.swagger.v3.core.converter.AnnotatedType;
import io.swagger.v3.core.converter.ModelConverters;
import io.swagger.v3.core.converter.ResolvedSchema;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.media.*;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.condition.PatternsRequestCondition;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OpenApiUtils {

    private OpenApiUtils() {}

    private static final Logger LOGGER = LoggerFactory.getLogger(OpenApiUtils.class);

    public static Operation getOperation(RequestMethod requestMethod, PathItem pathItem) {
        switch (requestMethod) {
            case GET:
                return pathItem.getGet();
            case HEAD:
                return pathItem.getHead();
            case POST:
                return pathItem.getPost();
            case PUT:
                return pathItem.getPut();
            case PATCH:
                return pathItem.getPatch();
            case DELETE:
                return pathItem.getDelete();
            case OPTIONS:
                return pathItem.getOptions();
            case TRACE:
                return pathItem.getTrace();
        }
        return null;
    }

    public static ObjectSchema getResponseBuilderSchema(Schema<?> resultSchema, String message) {
        ObjectSchema objectSchema = new ObjectSchema();
        Map<String, Schema> properties = new LinkedHashMap<>();
        properties.put("results", resultSchema);
        properties.put("message", new StringSchema().example(message));
        objectSchema.setProperties(properties);
        return objectSchema;
    }

    private static <T> T getFirstItemInCollection(Collection<T> collection) {
        if (!collection.isEmpty()) {
            return collection.iterator().next();
        }
        return null;
    }

    public static void apiResponseBuilder(OpenAPI openAPI) {
        Map<RequestMappingInfo, HandlerMethod> handlerMethods = BeanUtils.getBean(RequestMappingHandlerMapping.class).getHandlerMethods();
        HashMap<String, Schema<?>> schemaMap = new HashMap<>();

        for (Map.Entry<RequestMappingInfo, HandlerMethod> entry : handlerMethods.entrySet()) {
            HandlerMethod value = handlerMethods.get(entry.getKey());

            String patterns = null;

            PatternsRequestCondition patternsRequestCondition = entry.getKey().getPatternsCondition();
            if (patternsRequestCondition != null)
                patterns = getFirstItemInCollection(patternsRequestCondition.getPatterns());

            RequestMethod requestMethod = getFirstItemInCollection(entry.getKey().getMethodsCondition().getMethods());

            PathItem pathItem = null;
            Operation operation = null;

            if (patterns != null) {
                pathItem = openAPI.getPaths().get(patterns);
            }

            if (requestMethod != null && pathItem != null) {
                operation = OpenApiUtils.getOperation(requestMethod, pathItem);
            }

            if (operation == null) {
                LOGGER.info("patterns : {}", patterns);
                LOGGER.info("requestMethod : {}", requestMethod);
                LOGGER.info("pathItem : {}", pathItem);
                LOGGER.info("operation : {}", (Object) null);
                continue;
            }

            BugsTrackerApiResponse annotation = value.getMethod().getAnnotation(BugsTrackerApiResponse.class);

            if (annotation != null) {
                // Response Object -> Open Api Schema
                String schemaName = annotation.value().getSimpleName();

                // get the schema
                Schema<?> schema = resolveSchemaFromType(annotation.value(), schemaMap);

                // register the schema, or else $ref will cause error
                openAPI.getComponents().addSchemas(schemaName, schema);

                // declare new name for Response Builder schema
                if (annotation.wrapInArray()) {
                    // is wrapped in array specified, wrap in array schema
                    schemaName = "AthenaList" + schemaName;
                    schema = new ArraySchema().items(schema);
                } else {
                    schemaName = "Athena" + schemaName;
                }

                // generate Response Builder Schema
                schema = getResponseBuilderSchema(schema, "string");

                // register the Response Builder schema
                openAPI.getComponents().addSchemas(schemaName, schema);

                // assign a scheme to the path-item via $ref
                schema = new Schema<>().$ref("#/components/schemas/" + schemaName);
                MediaType mediaType = new MediaType().schema(schema);
                operation.getResponses()
                        .get("200")
                        .description("standard response")
                        .getContent()
                        .put("*/*", mediaType);
            }

            // update operation ID
            String methodName = value.getMethod().getName();
            String controllerName = value.getMethod().getDeclaringClass().getSimpleName();
            updateOperationId(operation, controllerName, methodName, annotation);
        }
    }

    public static Schema<?> resolveSchemaFromType(Class<?> type, Map<String, Schema<?>> schemaMap) {
        if (schemaMap.containsKey(type.getSimpleName())) {
            return schemaMap.get(type.getSimpleName());
        }
        Schema<?> schemaObject = new Schema<>();
        if (type.getName().startsWith("java.lang")) {
            schemaObject.setType(type.getSimpleName().toLowerCase());
        } else {
            ResolvedSchema resolvedSchema = ModelConverters.getInstance()
                    .readAllAsResolvedSchema(new AnnotatedType().type(type));
            if (resolvedSchema != null) {
                resolvedSchema.referencedSchemas.entrySet()
                        .stream()
                        .filter(entry -> !schemaMap.containsKey(entry.getKey()))
                        .forEach(entry -> schemaMap.put(entry.getKey(), entry.getValue()));

                Schema<?> tmpSchema = schemaMap.get(type.getSimpleName());
                if (tmpSchema != null) {
                    schemaObject = tmpSchema;
                }
            }
        }
        if (StringUtils.isBlank(schemaObject.get$ref()) && StringUtils.isBlank(schemaObject.getType())) {
            // default to string
            schemaObject.setType("string");
        }
        return schemaObject;
    }

    private static void updateOperationId(Operation operation, String controllerName, String methodName, BugsTrackerApiResponse annotation) {
        String operationId;
        if (annotation == null || annotation.operation().isEmpty()) {
            controllerName = controllerName.replace("Controller", "")
                    .replace("controller", "");
            operationId = methodName;

            String tmp = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, methodName);
            if (tmp.split("_").length <= 1) {
                operationId = methodName + controllerName;
            }
        } else {
            operationId = annotation.operation();
        }
        operation.setOperationId(operationId);
    }
}
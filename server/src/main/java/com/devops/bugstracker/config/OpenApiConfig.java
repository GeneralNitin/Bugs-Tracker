package com.devops.bugstracker.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        Components components = new Components();

        Info info = new Info();
        info.title("Bugs-Tracker")
                .version("0.0.1")
                .description("This is a OpenAPI 3 specification of Bugs-Tracker application for DevOps Project");

        return new OpenAPI()
                .components(components)
                .info(info);
    }
}

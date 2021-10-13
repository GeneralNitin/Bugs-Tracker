package com.devops.bugstracker.utils;

import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.core.env.Environment;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.SecureRandom;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class CommonUtils {

    private CommonUtils() {
    }

    private static final ModelMapper modelMapper;
    private static final SecureRandom secureRandom = new SecureRandom();
    private static final Base64.Encoder base64Encoder = Base64.getUrlEncoder();
    private static Boolean isLocal;

    static {
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setPropertyCondition(Conditions.isNotNull())
                .setMatchingStrategy(MatchingStrategies.STRICT);
    }

    public static <D, T> D mapModel(final T subject, Class<D> tClass) {
        return modelMapper.map(subject, tClass);
    }

    public static <D, T> List<D> mapModels(final Collection<T> entityList, Class<D> outCLass) {
        return entityList.stream()
                .map(entity -> mapModel(entity, outCLass))
                .collect(Collectors.toList());
    }

    public static <S, D> D mapModel(final S source, D destination) {
        modelMapper.map(source, destination);
        return destination;
    }

    public static String extractPhoneNumber(String phoneNumber) {
        if (phoneNumber == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (Character.isDigit(phoneNumber.charAt(i))) {
                sb.append(phoneNumber.charAt(i));
            }
        }
        if (sb.length() < 10) {
            return null;
        }
        return sb.substring(sb.length() - 10, sb.length());
    }

    static final Set<String> allowedFileTypes = new HashSet<>();

    public static boolean isUrl(String urlString) {
        try {
            URL url = new URL(urlString);
            url.toURI();
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    public static String generateToken() {
        byte[] randomBytes = new byte[32];
        secureRandom.nextBytes(randomBytes);
        String token = base64Encoder.encodeToString(randomBytes);
        token = token.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
        return token;
    }

    public static String sanitizeMimeType(String mimeType) {
        mimeType = mimeType.trim();
        mimeType = StringUtils.cleanPath(mimeType);
        return mimeType.replaceAll("[^\\w\\/\\.]+", "");
    }

    public static String sanitizeFileName(String fileName) {
        fileName = fileName.trim();
        fileName = StringUtils.cleanPath(fileName);
        return fileName.replaceAll("[^a-zA-Z0-9.\\-]|\\.{2}", "_");
    }

    public static Duration between(Date date1, Date date2) {
        if (date1 == null) {
            date1 = Date.from(Instant.now());
        }
        if (date2 == null) {
            date2 = Date.from(Instant.now());
        }
        return Duration.between(date1.toInstant(), date2.toInstant());
    }

    public static Duration since(Date date) {
        if (date == null) {
            date = Date.from(Instant.now());
        }
        return Duration.between(Instant.now(), date.toInstant());
    }

    public static Date getCurrentTimeStamp() {
        return new Timestamp(System.currentTimeMillis());
    }

    public static boolean isBasicType(Object value) {
        if (value == null) {
            return true;
        }
        return ClassUtils.isPrimitiveOrWrapper(value.getClass()) || ClassUtils.isAssignable(String.class, value.getClass());
    }

    public static boolean isCollectionType(Object value) {
        if (value == null)
            return false;
        return ClassUtils.isAssignable(Map.class, value.getClass()) || ClassUtils.isAssignable(List.class, value.getClass());
    }

    public static String base64Encode(byte[] data) {
        if (data == null)
            return null;
        return Base64.getEncoder().encodeToString(data);
    }

    public static String base64Encode(String data) {
        if (data == null)
            return null;
        return Base64.getEncoder().encodeToString(data.getBytes());
    }


    public static String base64Decode(String data) {
        if (data == null)
            return null;
        return new String(Base64.getDecoder().decode(data));
    }

    public static String baseUrl(String urlString) {
        if (urlString == null) {
            return null;
        }
        try {
            urlString = urlString.trim();
            URL url = new URL(urlString);
            return url.getProtocol() + "://" + url.getHost();
        } catch (MalformedURLException e) {
            return null;
        }
    }

    public static boolean isLocalProfile(Environment environment) {
        if (isLocal == null) {
            List<String> profiles = Arrays.asList(environment.getActiveProfiles());
            isLocal = profiles.contains("local_h2") || profiles.contains("cf-local");
        }
        return isLocal;
    }

    static {
        allowedFileTypes.add("application/msword");
        allowedFileTypes.add("application/rtf");
        allowedFileTypes.add("application/pdf");
        allowedFileTypes.add("application/vnd.ms-excel");
        allowedFileTypes.add("image/bmp");
        allowedFileTypes.add("image/gif");
        allowedFileTypes.add("image/ief");
        allowedFileTypes.add("image/jpeg");
        allowedFileTypes.add("image/pipeg");
        allowedFileTypes.add("image/svg+xml");
        allowedFileTypes.add("image/tiff");
        allowedFileTypes.add("image/x-icon");
        allowedFileTypes.add("image/x-portable-anymap");
        allowedFileTypes.add("image/x-portable-bitmap");
        allowedFileTypes.add("text/css");
        allowedFileTypes.add("text/plain");
        allowedFileTypes.add("image/apng");
        allowedFileTypes.add("image/png");
        allowedFileTypes.add("image/webp");
        allowedFileTypes.add("text/javascript");
        allowedFileTypes.add("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        allowedFileTypes.add("application/vnd.openxmlformats-officedocument.wordprocessingml.template");
        allowedFileTypes.add("application/vnd.ms-word.document.macroEnabled.12");
        allowedFileTypes.add("application/vnd.ms-word.template.macroEnabled.12");
        allowedFileTypes.add("application/vnd.ms-powerpoint");
        allowedFileTypes.add("application/vnd.openxmlformatsofficedocument.spreadsheetml.sheet");
        allowedFileTypes.add("application/vnd.openxmlformatsofficedocument.wordprocessingml.document");
    }

    public static boolean isMimeTypeAllowed(String mimeType) {
        mimeType = sanitizeMimeType(mimeType);
        return allowedFileTypes.contains(mimeType);
    }

    public static String trimWhiteSpace(String data) {
        return StringUtils.trimAllWhitespace(data);
    }

    public static long getDaysBetween(Date date1, Date date2) {
        long diffInMillSeconds = Math.abs(date1.getTime() - date2.getTime());
        return TimeUnit.DAYS.convert(diffInMillSeconds, TimeUnit.MILLISECONDS);
    }


    public static boolean isSearchKeyPresent(String searchKey) {
        return searchKey != null;
    }

    public static String parameterToViewQuery(String searchKey) {
        if (searchKey == null || searchKey.isEmpty()) {
            return null;
        }
        return "%" + searchKey + "%";
    }

    public static <D, T> D standardModelMapper(final T subject, Class<D> tClass) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STANDARD);
        return modelMapper.map(subject, tClass);
    }

    public static <D, T> List<D> standardModelsMappers(final Collection<T> entityList, Class<D> outCLass) {
        return entityList.stream()
                .map(entity -> standardModelMapper(entity, outCLass))
                .collect(Collectors.toList());
    }

    public static <S, D> D standardModelMapper(final S source, D destination) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STANDARD);
        modelMapper.map(source, destination);
        return destination;
    }

    public static <D, T> D looseModelMapper(final T subject, Class<D> tClass) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper.map(subject, tClass);
    }

    public static <D, T> List<D> looseModelsMappers(final Collection<T> entityList, Class<D> outCLass) {
        return entityList.stream()
                .map(entity -> looseModelMapper(entity, outCLass))
                .collect(Collectors.toList());
    }

    public static <S, D> D looseModelMapper(final S source, D destination) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        modelMapper.map(source, destination);
        return destination;
    }

    public static boolean isTimeValid(Date startTime, Date endTime) {
        if (startTime.after(endTime))
            return false;

        return !startTime.before(new Date());
    }
}

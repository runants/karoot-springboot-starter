package core.core.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @Author: LiuYi
 * @Date: 2023/6/2
 * @Version: 1.0.0
 * @Info:
 */
public class JacksonUtil {

    private static ObjectMapper INSTANCE = new JacksonObjectMapper();

    private static class JacksonObjectMapper extends ObjectMapper {
        private static final long serialVersionUID = 4288193147502386170L;

        public JacksonObjectMapper() {
            super();
            super.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            //单引号处理
            super.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
            //大小写不敏感
            super.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        }
    }

    public static <T> T readValue(String jsonStr, Class<T> valueType) {
        try {
            return (T) INSTANCE.readValue(jsonStr, valueType);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T readValue(String jsonStr, TypeReference<T> valueTypeRef) {
        try {
            return (T) INSTANCE.readValue(jsonStr, valueTypeRef);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static JsonNode readTree(String jsonStr) {
        try {
            return INSTANCE.readTree(jsonStr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String toJSonString(Object object) {
        try {
            return INSTANCE.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] toJSonBytes(Object object) {
        try {
            return INSTANCE.writeValueAsBytes(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}

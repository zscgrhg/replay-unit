package com.etz.replay.unit.context;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.SneakyThrows;

public class JsonUtil {
    static ObjectMapper mapper = new ObjectMapper().configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

    @SneakyThrows
    public static String toJsonString(Object obj){
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
    }
}

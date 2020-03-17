package com.etz.replay.unit.context;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public class JsonUtil {
    static ObjectMapper mapper=new ObjectMapper();

    @SneakyThrows
    public static String toJsonString(Object obj){
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
    }
}

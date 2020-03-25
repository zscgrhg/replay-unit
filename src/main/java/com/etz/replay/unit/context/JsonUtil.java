package com.etz.replay.unit.context;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.SneakyThrows;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonUtil {
    public static final Path BASE = Paths.get("C:\\data\\replay-unit\\data\\853186df\\2020-03-25--21-37-17");
    static ObjectMapper mapper = new ObjectMapper().configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

    @SneakyThrows
    public static String toJsonString(Object obj) {
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
    }

    @SneakyThrows
    public static Invocation readFrom(File jsonFile) {
        byte[] bytes = Files.readAllBytes(jsonFile.toPath());
        Invocation invocation = mapper.readerFor(Invocation.class).readValue(bytes);
        return invocation;
    }


    @SneakyThrows
    public static ParamInfo readRetValuesFrom(Long invocationId) {
        Path input = BASE.resolve(invocationId + ".out.json");
        byte[] bytes = Files.readAllBytes(input);
        ParamInfo paramInfo = mapper.readerFor(ParamInfo.class).readValue(bytes);
        Class returnedValueType = paramInfo.returnedValueType;
        String s = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(paramInfo.returned);
        Object obj = mapper.readerFor(returnedValueType).readValue(s);
        paramInfo.returned = obj;
        return paramInfo;
    }


    @SneakyThrows
    public static JsonNode readInJsonNode(Long invocationId) {
        Path input = BASE.resolve(invocationId + ".in.json");
        byte[] bytes = Files.readAllBytes(input);
        JsonNode jsonNode = mapper.readTree(bytes);
        return jsonNode;
    }

    @SneakyThrows
    public static JsonNode readOutJsonNode(Long invocationId) {
        Path input = BASE.resolve(invocationId + ".out.json");
        byte[] bytes = Files.readAllBytes(input);
        JsonNode jsonNode = mapper.readTree(bytes);
        return jsonNode;
    }
}

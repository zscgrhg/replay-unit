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
    public static final Path BASE = Paths.get("C:\\data\\replay-unit\\inputs\\984cd82f\\2020-03-22--21-22-29\\");
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
    public static ParamInfo readArgsFrom(Long invocationId) {
        Path input = BASE.resolve(invocationId + ".in.json");
        byte[] bytes = Files.readAllBytes(input);
        ParamInfo paramInfo = mapper.readerFor(ParamInfo.class).readValue(bytes);
        return paramInfo;
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
    public static Class readFromString(String className) {
        return mapper.reader(Class.class).readValue(className);
    }

    @SneakyThrows
    public static JsonNode readJsonNode(Long invocationId) {
        Path input = BASE.resolve(invocationId + ".in.json");
        byte[] bytes = Files.readAllBytes(input);
        JsonNode jsonNode = mapper.readTree(bytes);
        return jsonNode;
    }
}

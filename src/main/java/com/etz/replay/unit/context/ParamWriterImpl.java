package com.etz.replay.unit.context;

import lombok.SneakyThrows;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ParamWriterImpl implements ParamWriter {

    @Override
    @SneakyThrows
    public void write(ParamInfo paramInfo) {
        File file = new File(paramInfo.invocationId + "." + paramInfo.name + ".txt");
        Files.copy(new ByteArrayInputStream(JsonUtil.toJsonString(paramInfo).getBytes("UTF8")),
                file.toPath(),
                StandardCopyOption.REPLACE_EXISTING);
    }
    @SneakyThrows
    @Override
    public void write(InvocationContext context) {
        File file = new File(context.id + ".ctx.txt");
        Files.copy(new ByteArrayInputStream(JsonUtil.toJsonString(context.getNodes()).getBytes("UTF8")),
                file.toPath(),
                StandardCopyOption.REPLACE_EXISTING);
    }
}

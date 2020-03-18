package com.etz.replay.unit.context;

import lombok.SneakyThrows;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ParamWriterImpl implements ParamWriter {

    public static final File workspace = new File("data").toPath().resolve(ymdHmsOfNow()).toFile();

    static {
        if (!workspace.exists()) {
            workspace.mkdirs();
        }
    }

    public static String ymdHmsOfNow() {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    }

    @Override
    @SneakyThrows
    public void write(ParamInfo paramInfo) {
        Path file = workspace.toPath().resolve(paramInfo.invocationId + "." + paramInfo.name + ".json");
        Files.copy(new ByteArrayInputStream(JsonUtil.toJsonString(paramInfo).getBytes("UTF8")),
                file,
                StandardCopyOption.REPLACE_EXISTING);
    }

    @SneakyThrows
    @Override
    public void write(InvocationContext context) {

        List<Invocation> nodes = context.getNodes();
        for (Invocation node : nodes) {
            Path file = workspace.toPath().resolve(node.id + ".subject.json");
            Files.copy(new ByteArrayInputStream(JsonUtil.toJsonString(node).getBytes("UTF8")),
                    file,
                    StandardCopyOption.REPLACE_EXISTING);
        }

    }
}

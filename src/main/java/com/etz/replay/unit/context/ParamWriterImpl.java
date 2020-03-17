package com.etz.replay.unit.context;

import com.etz.replay.unit.bm.BMUtil;
import lombok.SneakyThrows;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class ParamWriterImpl implements ParamWriter {
    public static final File workspace = new File("data").toPath().resolve(Long.toHexString(System.currentTimeMillis())).toFile();

   static {
       if (!workspace.exists()) {
           workspace.mkdirs();
       }
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
        Path file = workspace.toPath().resolve(context.id + ".ctx.json");
        Files.copy(new ByteArrayInputStream(JsonUtil.toJsonString(context.getNodes()).getBytes("UTF8")),
                file,
                StandardCopyOption.REPLACE_EXISTING);
    }
}

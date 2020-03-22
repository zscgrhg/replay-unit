package com.etz.replay.unit.bm;

import com.etz.replay.unit.context.JsonUtil;
import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import lombok.SneakyThrows;
import org.jboss.byteman.agent.submit.ScriptText;

import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MustacheRuleUtil {
    @SneakyThrows
    public static String buildRule(String tmplName, Object context) {
        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache m = mf.compile(tmplName);

        StringWriter writer = new StringWriter();
        m.execute(writer, context).flush();
        return writer.toString();
    }


    @SneakyThrows
    public static ScriptText buildRule(MustacheRule mustacheRule) {
        String fileName = mustacheRule.rule;
        return new ScriptText(fileName, buildRule("btm/btm.mustache", mustacheRule));
    }

    @SneakyThrows
    public static ScriptText buildExceptionRule(RuleScope ruleScope) {
        String fileName = encode(ruleScope);
        return new ScriptText(fileName, buildRule("btm/exception.mustache", ruleScope));
    }

    @SneakyThrows
    public static ScriptText buildEntryRule(RuleScope ruleScope) {
        String fileName = encode(ruleScope);
        return new ScriptText(fileName, buildRule("btm/entry.mustache", ruleScope));
    }

    @SneakyThrows
    public static ScriptText buildExitRule(RuleScope ruleScope) {
        String fileName = encode(ruleScope);
        return new ScriptText(fileName, buildRule("btm/exit.mustache", ruleScope));
    }

    public static String encode(RuleScope ruleScope) {
        return ruleScope.getClassName() + "." + ruleScope.method;
    }

    public static List<ScriptText> buildRuleForClass(Class clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        return Stream.of(methods)
                .map(m -> new RuleScope(clazz, m))
                .flatMap(r -> Stream.of(buildEntryRule(r), buildExceptionRule(r), buildExitRule(r)))
                .collect(Collectors.toList());
    }

    @SneakyThrows
    public static List<ScriptText> wrapperExecute() {

        Method execute = Executor.class.getDeclaredMethod("execute", Runnable.class);

        String barrier = UUID.randomUUID().toString();
        MustacheRule entryExec = MustacheRule.with(execute, "@entry")
                .location("AT ENTRY")
                .condition("com.etz.replay.unit.bm.TtlUtil.setBarrier(\"" + barrier + "\")")
                /*.bind(Arrays.asList(
                        "BIND",
                        "$0.execute(com.alibaba.ttl.TtlRunnable.get($1));"))*/
                .action(Arrays.asList(
                        "$0.execute(com.alibaba.ttl.TtlRunnable.get($1));"))
                .build();

        MustacheRule exitExec = MustacheRule.with(execute, "@exit")
                .location("AT EXIT")
                .condition("true")
                /*.bind(Arrays.asList(
                        "BIND",
                        "$0.execute(com.alibaba.ttl.TtlRunnable.get($1));"))*/
                .action(Arrays.asList(
                        "com.etz.replay.unit.bm.TtlUtil.cleanBarrier(\"" + barrier + "\")"))
                .build();
        MustacheRule exceptionExitExec = MustacheRule.with(execute, "@exexit")
                .location("AT EXCEPTION EXIT")
                .condition("true")
                /*.bind(Arrays.asList(
                        "BIND",
                        "$0.execute(com.alibaba.ttl.TtlRunnable.get($1));"))*/
                .action(Arrays.asList(
                        "com.etz.replay.unit.bm.TtlUtil.cleanBarrier(\"" + barrier + "\")"))
                .build();
        return Arrays.asList(buildRule(entryExec),
                buildRule(exitExec),
                buildRule(exceptionExitExec));
    }

    public static void main(String[] args) {
        System.out.println(JsonUtil.toJsonString(wrapperExecute()));
    }
}

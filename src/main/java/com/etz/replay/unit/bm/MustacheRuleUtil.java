package com.etz.replay.unit.bm;

import com.etz.replay.unit.factory.SpecModel;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import lombok.SneakyThrows;
import org.jboss.byteman.agent.submit.ScriptText;

import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MustacheRuleUtil {
    public static final MustacheFactory mf = new DefaultTextMustacheFactory();

    public static String render(String tmpl, Object... scopes) {
        HashMap map = new HashMap();
        for (int i = 0; i < scopes.length; i++) {
            map.put(Integer.toString(i), scopes[i]);
        }
        StringWriter sw = new StringWriter();
        Mustache mustache = mf.compile(new StringReader(tmpl), "example");
        mustache.execute(sw, map);
        sw.flush();
        return sw.toString();
    }

    public static String renderSpec(SpecModel specModel) {
        StringWriter sw = new StringWriter();
        Mustache mustache = mf.compile("btm/spec.mustache");
        mustache.execute(sw, specModel);
        sw.flush();
        return sw.toString();
    }


    @SneakyThrows
    public static String buildRule(String tmplName, Object context) {

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
                .filter(m -> {
                    //不拦截私有方法和静态方法
                    int modifiers = m.getModifiers();
                    boolean isStatic = Modifier.isStatic(modifiers);
                    boolean isPrivate = Modifier.isPrivate(modifiers);
                    if (isStatic || isPrivate) {
                        return false;
                    }
                    return true;
                })
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

    }
}

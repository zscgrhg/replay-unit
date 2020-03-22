package com.etz.replay.unit.bm;

import lombok.Builder;
import lombok.Data;

import java.lang.reflect.Method;
import java.util.List;

@Data
@Builder
public class MustacheRule {
    String rule;
    String typeExpr;
    String method;
    String location;
    List<String> bind;
    String condition;
    List<String> action;

    public static MustacheRule.MustacheRuleBuilder with(Method m, String id) {
        Class<?> owner = m.getDeclaringClass();

        String gs = m.toGenericString();
        String noArgString = gs.substring(0, gs.indexOf('('));
        int idx = noArgString.lastIndexOf('.') + 1;
        String methodSign = gs.substring(idx);

        MustacheRuleBuilder ruleBuilder = builder().rule(owner.getName() + "." + gs + id);
        if (owner.isInterface()) {
            ruleBuilder = ruleBuilder.typeExpr("INTERFACE ^" + owner.getName());
        } else {
            ruleBuilder = ruleBuilder.typeExpr("CLASS ^" + owner.getName());
        }
        return ruleBuilder.method(methodSign);
    }
}

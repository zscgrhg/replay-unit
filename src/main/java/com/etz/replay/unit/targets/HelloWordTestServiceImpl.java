package com.etz.replay.unit.targets;

import com.etz.replay.unit.context.Provided;
import com.etz.replay.unit.context.TestSubject;

@TestSubject
public class HelloWordTestServiceImpl implements HelloWordTestService {
    @Provided
    AOuterService aOuterService = new AOuterServiceImpl();

    @Override
    public String doBusiness(String req, @Provided ProvidedA providedA) {


        String haha = providedA.sayHelloFromProviderA(req);
        String aName = aOuterService.getAName(new String[]{haha});
        for (int i = 0; i < 3; i++) {
            aOuterService.getAName(new String[]{haha});
        }
        return aName;
    }
}

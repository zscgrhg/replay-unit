package com.etz.replay.unit.targets;


import com.etz.replay.unit.context.Subject;

@Subject
public class HelloWordTestServiceImpl implements HelloWordTestService {

    AOuterService aOuterService = new AOuterServiceImpl();

    @Override
    public String doBusiness(String req) {


        String aName = aOuterService.getAName(new String[]{req + " delegate to aOuterService"});
        for (int i = 0; i < 3; i++) {
            aOuterService.getAName(new String[]{req + " delegate to aOuterService"});
        }
        return aName;
    }
}

package com.etz.replay.unit.targets;



public class HelloWordTestServiceImpl implements HelloWordTestService {

    AOuterService aOuterService = new AOuterServiceImpl();

    @Override
    public String doBusiness(String req) {


        String aName = aOuterService.getAName(req+" delegate to aOuterService");
        for (int i = 0; i < 3; i++) {
            aOuterService.getAName(req+" delegate to aOuterService");
        }
        return aName;
    }
}

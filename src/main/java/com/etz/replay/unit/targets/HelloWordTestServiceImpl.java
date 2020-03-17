package com.etz.replay.unit.targets;



public class HelloWordTestServiceImpl implements HelloWordTestService {

    AOuterService aOuterService = new AOuterServiceImpl();

    @Override
    public String doBusiness(String req) {


        String aName = aOuterService.getAName(req);

        return aName;
    }
}

package com.etz.pkg20200326224538

import spock.lang.Specification

class ServiceCImpldoServiceC557Spec extends Specification {
    void verifydoServiceC() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceCImpl()
        when:
        def ret = subject.doServiceC(*INPUTS557)
        then:
        ret == RETURNED557
    }


    static final def INPUTS557 = [
            17
    ]

    static final def OUTPUTS557 = [
            17
    ]

    static final def RETURNED557 = 289


}
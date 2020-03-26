package com.etz.pkg20200326224538

import spock.lang.Specification

class ServiceCImpldoServiceC697Spec extends Specification {
    void verifydoServiceC() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceCImpl()
        when:
        def ret = subject.doServiceC(*INPUTS697)
        then:
        ret == RETURNED697
    }


    static final def INPUTS697 = [
            3
    ]

    static final def OUTPUTS697 = [
            3
    ]

    static final def RETURNED697 = 9


}
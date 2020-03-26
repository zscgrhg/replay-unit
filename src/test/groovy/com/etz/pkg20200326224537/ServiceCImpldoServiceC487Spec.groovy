package com.etz.pkg20200326224538

import spock.lang.Specification

class ServiceCImpldoServiceC487Spec extends Specification {
    void verifydoServiceC() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceCImpl()
        when:
        def ret = subject.doServiceC(*INPUTS487)
        then:
        ret == RETURNED487
    }


    static final def INPUTS487 = [
            1
    ]

    static final def OUTPUTS487 = [
            1
    ]

    static final def RETURNED487 = 1


}
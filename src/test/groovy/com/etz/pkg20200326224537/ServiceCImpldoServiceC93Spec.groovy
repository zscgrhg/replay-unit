package com.etz.pkg20200326224538

import spock.lang.Specification

class ServiceCImpldoServiceC93Spec extends Specification {
    void verifydoServiceC() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceCImpl()
        when:
        def ret = subject.doServiceC(*INPUTS93)
        then:
        ret == RETURNED93
    }


    static final def INPUTS93 = [
            17
    ]

    static final def OUTPUTS93 = [
            17
    ]

    static final def RETURNED93 = 289


}
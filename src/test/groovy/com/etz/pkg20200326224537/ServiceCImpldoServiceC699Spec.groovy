package com.etz.pkg20200326224538

import spock.lang.Specification

class ServiceCImpldoServiceC699Spec extends Specification {
    void verifydoServiceC() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceCImpl()
        when:
        def ret = subject.doServiceC(*INPUTS699)
        then:
        ret == RETURNED699
    }


    static final def INPUTS699 = [
            3
    ]

    static final def OUTPUTS699 = [
            3
    ]

    static final def RETURNED699 = 9


}
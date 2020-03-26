package com.etz.pkg20200326214327

import spock.lang.Specification

class ServiceCImpldoServiceC134Spec extends Specification {
    void verifydoServiceC() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceCImpl()
        when:
        def ret = subject.doServiceC(*INPUTS134)
        then:
        ret == RETURNED134
    }


    static final def INPUTS134 = [
            13
    ]

    static final def OUTPUTS134 = [
            13
    ]

    static final def RETURNED134 = 169


}
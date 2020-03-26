package com.etz.pkg20200326214327

import spock.lang.Specification

class ServiceCImpldoServiceC139Spec extends Specification {
    void verifydoServiceC() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceCImpl()
        when:
        def ret = subject.doServiceC(*INPUTS139)
        then:
        ret == RETURNED139
    }


    static final def INPUTS139 = [
            13
    ]

    static final def OUTPUTS139 = [
            13
    ]

    static final def RETURNED139 = 169


}
package com.etz.pkg20200326224537

import spock.lang.Specification

class ServiceCImpldoServiceC419Spec extends Specification {
    void verifydoServiceC() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceCImpl()
        when:
        def ret = subject.doServiceC(*INPUTS419)
        then:
        ret == RETURNED419
    }


    static final def INPUTS419 = [
            12
    ]

    static final def OUTPUTS419 = [
            12
    ]

    static final def RETURNED419 = 144


}
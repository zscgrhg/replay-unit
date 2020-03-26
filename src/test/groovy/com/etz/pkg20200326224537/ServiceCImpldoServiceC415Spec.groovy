package com.etz.pkg20200326224537

import spock.lang.Specification

class ServiceCImpldoServiceC415Spec extends Specification {
    void verifydoServiceC() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceCImpl()
        when:
        def ret = subject.doServiceC(*INPUTS415)
        then:
        ret == RETURNED415
    }


    static final def INPUTS415 = [
            12
    ]

    static final def OUTPUTS415 = [
            12
    ]

    static final def RETURNED415 = 144


}
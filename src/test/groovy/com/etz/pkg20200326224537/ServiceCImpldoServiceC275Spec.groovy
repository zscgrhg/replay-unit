package com.etz.pkg20200326224537

import spock.lang.Specification

class ServiceCImpldoServiceC275Spec extends Specification {
    void verifydoServiceC() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceCImpl()
        when:
        def ret = subject.doServiceC(*INPUTS275)
        then:
        ret == RETURNED275
    }


    static final def INPUTS275 = [
            18
    ]

    static final def OUTPUTS275 = [
            18
    ]

    static final def RETURNED275 = 324


}
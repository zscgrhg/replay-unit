package com.etz.pkg20200326224537

import spock.lang.Specification

class ServiceCImpldoServiceC349Spec extends Specification {
    void verifydoServiceC() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceCImpl()
        when:
        def ret = subject.doServiceC(*INPUTS349)
        then:
        ret == RETURNED349
    }


    static final def INPUTS349 = [
            11
    ]

    static final def OUTPUTS349 = [
            11
    ]

    static final def RETURNED349 = 121


}
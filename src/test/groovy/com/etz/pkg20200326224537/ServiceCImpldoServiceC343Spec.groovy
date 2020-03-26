package com.etz.pkg20200326224537

import spock.lang.Specification

class ServiceCImpldoServiceC343Spec extends Specification {
    void verifydoServiceC() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceCImpl()
        when:
        def ret = subject.doServiceC(*INPUTS343)
        then:
        ret == RETURNED343
    }


    static final def INPUTS343 = [
            11
    ]

    static final def OUTPUTS343 = [
            11
    ]

    static final def RETURNED343 = 121


}
package com.etz.pkg20200326224537

import spock.lang.Specification

class ServiceCImpldoServiceC209Spec extends Specification {
    void verifydoServiceC() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceCImpl()
        when:
        def ret = subject.doServiceC(*INPUTS209)
        then:
        ret == RETURNED209
    }


    static final def INPUTS209 = [
            11
    ]

    static final def OUTPUTS209 = [
            11
    ]

    static final def RETURNED209 = 121


}
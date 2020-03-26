package com.etz.pkg20200326214327

import spock.lang.Specification

class ServiceCImpldoServiceC65Spec extends Specification {
    void verifydoServiceC() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceCImpl()
        when:
        def ret = subject.doServiceC(*INPUTS65)
        then:
        ret == RETURNED65
    }


    static final def INPUTS65 = [
            4
    ]

    static final def OUTPUTS65 = [
            4
    ]

    static final def RETURNED65 = 16


}
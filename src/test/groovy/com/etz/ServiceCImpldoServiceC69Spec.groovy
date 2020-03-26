package com.etz.pkg20200326214327

import spock.lang.Specification

class ServiceCImpldoServiceC69Spec extends Specification {
    void verifydoServiceC() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceCImpl()
        when:
        def ret = subject.doServiceC(*INPUTS69)
        then:
        ret == RETURNED69
    }


    static final def INPUTS69 = [
            4
    ]

    static final def OUTPUTS69 = [
            4
    ]

    static final def RETURNED69 = 16


}
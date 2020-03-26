package com.etz.pkg20200326214327

import spock.lang.Specification

class ServiceCImpldoServiceC23Spec extends Specification {
    void verifydoServiceC() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceCImpl()
        when:
        def ret = subject.doServiceC(*INPUTS23)
        then:
        ret == RETURNED23
    }


    static final def INPUTS23 = [
            0
    ]

    static final def OUTPUTS23 = [
            0
    ]

    static final def RETURNED23 = 0


}
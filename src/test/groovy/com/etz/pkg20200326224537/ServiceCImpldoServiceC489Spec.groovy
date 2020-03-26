package com.etz.pkg20200326224538

import spock.lang.Specification

class ServiceCImpldoServiceC489Spec extends Specification {
    void verifydoServiceC() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceCImpl()
        when:
        def ret = subject.doServiceC(*INPUTS489)
        then:
        ret == RETURNED489
    }


    static final def INPUTS489 = [
            1
    ]

    static final def OUTPUTS489 = [
            1
    ]

    static final def RETURNED489 = 1


}
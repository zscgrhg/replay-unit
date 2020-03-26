package com.etz.pkg20200326224537

import spock.lang.Specification

class ServiceCImpldoServiceC279Spec extends Specification {
    void verifydoServiceC() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceCImpl()
        when:
        def ret = subject.doServiceC(*INPUTS279)
        then:
        ret == RETURNED279
    }


    static final def INPUTS279 = [
            18
    ]

    static final def OUTPUTS279 = [
            18
    ]

    static final def RETURNED279 = 324


}
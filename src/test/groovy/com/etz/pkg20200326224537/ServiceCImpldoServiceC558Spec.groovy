package com.etz.pkg20200326224538

import spock.lang.Specification

class ServiceCImpldoServiceC558Spec extends Specification {
    void verifydoServiceC() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceCImpl()
        when:
        def ret = subject.doServiceC(*INPUTS558)
        then:
        ret == RETURNED558
    }


    static final def INPUTS558 = [
            17
    ]

    static final def OUTPUTS558 = [
            17
    ]

    static final def RETURNED558 = 289


}
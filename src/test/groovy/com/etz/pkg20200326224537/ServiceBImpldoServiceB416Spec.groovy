package com.etz.pkg20200326224537

import spock.lang.Specification

class ServiceBImpldoServiceB416Spec extends Specification {
    void verifydoServiceB() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceBImpl()
        when:
        def ret = subject.doServiceB(*INPUTS416)
        then:
        ret == RETURNED416
    }


    static final def INPUTS416 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]

    static final def OUTPUTS416 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]

    static final def RETURNED416 = 'null<>null'


}
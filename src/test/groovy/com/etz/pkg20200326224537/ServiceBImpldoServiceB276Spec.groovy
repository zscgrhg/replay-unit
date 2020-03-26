package com.etz.pkg20200326224537

import spock.lang.Specification

class ServiceBImpldoServiceB276Spec extends Specification {
    void verifydoServiceB() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceBImpl()
        when:
        def ret = subject.doServiceB(*INPUTS276)
        then:
        ret == RETURNED276
    }


    static final def INPUTS276 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]

    static final def OUTPUTS276 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]

    static final def RETURNED276 = 'null<>null'


}
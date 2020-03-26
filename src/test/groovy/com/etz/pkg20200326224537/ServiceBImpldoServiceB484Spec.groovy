package com.etz.pkg20200326224538

import spock.lang.Specification

class ServiceBImpldoServiceB484Spec extends Specification {
    void verifydoServiceB() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceBImpl()
        when:
        def ret = subject.doServiceB(*INPUTS484)
        then:
        ret == RETURNED484
    }


    static final def INPUTS484 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]

    static final def OUTPUTS484 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]

    static final def RETURNED484 = 'null<>null'


}
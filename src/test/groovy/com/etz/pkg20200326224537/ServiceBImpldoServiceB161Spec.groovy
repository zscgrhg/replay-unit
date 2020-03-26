package com.etz.pkg20200326224537

import spock.lang.Specification

class ServiceBImpldoServiceB161Spec extends Specification {
    void verifydoServiceB() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceBImpl()
        when:
        def ret = subject.doServiceB(*INPUTS161)
        then:
        ret == RETURNED161
    }


    static final def INPUTS161 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]

    static final def OUTPUTS161 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]

    static final def RETURNED161 = 'null<>null'


}
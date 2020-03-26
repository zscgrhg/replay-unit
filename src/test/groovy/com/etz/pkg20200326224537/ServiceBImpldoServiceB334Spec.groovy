package com.etz.pkg20200326224537

import spock.lang.Specification

class ServiceBImpldoServiceB334Spec extends Specification {
    void verifydoServiceB() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceBImpl()
        when:
        def ret = subject.doServiceB(*INPUTS334)
        then:
        ret == RETURNED334
    }


    static final def INPUTS334 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]

    static final def OUTPUTS334 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]

    static final def RETURNED334 = 'null<>null'


}
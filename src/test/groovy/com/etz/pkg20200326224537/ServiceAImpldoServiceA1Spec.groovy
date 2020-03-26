package com.etz.pkg20200326224537

import spock.lang.Specification

class ServiceAImpldoServiceA1Spec extends Specification {
    void verifydoServiceA() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceAImpl()
        subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
            1 * doServiceB({ p0 -> p0 == INPUTS21[0] }) >> RETURNED21
        }
        subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
            1 * makeX({ p0 -> p0 == INPUTS3[0] }, { p1 -> p1 == INPUTS3[1] }, { p2 -> p2 == INPUTS3[2] }) >> RETURNED3
            1 * makeX({ p0 -> p0 == INPUTS4[0] }, { p1 -> p1 == INPUTS4[1] }, { p2 -> p2 == INPUTS4[2] }) >> RETURNED4
            1 * makeX({ p0 -> p0 == INPUTS6[0] }, { p1 -> p1 == INPUTS6[1] }, { p2 -> p2 == INPUTS6[2] }) >> RETURNED6
            1 * makeX({ p0 -> p0 == INPUTS5[0] }, { p1 -> p1 == INPUTS5[1] }, { p2 -> p2 == INPUTS5[2] }) >> RETURNED5
            1 * makeX({ p0 -> p0 == INPUTS10[0] }, { p1 -> p1 == INPUTS10[1] }, { p2 -> p2 == INPUTS10[2] }) >> RETURNED10
            1 * makeX({ p0 -> p0 == INPUTS9[0] }, { p1 -> p1 == INPUTS9[1] }, { p2 -> p2 == INPUTS9[2] }) >> RETURNED9
            1 * makeX({ p0 -> p0 == INPUTS15[0] }, { p1 -> p1 == INPUTS15[1] }, { p2 -> p2 == INPUTS15[2] }) >> RETURNED15
            1 * makeX({ p0 -> p0 == INPUTS16[0] }, { p1 -> p1 == INPUTS16[1] }, { p2 -> p2 == INPUTS16[2] }) >> RETURNED16
            1 * makeX({ p0 -> p0 == INPUTS17[0] }, { p1 -> p1 == INPUTS17[1] }, { p2 -> p2 == INPUTS17[2] }) >> RETURNED17
        }
        subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
            1 * doServiceC({ p0 -> p0 == INPUTS23[0] }) >> RETURNED23
        }
        when:
        def ret = subject.doServiceA(*INPUTS1)
        then:
        ret == RETURNED1
    }


    static final def INPUTS1 = [
            't',
            14,
            [
                    fieldFromX: 'fieldFromX',
                    dataFromX : 'dataFromX',
                    dataY     : [
                            fieldFromY: null,
                            dataFromY : null,
                            dataZArr  : [
                                    [
                                            fieldFromZ: null,
                                            dataFromZ : null,
                                    ] as com.etz.replay.unit.targets.DataZ,
                                    [
                                            fieldFromZ: null,
                                            dataFromZ : null,
                                    ] as com.etz.replay.unit.targets.DataZ,
                                    [
                                            fieldFromZ: null,
                                            dataFromZ : null,
                                    ] as com.etz.replay.unit.targets.DataZ,
                            ],
                    ] as com.etz.replay.unit.targets.DataY,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS23 = [
            14
    ]
    static final def INPUTS3 = [
            't',
            'x',
            6
    ]
    static final def INPUTS4 = [
            't',
            'x',
            8
    ]
    static final def INPUTS15 = [
            't',
            'x',
            5
    ]
    static final def INPUTS5 = [
            't',
            'x',
            7
    ]
    static final def INPUTS16 = [
            't',
            'x',
            9
    ]
    static final def INPUTS6 = [
            't',
            'x',
            2
    ]
    static final def INPUTS17 = [
            't',
            'x',
            1
    ]
    static final def INPUTS9 = [
            't',
            'x',
            4
    ]
    static final def INPUTS10 = [
            't',
            'x',
            3
    ]
    static final def INPUTS21 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]

    static final def OUTPUTS1 = [
            't',
            14,
            [
                    fieldFromX: 'fieldFromX',
                    dataFromX : 'dataFromX',
                    dataY     : [
                            fieldFromY: null,
                            dataFromY : null,
                            dataZArr  : [
                                    [
                                            fieldFromZ: null,
                                            dataFromZ : null,
                                    ] as com.etz.replay.unit.targets.DataZ,
                                    [
                                            fieldFromZ: null,
                                            dataFromZ : null,
                                    ] as com.etz.replay.unit.targets.DataZ,
                                    [
                                            fieldFromZ: null,
                                            dataFromZ : null,
                                    ] as com.etz.replay.unit.targets.DataZ,
                            ],
                    ] as com.etz.replay.unit.targets.DataY,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS23 = [
            14
    ]
    static final def OUTPUTS3 = [
            't',
            'x',
            6
    ]
    static final def OUTPUTS4 = [
            't',
            'x',
            8
    ]
    static final def OUTPUTS15 = [
            't',
            'x',
            5
    ]
    static final def OUTPUTS5 = [
            't',
            'x',
            7
    ]
    static final def OUTPUTS16 = [
            't',
            'x',
            9
    ]
    static final def OUTPUTS6 = [
            't',
            'x',
            2
    ]
    static final def OUTPUTS17 = [
            't',
            'x',
            1
    ]
    static final def OUTPUTS9 = [
            't',
            'x',
            4
    ]
    static final def OUTPUTS10 = [
            't',
            'x',
            3
    ]
    static final def OUTPUTS21 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]

    static final def RETURNED1 = [
            dataX       : [
                    fieldFromX: 't',
                    dataFromX : 'x',
                    dataY     : [
                            fieldFromY: null,
                            dataFromY : null,
                            dataZArr  : [
                                    [
                                            fieldFromZ: null,
                                            dataFromZ : null,
                                    ] as com.etz.replay.unit.targets.DataZ,
                                    [
                                            fieldFromZ: null,
                                            dataFromZ : null,
                                    ] as com.etz.replay.unit.targets.DataZ,
                                    [
                                            fieldFromZ: null,
                                            dataFromZ : null,
                                    ] as com.etz.replay.unit.targets.DataZ,
                            ],
                    ] as com.etz.replay.unit.targets.DataY,
            ] as com.etz.replay.unit.targets.DataX,
            fromServiceB: 'null<>null',
            fromServiceC: 196,
    ] as com.etz.replay.unit.targets.ServiceData

    static final def RETURNED23 = 196

    static final def RETURNED3 = [
            fieldFromX: 't',
            dataFromX : 'x',
            dataY     : [
                    fieldFromY: null,
                    dataFromY : null,
                    dataZArr  : [
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                    ],
            ] as com.etz.replay.unit.targets.DataY,
    ] as com.etz.replay.unit.targets.DataX

    static final def RETURNED4 = [
            fieldFromX: 't',
            dataFromX : 'x',
            dataY     : [
                    fieldFromY: null,
                    dataFromY : null,
                    dataZArr  : [
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                    ],
            ] as com.etz.replay.unit.targets.DataY,
    ] as com.etz.replay.unit.targets.DataX

    static final def RETURNED15 = [
            fieldFromX: 't',
            dataFromX : 'x',
            dataY     : [
                    fieldFromY: null,
                    dataFromY : null,
                    dataZArr  : [
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                    ],
            ] as com.etz.replay.unit.targets.DataY,
    ] as com.etz.replay.unit.targets.DataX

    static final def RETURNED5 = [
            fieldFromX: 't',
            dataFromX : 'x',
            dataY     : [
                    fieldFromY: null,
                    dataFromY : null,
                    dataZArr  : [
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                    ],
            ] as com.etz.replay.unit.targets.DataY,
    ] as com.etz.replay.unit.targets.DataX

    static final def RETURNED16 = [
            fieldFromX: 't',
            dataFromX : 'x',
            dataY     : [
                    fieldFromY: null,
                    dataFromY : null,
                    dataZArr  : [
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                    ],
            ] as com.etz.replay.unit.targets.DataY,
    ] as com.etz.replay.unit.targets.DataX

    static final def RETURNED6 = [
            fieldFromX: 't',
            dataFromX : 'x',
            dataY     : [
                    fieldFromY: null,
                    dataFromY : null,
                    dataZArr  : [
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                    ],
            ] as com.etz.replay.unit.targets.DataY,
    ] as com.etz.replay.unit.targets.DataX

    static final def RETURNED17 = [
            fieldFromX: 't',
            dataFromX : 'x',
            dataY     : [
                    fieldFromY: null,
                    dataFromY : null,
                    dataZArr  : [
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                    ],
            ] as com.etz.replay.unit.targets.DataY,
    ] as com.etz.replay.unit.targets.DataX

    static final def RETURNED9 = [
            fieldFromX: 't',
            dataFromX : 'x',
            dataY     : [
                    fieldFromY: null,
                    dataFromY : null,
                    dataZArr  : [
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                    ],
            ] as com.etz.replay.unit.targets.DataY,
    ] as com.etz.replay.unit.targets.DataX

    static final def RETURNED10 = [
            fieldFromX: 't',
            dataFromX : 'x',
            dataY     : [
                    fieldFromY: null,
                    dataFromY : null,
                    dataZArr  : [
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                            [
                                    fieldFromZ: null,
                                    dataFromZ : null,
                            ] as com.etz.replay.unit.targets.DataZ,
                    ],
            ] as com.etz.replay.unit.targets.DataY,
    ] as com.etz.replay.unit.targets.DataX

    static final def RETURNED21 = 'null<>null'


}
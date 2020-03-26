package com.etz.pkg20200326224538

import spock.lang.Specification

class ServiceAImpldoServiceA71Spec extends Specification {
    void verifydoServiceA() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceAImpl()
        subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
            1 * doServiceB({ p0 -> p0 == INPUTS91[0] }) >> RETURNED91
        }
        subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
            1 * makeX({ p0 -> p0 == INPUTS75[0] }, { p1 -> p1 == INPUTS75[1] }, { p2 -> p2 == INPUTS75[2] }) >> RETURNED75
            1 * makeX({ p0 -> p0 == INPUTS77[0] }, { p1 -> p1 == INPUTS77[1] }, { p2 -> p2 == INPUTS77[2] }) >> RETURNED77
            1 * makeX({ p0 -> p0 == INPUTS74[0] }, { p1 -> p1 == INPUTS74[1] }, { p2 -> p2 == INPUTS74[2] }) >> RETURNED74
            1 * makeX({ p0 -> p0 == INPUTS81[0] }, { p1 -> p1 == INPUTS81[1] }, { p2 -> p2 == INPUTS81[2] }) >> RETURNED81
            1 * makeX({ p0 -> p0 == INPUTS79[0] }, { p1 -> p1 == INPUTS79[1] }, { p2 -> p2 == INPUTS79[2] }) >> RETURNED79
            1 * makeX({ p0 -> p0 == INPUTS80[0] }, { p1 -> p1 == INPUTS80[1] }, { p2 -> p2 == INPUTS80[2] }) >> RETURNED80
            1 * makeX({ p0 -> p0 == INPUTS73[0] }, { p1 -> p1 == INPUTS73[1] }, { p2 -> p2 == INPUTS73[2] }) >> RETURNED73
            1 * makeX({ p0 -> p0 == INPUTS82[0] }, { p1 -> p1 == INPUTS82[1] }, { p2 -> p2 == INPUTS82[2] }) >> RETURNED82
            1 * makeX({ p0 -> p0 == INPUTS89[0] }, { p1 -> p1 == INPUTS89[1] }, { p2 -> p2 == INPUTS89[2] }) >> RETURNED89
        }
        subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
            1 * doServiceC({ p0 -> p0 == INPUTS93[0] }) >> RETURNED93
        }
        when:
        def ret = subject.doServiceA(*INPUTS71)
        then:
        ret == RETURNED71
    }


    static final def INPUTS77 = [
            't',
            'x',
            1
    ]
    static final def INPUTS89 = [
            't',
            'x',
            9
    ]
    static final def INPUTS79 = [
            't',
            'x',
            8
    ]
    static final def INPUTS80 = [
            't',
            'x',
            3
    ]
    static final def INPUTS91 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS81 = [
            't',
            'x',
            2
    ]
    static final def INPUTS71 = [
            't',
            17,
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
    static final def INPUTS82 = [
            't',
            'x',
            7
    ]
    static final def INPUTS93 = [
            17
    ]
    static final def INPUTS73 = [
            't',
            'x',
            6
    ]
    static final def INPUTS74 = [
            't',
            'x',
            5
    ]
    static final def INPUTS75 = [
            't',
            'x',
            4
    ]

    static final def OUTPUTS77 = [
            't',
            'x',
            1
    ]
    static final def OUTPUTS89 = [
            't',
            'x',
            9
    ]
    static final def OUTPUTS79 = [
            't',
            'x',
            8
    ]
    static final def OUTPUTS80 = [
            't',
            'x',
            3
    ]
    static final def OUTPUTS91 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS81 = [
            't',
            'x',
            2
    ]
    static final def OUTPUTS71 = [
            't',
            17,
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
    static final def OUTPUTS82 = [
            't',
            'x',
            7
    ]
    static final def OUTPUTS93 = [
            17
    ]
    static final def OUTPUTS73 = [
            't',
            'x',
            6
    ]
    static final def OUTPUTS74 = [
            't',
            'x',
            5
    ]
    static final def OUTPUTS75 = [
            't',
            'x',
            4
    ]

    static final def RETURNED77 = [
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

    static final def RETURNED89 = [
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

    static final def RETURNED79 = [
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

    static final def RETURNED80 = [
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

    static final def RETURNED91 = 'null<>null'

    static final def RETURNED81 = [
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

    static final def RETURNED71 = [
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
            fromServiceC: 289,
    ] as com.etz.replay.unit.targets.ServiceData

    static final def RETURNED82 = [
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

    static final def RETURNED93 = 289

    static final def RETURNED73 = [
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

    static final def RETURNED74 = [
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

    static final def RETURNED75 = [
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


}
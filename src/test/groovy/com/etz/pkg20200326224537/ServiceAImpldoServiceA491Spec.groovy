package com.etz.pkg20200326224538

import spock.lang.Specification

class ServiceAImpldoServiceA491Spec extends Specification {
    void verifydoServiceA() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceAImpl()
        subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
            1 * doServiceB({ p0 -> p0 == INPUTS511[0] }) >> RETURNED511
        }
        subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
            1 * makeX({ p0 -> p0 == INPUTS494[0] }, { p1 -> p1 == INPUTS494[1] }, { p2 -> p2 == INPUTS494[2] }) >> RETURNED494
            1 * makeX({ p0 -> p0 == INPUTS493[0] }, { p1 -> p1 == INPUTS493[1] }, { p2 -> p2 == INPUTS493[2] }) >> RETURNED493
            1 * makeX({ p0 -> p0 == INPUTS496[0] }, { p1 -> p1 == INPUTS496[1] }, { p2 -> p2 == INPUTS496[2] }) >> RETURNED496
            1 * makeX({ p0 -> p0 == INPUTS497[0] }, { p1 -> p1 == INPUTS497[1] }, { p2 -> p2 == INPUTS497[2] }) >> RETURNED497
            1 * makeX({ p0 -> p0 == INPUTS495[0] }, { p1 -> p1 == INPUTS495[1] }, { p2 -> p2 == INPUTS495[2] }) >> RETURNED495
            1 * makeX({ p0 -> p0 == INPUTS498[0] }, { p1 -> p1 == INPUTS498[1] }, { p2 -> p2 == INPUTS498[2] }) >> RETURNED498
            1 * makeX({ p0 -> p0 == INPUTS506[0] }, { p1 -> p1 == INPUTS506[1] }, { p2 -> p2 == INPUTS506[2] }) >> RETURNED506
            1 * makeX({ p0 -> p0 == INPUTS505[0] }, { p1 -> p1 == INPUTS505[1] }, { p2 -> p2 == INPUTS505[2] }) >> RETURNED505
            1 * makeX({ p0 -> p0 == INPUTS507[0] }, { p1 -> p1 == INPUTS507[1] }, { p2 -> p2 == INPUTS507[2] }) >> RETURNED507
        }
        subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
            1 * doServiceC({ p0 -> p0 == INPUTS513[0] }) >> RETURNED513
        }
        when:
        def ret = subject.doServiceA(*INPUTS491)
        then:
        ret == RETURNED491
    }


    static final def INPUTS495 = [
            't',
            'x',
            8
    ]
    static final def INPUTS496 = [
            't',
            'x',
            2
    ]
    static final def INPUTS497 = [
            't',
            'x',
            4
    ]
    static final def INPUTS498 = [
            't',
            'x',
            5
    ]
    static final def INPUTS511 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS513 = [
            18
    ]
    static final def INPUTS505 = [
            't',
            'x',
            7
    ]
    static final def INPUTS506 = [
            't',
            'x',
            1
    ]
    static final def INPUTS491 = [
            't',
            18,
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
    static final def INPUTS507 = [
            't',
            'x',
            9
    ]
    static final def INPUTS493 = [
            't',
            'x',
            6
    ]
    static final def INPUTS494 = [
            't',
            'x',
            3
    ]

    static final def OUTPUTS495 = [
            't',
            'x',
            8
    ]
    static final def OUTPUTS496 = [
            't',
            'x',
            2
    ]
    static final def OUTPUTS497 = [
            't',
            'x',
            4
    ]
    static final def OUTPUTS498 = [
            't',
            'x',
            5
    ]
    static final def OUTPUTS511 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS513 = [
            18
    ]
    static final def OUTPUTS505 = [
            't',
            'x',
            7
    ]
    static final def OUTPUTS506 = [
            't',
            'x',
            1
    ]
    static final def OUTPUTS491 = [
            't',
            18,
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
    static final def OUTPUTS507 = [
            't',
            'x',
            9
    ]
    static final def OUTPUTS493 = [
            't',
            'x',
            6
    ]
    static final def OUTPUTS494 = [
            't',
            'x',
            3
    ]

    static final def RETURNED495 = [
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

    static final def RETURNED496 = [
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

    static final def RETURNED497 = [
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

    static final def RETURNED498 = [
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

    static final def RETURNED511 = 'null<>null'

    static final def RETURNED513 = 324

    static final def RETURNED505 = [
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

    static final def RETURNED506 = [
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

    static final def RETURNED491 = [
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
            fromServiceC: 324,
    ] as com.etz.replay.unit.targets.ServiceData

    static final def RETURNED507 = [
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

    static final def RETURNED493 = [
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

    static final def RETURNED494 = [
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
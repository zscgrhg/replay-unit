package com.etz.pkg20200326224538

import spock.lang.Specification

class ServiceAImplhello515Spec extends Specification {
    void verifyhello() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceAImpl()
        subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
            1 * doServiceB({ p0 -> p0 == INPUTS553[0] }) >> RETURNED553
            1 * doServiceB({ p0 -> p0 == INPUTS554[0] }) >> RETURNED554
        }
        subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
            1 * makeX({ p0 -> p0 == INPUTS518[0] }, { p1 -> p1 == INPUTS518[1] }, { p2 -> p2 == INPUTS518[2] }) >> RETURNED518
            1 * makeX({ p0 -> p0 == INPUTS522[0] }, { p1 -> p1 == INPUTS522[1] }, { p2 -> p2 == INPUTS522[2] }) >> RETURNED522
            1 * makeX({ p0 -> p0 == INPUTS521[0] }, { p1 -> p1 == INPUTS521[1] }, { p2 -> p2 == INPUTS521[2] }) >> RETURNED521
            1 * makeX({ p0 -> p0 == INPUTS525[0] }, { p1 -> p1 == INPUTS525[1] }, { p2 -> p2 == INPUTS525[2] }) >> RETURNED525
            1 * makeX({ p0 -> p0 == INPUTS527[0] }, { p1 -> p1 == INPUTS527[1] }, { p2 -> p2 == INPUTS527[2] }) >> RETURNED527
            1 * makeX({ p0 -> p0 == INPUTS529[0] }, { p1 -> p1 == INPUTS529[1] }, { p2 -> p2 == INPUTS529[2] }) >> RETURNED529
            1 * makeX({ p0 -> p0 == INPUTS531[0] }, { p1 -> p1 == INPUTS531[1] }, { p2 -> p2 == INPUTS531[2] }) >> RETURNED531
            1 * makeX({ p0 -> p0 == INPUTS533[0] }, { p1 -> p1 == INPUTS533[1] }, { p2 -> p2 == INPUTS533[2] }) >> RETURNED533
            1 * makeX({ p0 -> p0 == INPUTS535[0] }, { p1 -> p1 == INPUTS535[1] }, { p2 -> p2 == INPUTS535[2] }) >> RETURNED535
            1 * makeX({ p0 -> p0 == INPUTS537[0] }, { p1 -> p1 == INPUTS537[1] }, { p2 -> p2 == INPUTS537[2] }) >> RETURNED537
            1 * makeX({ p0 -> p0 == INPUTS520[0] }, { p1 -> p1 == INPUTS520[1] }, { p2 -> p2 == INPUTS520[2] }) >> RETURNED520
            1 * makeX({ p0 -> p0 == INPUTS539[0] }, { p1 -> p1 == INPUTS539[1] }, { p2 -> p2 == INPUTS539[2] }) >> RETURNED539
            1 * makeX({ p0 -> p0 == INPUTS542[0] }, { p1 -> p1 == INPUTS542[1] }, { p2 -> p2 == INPUTS542[2] }) >> RETURNED542
            1 * makeX({ p0 -> p0 == INPUTS543[0] }, { p1 -> p1 == INPUTS543[1] }, { p2 -> p2 == INPUTS543[2] }) >> RETURNED543
            1 * makeX({ p0 -> p0 == INPUTS546[0] }, { p1 -> p1 == INPUTS546[1] }, { p2 -> p2 == INPUTS546[2] }) >> RETURNED546
            1 * makeX({ p0 -> p0 == INPUTS547[0] }, { p1 -> p1 == INPUTS547[1] }, { p2 -> p2 == INPUTS547[2] }) >> RETURNED547
            1 * makeX({ p0 -> p0 == INPUTS519[0] }, { p1 -> p1 == INPUTS519[1] }, { p2 -> p2 == INPUTS519[2] }) >> RETURNED519
            1 * makeX({ p0 -> p0 == INPUTS517[0] }, { p1 -> p1 == INPUTS517[1] }, { p2 -> p2 == INPUTS517[2] }) >> RETURNED517
        }
        subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
            1 * doServiceC({ p0 -> p0 == INPUTS557[0] }) >> RETURNED557
            1 * doServiceC({ p0 -> p0 == INPUTS558[0] }) >> RETURNED558
        }
        when:
        def ret = subject.hello(*INPUTS515)
        then:
        ret == RETURNED515
    }


    static final def INPUTS531 = [
            't2',
            'x',
            3
    ]
    static final def INPUTS520 = [
            't2',
            'x',
            8
    ]
    static final def INPUTS542 = [
            't2',
            'x',
            7
    ]
    static final def INPUTS553 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS521 = [
            't2',
            'x',
            5
    ]
    static final def INPUTS543 = [
            't2',
            'x',
            9
    ]
    static final def INPUTS554 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS522 = [
            't2',
            'x',
            7
    ]
    static final def INPUTS533 = [
            't2',
            'x',
            4
    ]
    static final def INPUTS535 = [
            't2',
            'x',
            2
    ]
    static final def INPUTS546 = [
            't2',
            'x',
            5
    ]
    static final def INPUTS557 = [
            17
    ]
    static final def INPUTS525 = [
            't2',
            'x',
            2
    ]
    static final def INPUTS547 = [
            't2',
            'x',
            4
    ]
    static final def INPUTS558 = [
            17
    ]
    static final def INPUTS515 = [
            't2',
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
    static final def INPUTS537 = [
            't2',
            'x',
            1
    ]
    static final def INPUTS527 = [
            't2',
            'x',
            1
    ]
    static final def INPUTS539 = [
            't2',
            'x',
            8
    ]
    static final def INPUTS517 = [
            't2',
            'x',
            6
    ]
    static final def INPUTS518 = [
            't2',
            'x',
            6
    ]
    static final def INPUTS529 = [
            't2',
            'x',
            9
    ]
    static final def INPUTS519 = [
            't2',
            'x',
            3
    ]

    static final def OUTPUTS531 = [
            't2',
            'x',
            3
    ]
    static final def OUTPUTS520 = [
            't2',
            'x',
            8
    ]
    static final def OUTPUTS542 = [
            't2',
            'x',
            7
    ]
    static final def OUTPUTS553 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS521 = [
            't2',
            'x',
            5
    ]
    static final def OUTPUTS543 = [
            't2',
            'x',
            9
    ]
    static final def OUTPUTS554 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS522 = [
            't2',
            'x',
            7
    ]
    static final def OUTPUTS533 = [
            't2',
            'x',
            4
    ]
    static final def OUTPUTS535 = [
            't2',
            'x',
            2
    ]
    static final def OUTPUTS546 = [
            't2',
            'x',
            5
    ]
    static final def OUTPUTS557 = [
            17
    ]
    static final def OUTPUTS525 = [
            't2',
            'x',
            2
    ]
    static final def OUTPUTS547 = [
            't2',
            'x',
            4
    ]
    static final def OUTPUTS558 = [
            17
    ]
    static final def OUTPUTS515 = [
            't2',
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
    static final def OUTPUTS537 = [
            't2',
            'x',
            1
    ]
    static final def OUTPUTS527 = [
            't2',
            'x',
            1
    ]
    static final def OUTPUTS539 = [
            't2',
            'x',
            8
    ]
    static final def OUTPUTS517 = [
            't2',
            'x',
            6
    ]
    static final def OUTPUTS518 = [
            't2',
            'x',
            6
    ]
    static final def OUTPUTS529 = [
            't2',
            'x',
            9
    ]
    static final def OUTPUTS519 = [
            't2',
            'x',
            3
    ]

    static final def RETURNED531 = [
            fieldFromX: 't2',
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

    static final def RETURNED520 = [
            fieldFromX: 't2',
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

    static final def RETURNED542 = [
            fieldFromX: 't2',
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

    static final def RETURNED553 = 'null<>null'

    static final def RETURNED521 = [
            fieldFromX: 't2',
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

    static final def RETURNED543 = [
            fieldFromX: 't2',
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

    static final def RETURNED554 = 'null<>null'

    static final def RETURNED522 = [
            fieldFromX: 't2',
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

    static final def RETURNED533 = [
            fieldFromX: 't2',
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

    static final def RETURNED535 = [
            fieldFromX: 't2',
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

    static final def RETURNED546 = [
            fieldFromX: 't2',
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

    static final def RETURNED557 = 289

    static final def RETURNED525 = [
            fieldFromX: 't2',
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

    static final def RETURNED547 = [
            fieldFromX: 't2',
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

    static final def RETURNED558 = 289

    static final def RETURNED515 = [
            dataX       : [
                    fieldFromX: 't2',
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

    static final def RETURNED537 = [
            fieldFromX: 't2',
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

    static final def RETURNED527 = [
            fieldFromX: 't2',
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

    static final def RETURNED539 = [
            fieldFromX: 't2',
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

    static final def RETURNED517 = [
            fieldFromX: 't2',
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

    static final def RETURNED518 = [
            fieldFromX: 't2',
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

    static final def RETURNED529 = [
            fieldFromX: 't2',
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

    static final def RETURNED519 = [
            fieldFromX: 't2',
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
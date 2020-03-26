package com.etz.pkg20200326224537

import spock.lang.Specification

class ServiceAImpldoServiceA421Spec extends Specification {
    void verifydoServiceA() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceAImpl()
        subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
            1 * doServiceB({ p0 -> p0 == INPUTS441[0] }) >> RETURNED441
        }
        subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
            1 * makeX({ p0 -> p0 == INPUTS424[0] }, { p1 -> p1 == INPUTS424[1] }, { p2 -> p2 == INPUTS424[2] }) >> RETURNED424
            1 * makeX({ p0 -> p0 == INPUTS425[0] }, { p1 -> p1 == INPUTS425[1] }, { p2 -> p2 == INPUTS425[2] }) >> RETURNED425
            1 * makeX({ p0 -> p0 == INPUTS423[0] }, { p1 -> p1 == INPUTS423[1] }, { p2 -> p2 == INPUTS423[2] }) >> RETURNED423
            1 * makeX({ p0 -> p0 == INPUTS426[0] }, { p1 -> p1 == INPUTS426[1] }, { p2 -> p2 == INPUTS426[2] }) >> RETURNED426
            1 * makeX({ p0 -> p0 == INPUTS427[0] }, { p1 -> p1 == INPUTS427[1] }, { p2 -> p2 == INPUTS427[2] }) >> RETURNED427
            1 * makeX({ p0 -> p0 == INPUTS429[0] }, { p1 -> p1 == INPUTS429[1] }, { p2 -> p2 == INPUTS429[2] }) >> RETURNED429
            1 * makeX({ p0 -> p0 == INPUTS433[0] }, { p1 -> p1 == INPUTS433[1] }, { p2 -> p2 == INPUTS433[2] }) >> RETURNED433
            1 * makeX({ p0 -> p0 == INPUTS434[0] }, { p1 -> p1 == INPUTS434[1] }, { p2 -> p2 == INPUTS434[2] }) >> RETURNED434
            1 * makeX({ p0 -> p0 == INPUTS435[0] }, { p1 -> p1 == INPUTS435[1] }, { p2 -> p2 == INPUTS435[2] }) >> RETURNED435
        }
        subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
            1 * doServiceC({ p0 -> p0 == INPUTS443[0] }) >> RETURNED443
        }
        when:
        def ret = subject.doServiceA(*INPUTS421)
        then:
        ret == RETURNED421
    }


    static final def INPUTS441 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS421 = [
            't',
            11,
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
    static final def INPUTS443 = [
            11
    ]
    static final def INPUTS433 = [
            't',
            'x',
            7
    ]
    static final def INPUTS423 = [
            't',
            'x',
            6
    ]
    static final def INPUTS434 = [
            't',
            'x',
            9
    ]
    static final def INPUTS424 = [
            't',
            'x',
            3
    ]
    static final def INPUTS435 = [
            't',
            'x',
            1
    ]
    static final def INPUTS425 = [
            't',
            'x',
            8
    ]
    static final def INPUTS426 = [
            't',
            'x',
            5
    ]
    static final def INPUTS427 = [
            't',
            'x',
            2
    ]
    static final def INPUTS429 = [
            't',
            'x',
            4
    ]

    static final def OUTPUTS441 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS421 = [
            't',
            11,
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
    static final def OUTPUTS443 = [
            11
    ]
    static final def OUTPUTS433 = [
            't',
            'x',
            7
    ]
    static final def OUTPUTS423 = [
            't',
            'x',
            6
    ]
    static final def OUTPUTS434 = [
            't',
            'x',
            9
    ]
    static final def OUTPUTS424 = [
            't',
            'x',
            3
    ]
    static final def OUTPUTS435 = [
            't',
            'x',
            1
    ]
    static final def OUTPUTS425 = [
            't',
            'x',
            8
    ]
    static final def OUTPUTS426 = [
            't',
            'x',
            5
    ]
    static final def OUTPUTS427 = [
            't',
            'x',
            2
    ]
    static final def OUTPUTS429 = [
            't',
            'x',
            4
    ]

    static final def RETURNED441 = 'null<>null'

    static final def RETURNED421 = [
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
            fromServiceC: 121,
    ] as com.etz.replay.unit.targets.ServiceData

    static final def RETURNED443 = 121

    static final def RETURNED433 = [
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

    static final def RETURNED423 = [
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

    static final def RETURNED434 = [
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

    static final def RETURNED424 = [
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

    static final def RETURNED435 = [
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

    static final def RETURNED425 = [
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

    static final def RETURNED426 = [
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

    static final def RETURNED427 = [
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

    static final def RETURNED429 = [
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
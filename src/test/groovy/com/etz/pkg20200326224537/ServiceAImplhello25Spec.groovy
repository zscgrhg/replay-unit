package com.etz.pkg20200326224537

import spock.lang.Specification

class ServiceAImplhello25Spec extends Specification {
    void verifyhello() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceAImpl()
        subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
            1 * doServiceB({ p0 -> p0 == INPUTS63[0] }) >> RETURNED63
            1 * doServiceB({ p0 -> p0 == INPUTS67[0] }) >> RETURNED67
        }
        subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
            1 * makeX({ p0 -> p0 == INPUTS27[0] }, { p1 -> p1 == INPUTS27[1] }, { p2 -> p2 == INPUTS27[2] }) >> RETURNED27
            1 * makeX({ p0 -> p0 == INPUTS32[0] }, { p1 -> p1 == INPUTS32[1] }, { p2 -> p2 == INPUTS32[2] }) >> RETURNED32
            1 * makeX({ p0 -> p0 == INPUTS35[0] }, { p1 -> p1 == INPUTS35[1] }, { p2 -> p2 == INPUTS35[2] }) >> RETURNED35
            1 * makeX({ p0 -> p0 == INPUTS37[0] }, { p1 -> p1 == INPUTS37[1] }, { p2 -> p2 == INPUTS37[2] }) >> RETURNED37
            1 * makeX({ p0 -> p0 == INPUTS31[0] }, { p1 -> p1 == INPUTS31[1] }, { p2 -> p2 == INPUTS31[2] }) >> RETURNED31
            1 * makeX({ p0 -> p0 == INPUTS30[0] }, { p1 -> p1 == INPUTS30[1] }, { p2 -> p2 == INPUTS30[2] }) >> RETURNED30
            1 * makeX({ p0 -> p0 == INPUTS29[0] }, { p1 -> p1 == INPUTS29[1] }, { p2 -> p2 == INPUTS29[2] }) >> RETURNED29
            1 * makeX({ p0 -> p0 == INPUTS28[0] }, { p1 -> p1 == INPUTS28[1] }, { p2 -> p2 == INPUTS28[2] }) >> RETURNED28
            1 * makeX({ p0 -> p0 == INPUTS42[0] }, { p1 -> p1 == INPUTS42[1] }, { p2 -> p2 == INPUTS42[2] }) >> RETURNED42
            1 * makeX({ p0 -> p0 == INPUTS44[0] }, { p1 -> p1 == INPUTS44[1] }, { p2 -> p2 == INPUTS44[2] }) >> RETURNED44
            1 * makeX({ p0 -> p0 == INPUTS46[0] }, { p1 -> p1 == INPUTS46[1] }, { p2 -> p2 == INPUTS46[2] }) >> RETURNED46
            1 * makeX({ p0 -> p0 == INPUTS48[0] }, { p1 -> p1 == INPUTS48[1] }, { p2 -> p2 == INPUTS48[2] }) >> RETURNED48
            1 * makeX({ p0 -> p0 == INPUTS50[0] }, { p1 -> p1 == INPUTS50[1] }, { p2 -> p2 == INPUTS50[2] }) >> RETURNED50
            1 * makeX({ p0 -> p0 == INPUTS53[0] }, { p1 -> p1 == INPUTS53[1] }, { p2 -> p2 == INPUTS53[2] }) >> RETURNED53
            1 * makeX({ p0 -> p0 == INPUTS55[0] }, { p1 -> p1 == INPUTS55[1] }, { p2 -> p2 == INPUTS55[2] }) >> RETURNED55
            1 * makeX({ p0 -> p0 == INPUTS58[0] }, { p1 -> p1 == INPUTS58[1] }, { p2 -> p2 == INPUTS58[2] }) >> RETURNED58
            1 * makeX({ p0 -> p0 == INPUTS60[0] }, { p1 -> p1 == INPUTS60[1] }, { p2 -> p2 == INPUTS60[2] }) >> RETURNED60
            1 * makeX({ p0 -> p0 == INPUTS57[0] }, { p1 -> p1 == INPUTS57[1] }, { p2 -> p2 == INPUTS57[2] }) >> RETURNED57
        }
        subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
            1 * doServiceC({ p0 -> p0 == INPUTS65[0] }) >> RETURNED65
            1 * doServiceC({ p0 -> p0 == INPUTS69[0] }) >> RETURNED69
        }
        when:
        def ret = subject.hello(*INPUTS25)
        then:
        ret == RETURNED25
    }


    static final def INPUTS44 = [
            't2',
            'x',
            1
    ]
    static final def INPUTS55 = [
            't2',
            'x',
            8
    ]
    static final def INPUTS67 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS35 = [
            't2',
            'x',
            9
    ]
    static final def INPUTS46 = [
            't2',
            'x',
            3
    ]
    static final def INPUTS57 = [
            't2',
            'x',
            5
    ]
    static final def INPUTS25 = [
            't2',
            19,
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
    static final def INPUTS58 = [
            't2',
            'x',
            7
    ]
    static final def INPUTS69 = [
            19
    ]
    static final def INPUTS37 = [
            't2',
            'x',
            2
    ]
    static final def INPUTS48 = [
            't2',
            'x',
            4
    ]
    static final def INPUTS27 = [
            't2',
            'x',
            6
    ]
    static final def INPUTS28 = [
            't2',
            'x',
            7
    ]
    static final def INPUTS29 = [
            't2',
            'x',
            6
    ]
    static final def INPUTS60 = [
            't2',
            'x',
            9
    ]
    static final def INPUTS50 = [
            't2',
            'x',
            2
    ]
    static final def INPUTS30 = [
            't2',
            'x',
            5
    ]
    static final def INPUTS63 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS31 = [
            't2',
            'x',
            3
    ]
    static final def INPUTS42 = [
            't2',
            'x',
            4
    ]
    static final def INPUTS53 = [
            't2',
            'x',
            1
    ]
    static final def INPUTS32 = [
            't2',
            'x',
            8
    ]
    static final def INPUTS65 = [
            19
    ]

    static final def OUTPUTS44 = [
            't2',
            'x',
            1
    ]
    static final def OUTPUTS55 = [
            't2',
            'x',
            8
    ]
    static final def OUTPUTS67 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS35 = [
            't2',
            'x',
            9
    ]
    static final def OUTPUTS46 = [
            't2',
            'x',
            3
    ]
    static final def OUTPUTS57 = [
            't2',
            'x',
            5
    ]
    static final def OUTPUTS25 = [
            't2',
            19,
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
    static final def OUTPUTS58 = [
            't2',
            'x',
            7
    ]
    static final def OUTPUTS69 = [
            19
    ]
    static final def OUTPUTS37 = [
            't2',
            'x',
            2
    ]
    static final def OUTPUTS48 = [
            't2',
            'x',
            4
    ]
    static final def OUTPUTS27 = [
            't2',
            'x',
            6
    ]
    static final def OUTPUTS28 = [
            't2',
            'x',
            7
    ]
    static final def OUTPUTS29 = [
            't2',
            'x',
            6
    ]
    static final def OUTPUTS60 = [
            't2',
            'x',
            9
    ]
    static final def OUTPUTS50 = [
            't2',
            'x',
            2
    ]
    static final def OUTPUTS30 = [
            't2',
            'x',
            5
    ]
    static final def OUTPUTS63 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS31 = [
            't2',
            'x',
            3
    ]
    static final def OUTPUTS42 = [
            't2',
            'x',
            4
    ]
    static final def OUTPUTS53 = [
            't2',
            'x',
            1
    ]
    static final def OUTPUTS32 = [
            't2',
            'x',
            8
    ]
    static final def OUTPUTS65 = [
            19
    ]

    static final def RETURNED44 = [
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

    static final def RETURNED55 = [
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

    static final def RETURNED67 = 'null<>null'

    static final def RETURNED35 = [
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

    static final def RETURNED46 = [
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

    static final def RETURNED57 = [
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

    static final def RETURNED25 = [
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
            fromServiceC: 361,
    ] as com.etz.replay.unit.targets.ServiceData

    static final def RETURNED58 = [
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

    static final def RETURNED69 = 361

    static final def RETURNED37 = [
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

    static final def RETURNED48 = [
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

    static final def RETURNED27 = [
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

    static final def RETURNED28 = [
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

    static final def RETURNED29 = [
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

    static final def RETURNED60 = [
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

    static final def RETURNED50 = [
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

    static final def RETURNED30 = [
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

    static final def RETURNED63 = 'null<>null'

    static final def RETURNED31 = [
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

    static final def RETURNED42 = [
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

    static final def RETURNED53 = [
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

    static final def RETURNED32 = [
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

    static final def RETURNED65 = 361


}
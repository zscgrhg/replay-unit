package com.etz.pkg20200326214328

import spock.lang.Specification

class ServiceAImplhello95Spec extends Specification {
    void verifyhello() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceAImpl()
        subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
            1 * doServiceB({ p0 -> p0 == INPUTS124[0] }) >> RETURNED124
            1 * doServiceB({ p0 -> p0 == INPUTS137[0] }) >> RETURNED137
        }
        subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
            1 * makeX({ p0 -> p0 == INPUTS97[0] }, { p1 -> p1 == INPUTS97[1] }, { p2 -> p2 == INPUTS97[2] }) >> RETURNED97
            1 * makeX({ p0 -> p0 == INPUTS101[0] }, { p1 -> p1 == INPUTS101[1] }, { p2 -> p2 == INPUTS101[2] }) >> RETURNED101
            1 * makeX({ p0 -> p0 == INPUTS100[0] }, { p1 -> p1 == INPUTS100[1] }, { p2 -> p2 == INPUTS100[2] }) >> RETURNED100
            1 * makeX({ p0 -> p0 == INPUTS99[0] }, { p1 -> p1 == INPUTS99[1] }, { p2 -> p2 == INPUTS99[2] }) >> RETURNED99
            1 * makeX({ p0 -> p0 == INPUTS98[0] }, { p1 -> p1 == INPUTS98[1] }, { p2 -> p2 == INPUTS98[2] }) >> RETURNED98
            1 * makeX({ p0 -> p0 == INPUTS102[0] }, { p1 -> p1 == INPUTS102[1] }, { p2 -> p2 == INPUTS102[2] }) >> RETURNED102
            1 * makeX({ p0 -> p0 == INPUTS109[0] }, { p1 -> p1 == INPUTS109[1] }, { p2 -> p2 == INPUTS109[2] }) >> RETURNED109
            1 * makeX({ p0 -> p0 == INPUTS111[0] }, { p1 -> p1 == INPUTS111[1] }, { p2 -> p2 == INPUTS111[2] }) >> RETURNED111
            1 * makeX({ p0 -> p0 == INPUTS112[0] }, { p1 -> p1 == INPUTS112[1] }, { p2 -> p2 == INPUTS112[2] }) >> RETURNED112
            1 * makeX({ p0 -> p0 == INPUTS110[0] }, { p1 -> p1 == INPUTS110[1] }, { p2 -> p2 == INPUTS110[2] }) >> RETURNED110
            1 * makeX({ p0 -> p0 == INPUTS114[0] }, { p1 -> p1 == INPUTS114[1] }, { p2 -> p2 == INPUTS114[2] }) >> RETURNED114
            1 * makeX({ p0 -> p0 == INPUTS115[0] }, { p1 -> p1 == INPUTS115[1] }, { p2 -> p2 == INPUTS115[2] }) >> RETURNED115
            1 * makeX({ p0 -> p0 == INPUTS121[0] }, { p1 -> p1 == INPUTS121[1] }, { p2 -> p2 == INPUTS121[2] }) >> RETURNED121
            1 * makeX({ p0 -> p0 == INPUTS123[0] }, { p1 -> p1 == INPUTS123[1] }, { p2 -> p2 == INPUTS123[2] }) >> RETURNED123
            1 * makeX({ p0 -> p0 == INPUTS122[0] }, { p1 -> p1 == INPUTS122[1] }, { p2 -> p2 == INPUTS122[2] }) >> RETURNED122
            1 * makeX({ p0 -> p0 == INPUTS126[0] }, { p1 -> p1 == INPUTS126[1] }, { p2 -> p2 == INPUTS126[2] }) >> RETURNED126
            1 * makeX({ p0 -> p0 == INPUTS125[0] }, { p1 -> p1 == INPUTS125[1] }, { p2 -> p2 == INPUTS125[2] }) >> RETURNED125
            1 * makeX({ p0 -> p0 == INPUTS133[0] }, { p1 -> p1 == INPUTS133[1] }, { p2 -> p2 == INPUTS133[2] }) >> RETURNED133
        }
        subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
            1 * doServiceC({ p0 -> p0 == INPUTS134[0] }) >> RETURNED134
            1 * doServiceC({ p0 -> p0 == INPUTS139[0] }) >> RETURNED139
        }
        when:
        def ret = subject.hello(*INPUTS95)
        then:
        ret == RETURNED95
    }


    static final def INPUTS99 = [
            't2',
            'x',
            6
    ]
    static final def INPUTS110 = [
            't2',
            'x',
            9
    ]
    static final def INPUTS121 = [
            't2',
            'x',
            2
    ]
    static final def INPUTS100 = [
            't2',
            'x',
            8
    ]
    static final def INPUTS111 = [
            't2',
            'x',
            1
    ]
    static final def INPUTS122 = [
            't2',
            'x',
            8
    ]
    static final def INPUTS133 = [
            't2',
            'x',
            9
    ]
    static final def INPUTS101 = [
            't2',
            'x',
            7
    ]
    static final def INPUTS112 = [
            't2',
            'x',
            5
    ]
    static final def INPUTS123 = [
            't2',
            'x',
            1
    ]
    static final def INPUTS134 = [
            13
    ]
    static final def INPUTS102 = [
            't2',
            'x',
            2
    ]
    static final def INPUTS124 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS114 = [
            't2',
            'x',
            4
    ]
    static final def INPUTS125 = [
            't2',
            'x',
            7
    ]
    static final def INPUTS115 = [
            't2',
            'x',
            3
    ]
    static final def INPUTS126 = [
            't2',
            'x',
            4
    ]
    static final def INPUTS137 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS139 = [
            13
    ]
    static final def INPUTS109 = [
            't2',
            'x',
            5
    ]
    static final def INPUTS95 = [
            't2',
            13,
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
    static final def INPUTS97 = [
            't2',
            'x',
            6
    ]
    static final def INPUTS98 = [
            't2',
            'x',
            3
    ]

    static final def OUTPUTS99 = [
            't2',
            'x',
            6
    ]
    static final def OUTPUTS110 = [
            't2',
            'x',
            9
    ]
    static final def OUTPUTS121 = [
            't2',
            'x',
            2
    ]
    static final def OUTPUTS100 = [
            't2',
            'x',
            8
    ]
    static final def OUTPUTS111 = [
            't2',
            'x',
            1
    ]
    static final def OUTPUTS122 = [
            't2',
            'x',
            8
    ]
    static final def OUTPUTS133 = [
            't2',
            'x',
            9
    ]
    static final def OUTPUTS101 = [
            't2',
            'x',
            7
    ]
    static final def OUTPUTS112 = [
            't2',
            'x',
            5
    ]
    static final def OUTPUTS123 = [
            't2',
            'x',
            1
    ]
    static final def OUTPUTS134 = [
            13
    ]
    static final def OUTPUTS102 = [
            't2',
            'x',
            2
    ]
    static final def OUTPUTS124 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS114 = [
            't2',
            'x',
            4
    ]
    static final def OUTPUTS125 = [
            't2',
            'x',
            7
    ]
    static final def OUTPUTS115 = [
            't2',
            'x',
            3
    ]
    static final def OUTPUTS126 = [
            't2',
            'x',
            4
    ]
    static final def OUTPUTS137 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS139 = [
            13
    ]
    static final def OUTPUTS109 = [
            't2',
            'x',
            5
    ]
    static final def OUTPUTS95 = [
            't2',
            13,
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
    static final def OUTPUTS97 = [
            't2',
            'x',
            6
    ]
    static final def OUTPUTS98 = [
            't2',
            'x',
            3
    ]

    static final def RETURNED99 = [
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

    static final def RETURNED110 = [
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

    static final def RETURNED121 = [
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

    static final def RETURNED100 = [
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

    static final def RETURNED111 = [
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

    static final def RETURNED122 = [
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

    static final def RETURNED133 = [
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

    static final def RETURNED101 = [
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

    static final def RETURNED112 = [
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

    static final def RETURNED123 = [
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

    static final def RETURNED134 = 169

    static final def RETURNED102 = [
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

    static final def RETURNED124 = 'null<>null'

    static final def RETURNED114 = [
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

    static final def RETURNED125 = [
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

    static final def RETURNED115 = [
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

    static final def RETURNED126 = [
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

    static final def RETURNED137 = 'null<>null'

    static final def RETURNED139 = 169

    static final def RETURNED109 = [
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

    static final def RETURNED95 = [
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
            fromServiceC: 169,
    ] as com.etz.replay.unit.targets.ServiceData

    static final def RETURNED97 = [
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

    static final def RETURNED98 = [
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
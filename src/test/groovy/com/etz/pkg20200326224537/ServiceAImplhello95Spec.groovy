package com.etz.pkg20200326224538

import spock.lang.Specification

class ServiceAImplhello95Spec extends Specification {
    void verifyhello() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceAImpl()
        subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
            1 * doServiceB({ p0 -> p0 == INPUTS128[0] }) >> RETURNED128
            1 * doServiceB({ p0 -> p0 == INPUTS135[0] }) >> RETURNED135
        }
        subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
            1 * makeX({ p0 -> p0 == INPUTS98[0] }, { p1 -> p1 == INPUTS98[1] }, { p2 -> p2 == INPUTS98[2] }) >> RETURNED98
            1 * makeX({ p0 -> p0 == INPUTS101[0] }, { p1 -> p1 == INPUTS101[1] }, { p2 -> p2 == INPUTS101[2] }) >> RETURNED101
            1 * makeX({ p0 -> p0 == INPUTS103[0] }, { p1 -> p1 == INPUTS103[1] }, { p2 -> p2 == INPUTS103[2] }) >> RETURNED103
            1 * makeX({ p0 -> p0 == INPUTS106[0] }, { p1 -> p1 == INPUTS106[1] }, { p2 -> p2 == INPUTS106[2] }) >> RETURNED106
            1 * makeX({ p0 -> p0 == INPUTS108[0] }, { p1 -> p1 == INPUTS108[1] }, { p2 -> p2 == INPUTS108[2] }) >> RETURNED108
            1 * makeX({ p0 -> p0 == INPUTS110[0] }, { p1 -> p1 == INPUTS110[1] }, { p2 -> p2 == INPUTS110[2] }) >> RETURNED110
            1 * makeX({ p0 -> p0 == INPUTS99[0] }, { p1 -> p1 == INPUTS99[1] }, { p2 -> p2 == INPUTS99[2] }) >> RETURNED99
            1 * makeX({ p0 -> p0 == INPUTS114[0] }, { p1 -> p1 == INPUTS114[1] }, { p2 -> p2 == INPUTS114[2] }) >> RETURNED114
            1 * makeX({ p0 -> p0 == INPUTS116[0] }, { p1 -> p1 == INPUTS116[1] }, { p2 -> p2 == INPUTS116[2] }) >> RETURNED116
            1 * makeX({ p0 -> p0 == INPUTS104[0] }, { p1 -> p1 == INPUTS104[1] }, { p2 -> p2 == INPUTS104[2] }) >> RETURNED104
            1 * makeX({ p0 -> p0 == INPUTS118[0] }, { p1 -> p1 == INPUTS118[1] }, { p2 -> p2 == INPUTS118[2] }) >> RETURNED118
            1 * makeX({ p0 -> p0 == INPUTS97[0] }, { p1 -> p1 == INPUTS97[1] }, { p2 -> p2 == INPUTS97[2] }) >> RETURNED97
            1 * makeX({ p0 -> p0 == INPUTS113[0] }, { p1 -> p1 == INPUTS113[1] }, { p2 -> p2 == INPUTS113[2] }) >> RETURNED113
            1 * makeX({ p0 -> p0 == INPUTS122[0] }, { p1 -> p1 == INPUTS122[1] }, { p2 -> p2 == INPUTS122[2] }) >> RETURNED122
            1 * makeX({ p0 -> p0 == INPUTS121[0] }, { p1 -> p1 == INPUTS121[1] }, { p2 -> p2 == INPUTS121[2] }) >> RETURNED121
            1 * makeX({ p0 -> p0 == INPUTS130[0] }, { p1 -> p1 == INPUTS130[1] }, { p2 -> p2 == INPUTS130[2] }) >> RETURNED130
            1 * makeX({ p0 -> p0 == INPUTS124[0] }, { p1 -> p1 == INPUTS124[1] }, { p2 -> p2 == INPUTS124[2] }) >> RETURNED124
            1 * makeX({ p0 -> p0 == INPUTS129[0] }, { p1 -> p1 == INPUTS129[1] }, { p2 -> p2 == INPUTS129[2] }) >> RETURNED129
        }
        subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
            1 * doServiceC({ p0 -> p0 == INPUTS136[0] }) >> RETURNED136
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
            8
    ]
    static final def INPUTS130 = [
            't2',
            'x',
            5
    ]
    static final def INPUTS110 = [
            't2',
            'x',
            3
    ]
    static final def INPUTS121 = [
            't2',
            'x',
            8
    ]
    static final def INPUTS122 = [
            't2',
            'x',
            6
    ]
    static final def INPUTS101 = [
            't2',
            'x',
            4
    ]
    static final def INPUTS113 = [
            't2',
            'x',
            2
    ]
    static final def INPUTS124 = [
            't2',
            'x',
            7
    ]
    static final def INPUTS135 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS103 = [
            't2',
            'x',
            2
    ]
    static final def INPUTS114 = [
            't2',
            'x',
            7
    ]
    static final def INPUTS136 = [
            5
    ]
    static final def INPUTS104 = [
            't2',
            'x',
            5
    ]
    static final def INPUTS116 = [
            't2',
            'x',
            1
    ]
    static final def INPUTS106 = [
            't2',
            'x',
            1
    ]
    static final def INPUTS128 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS139 = [
            5
    ]
    static final def INPUTS118 = [
            't2',
            'x',
            4
    ]
    static final def INPUTS129 = [
            't2',
            'x',
            9
    ]
    static final def INPUTS108 = [
            't2',
            'x',
            9
    ]
    static final def INPUTS95 = [
            't2',
            5,
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
            8
    ]
    static final def OUTPUTS130 = [
            't2',
            'x',
            5
    ]
    static final def OUTPUTS110 = [
            't2',
            'x',
            3
    ]
    static final def OUTPUTS121 = [
            't2',
            'x',
            8
    ]
    static final def OUTPUTS122 = [
            't2',
            'x',
            6
    ]
    static final def OUTPUTS101 = [
            't2',
            'x',
            4
    ]
    static final def OUTPUTS113 = [
            't2',
            'x',
            2
    ]
    static final def OUTPUTS124 = [
            't2',
            'x',
            7
    ]
    static final def OUTPUTS135 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS103 = [
            't2',
            'x',
            2
    ]
    static final def OUTPUTS114 = [
            't2',
            'x',
            7
    ]
    static final def OUTPUTS136 = [
            5
    ]
    static final def OUTPUTS104 = [
            't2',
            'x',
            5
    ]
    static final def OUTPUTS116 = [
            't2',
            'x',
            1
    ]
    static final def OUTPUTS106 = [
            't2',
            'x',
            1
    ]
    static final def OUTPUTS128 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS139 = [
            5
    ]
    static final def OUTPUTS118 = [
            't2',
            'x',
            4
    ]
    static final def OUTPUTS129 = [
            't2',
            'x',
            9
    ]
    static final def OUTPUTS108 = [
            't2',
            'x',
            9
    ]
    static final def OUTPUTS95 = [
            't2',
            5,
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

    static final def RETURNED130 = [
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

    static final def RETURNED113 = [
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

    static final def RETURNED124 = [
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

    static final def RETURNED135 = 'null<>null'

    static final def RETURNED103 = [
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

    static final def RETURNED136 = 25

    static final def RETURNED104 = [
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

    static final def RETURNED116 = [
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

    static final def RETURNED106 = [
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

    static final def RETURNED128 = 'null<>null'

    static final def RETURNED139 = 25

    static final def RETURNED118 = [
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

    static final def RETURNED129 = [
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

    static final def RETURNED108 = [
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
            fromServiceC: 25,
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
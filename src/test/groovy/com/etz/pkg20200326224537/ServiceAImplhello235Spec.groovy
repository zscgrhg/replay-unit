package com.etz.pkg20200326224537

import spock.lang.Specification

class ServiceAImplhello235Spec extends Specification {
    void verifyhello() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceAImpl()
        subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
            1 * doServiceB({ p0 -> p0 == INPUTS270[0] }) >> RETURNED270
            1 * doServiceB({ p0 -> p0 == INPUTS276[0] }) >> RETURNED276
        }
        subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
            1 * makeX({ p0 -> p0 == INPUTS237[0] }, { p1 -> p1 == INPUTS237[1] }, { p2 -> p2 == INPUTS237[2] }) >> RETURNED237
            1 * makeX({ p0 -> p0 == INPUTS240[0] }, { p1 -> p1 == INPUTS240[1] }, { p2 -> p2 == INPUTS240[2] }) >> RETURNED240
            1 * makeX({ p0 -> p0 == INPUTS242[0] }, { p1 -> p1 == INPUTS242[1] }, { p2 -> p2 == INPUTS242[2] }) >> RETURNED242
            1 * makeX({ p0 -> p0 == INPUTS244[0] }, { p1 -> p1 == INPUTS244[1] }, { p2 -> p2 == INPUTS244[2] }) >> RETURNED244
            1 * makeX({ p0 -> p0 == INPUTS246[0] }, { p1 -> p1 == INPUTS246[1] }, { p2 -> p2 == INPUTS246[2] }) >> RETURNED246
            1 * makeX({ p0 -> p0 == INPUTS248[0] }, { p1 -> p1 == INPUTS248[1] }, { p2 -> p2 == INPUTS248[2] }) >> RETURNED248
            1 * makeX({ p0 -> p0 == INPUTS249[0] }, { p1 -> p1 == INPUTS249[1] }, { p2 -> p2 == INPUTS249[2] }) >> RETURNED249
            1 * makeX({ p0 -> p0 == INPUTS254[0] }, { p1 -> p1 == INPUTS254[1] }, { p2 -> p2 == INPUTS254[2] }) >> RETURNED254
            1 * makeX({ p0 -> p0 == INPUTS256[0] }, { p1 -> p1 == INPUTS256[1] }, { p2 -> p2 == INPUTS256[2] }) >> RETURNED256
            1 * makeX({ p0 -> p0 == INPUTS258[0] }, { p1 -> p1 == INPUTS258[1] }, { p2 -> p2 == INPUTS258[2] }) >> RETURNED258
            1 * makeX({ p0 -> p0 == INPUTS238[0] }, { p1 -> p1 == INPUTS238[1] }, { p2 -> p2 == INPUTS238[2] }) >> RETURNED238
            1 * makeX({ p0 -> p0 == INPUTS251[0] }, { p1 -> p1 == INPUTS251[1] }, { p2 -> p2 == INPUTS251[2] }) >> RETURNED251
            1 * makeX({ p0 -> p0 == INPUTS252[0] }, { p1 -> p1 == INPUTS252[1] }, { p2 -> p2 == INPUTS252[2] }) >> RETURNED252
            1 * makeX({ p0 -> p0 == INPUTS263[0] }, { p1 -> p1 == INPUTS263[1] }, { p2 -> p2 == INPUTS263[2] }) >> RETURNED263
            1 * makeX({ p0 -> p0 == INPUTS265[0] }, { p1 -> p1 == INPUTS265[1] }, { p2 -> p2 == INPUTS265[2] }) >> RETURNED265
            1 * makeX({ p0 -> p0 == INPUTS267[0] }, { p1 -> p1 == INPUTS267[1] }, { p2 -> p2 == INPUTS267[2] }) >> RETURNED267
            1 * makeX({ p0 -> p0 == INPUTS268[0] }, { p1 -> p1 == INPUTS268[1] }, { p2 -> p2 == INPUTS268[2] }) >> RETURNED268
            1 * makeX({ p0 -> p0 == INPUTS269[0] }, { p1 -> p1 == INPUTS269[1] }, { p2 -> p2 == INPUTS269[2] }) >> RETURNED269
        }
        subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
            1 * doServiceC({ p0 -> p0 == INPUTS275[0] }) >> RETURNED275
            1 * doServiceC({ p0 -> p0 == INPUTS279[0] }) >> RETURNED279
        }
        when:
        def ret = subject.hello(*INPUTS235)
        then:
        ret == RETURNED235
    }


    static final def INPUTS270 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS240 = [
            't2',
            'x',
            7
    ]
    static final def INPUTS251 = [
            't2',
            'x',
            3
    ]
    static final def INPUTS252 = [
            't2',
            'x',
            8
    ]
    static final def INPUTS263 = [
            't2',
            'x',
            5
    ]
    static final def INPUTS242 = [
            't2',
            'x',
            9
    ]
    static final def INPUTS275 = [
            18
    ]
    static final def INPUTS254 = [
            't2',
            'x',
            4
    ]
    static final def INPUTS265 = [
            't2',
            'x',
            2
    ]
    static final def INPUTS276 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS244 = [
            't2',
            'x',
            2
    ]
    static final def INPUTS256 = [
            't2',
            'x',
            8
    ]
    static final def INPUTS267 = [
            't2',
            'x',
            7
    ]
    static final def INPUTS235 = [
            't2',
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
    static final def INPUTS246 = [
            't2',
            'x',
            1
    ]
    static final def INPUTS268 = [
            't2',
            'x',
            4
    ]
    static final def INPUTS279 = [
            18
    ]
    static final def INPUTS258 = [
            't2',
            'x',
            9
    ]
    static final def INPUTS269 = [
            't2',
            'x',
            1
    ]
    static final def INPUTS237 = [
            't2',
            'x',
            6
    ]
    static final def INPUTS248 = [
            't2',
            'x',
            5
    ]
    static final def INPUTS249 = [
            't2',
            'x',
            6
    ]
    static final def INPUTS238 = [
            't2',
            'x',
            3
    ]

    static final def OUTPUTS270 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS240 = [
            't2',
            'x',
            7
    ]
    static final def OUTPUTS251 = [
            't2',
            'x',
            3
    ]
    static final def OUTPUTS252 = [
            't2',
            'x',
            8
    ]
    static final def OUTPUTS263 = [
            't2',
            'x',
            5
    ]
    static final def OUTPUTS242 = [
            't2',
            'x',
            9
    ]
    static final def OUTPUTS275 = [
            18
    ]
    static final def OUTPUTS254 = [
            't2',
            'x',
            4
    ]
    static final def OUTPUTS265 = [
            't2',
            'x',
            2
    ]
    static final def OUTPUTS276 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS244 = [
            't2',
            'x',
            2
    ]
    static final def OUTPUTS256 = [
            't2',
            'x',
            8
    ]
    static final def OUTPUTS267 = [
            't2',
            'x',
            7
    ]
    static final def OUTPUTS235 = [
            't2',
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
    static final def OUTPUTS246 = [
            't2',
            'x',
            1
    ]
    static final def OUTPUTS268 = [
            't2',
            'x',
            4
    ]
    static final def OUTPUTS279 = [
            18
    ]
    static final def OUTPUTS258 = [
            't2',
            'x',
            9
    ]
    static final def OUTPUTS269 = [
            't2',
            'x',
            1
    ]
    static final def OUTPUTS237 = [
            't2',
            'x',
            6
    ]
    static final def OUTPUTS248 = [
            't2',
            'x',
            5
    ]
    static final def OUTPUTS249 = [
            't2',
            'x',
            6
    ]
    static final def OUTPUTS238 = [
            't2',
            'x',
            3
    ]

    static final def RETURNED270 = 'null<>null'

    static final def RETURNED240 = [
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

    static final def RETURNED251 = [
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

    static final def RETURNED252 = [
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

    static final def RETURNED263 = [
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

    static final def RETURNED242 = [
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

    static final def RETURNED275 = 324

    static final def RETURNED254 = [
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

    static final def RETURNED265 = [
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

    static final def RETURNED276 = 'null<>null'

    static final def RETURNED244 = [
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

    static final def RETURNED256 = [
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

    static final def RETURNED267 = [
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

    static final def RETURNED235 = [
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
            fromServiceC: 324,
    ] as com.etz.replay.unit.targets.ServiceData

    static final def RETURNED246 = [
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

    static final def RETURNED268 = [
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

    static final def RETURNED279 = 324

    static final def RETURNED258 = [
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

    static final def RETURNED269 = [
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

    static final def RETURNED237 = [
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

    static final def RETURNED248 = [
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

    static final def RETURNED249 = [
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

    static final def RETURNED238 = [
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
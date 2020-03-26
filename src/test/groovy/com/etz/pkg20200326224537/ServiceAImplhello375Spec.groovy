package com.etz.pkg20200326224537

import spock.lang.Specification

class ServiceAImplhello375Spec extends Specification {
    void verifyhello() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceAImpl()
        subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
            1 * doServiceB({ p0 -> p0 == INPUTS413[0] }) >> RETURNED413
            1 * doServiceB({ p0 -> p0 == INPUTS416[0] }) >> RETURNED416
        }
        subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
            1 * makeX({ p0 -> p0 == INPUTS378[0] }, { p1 -> p1 == INPUTS378[1] }, { p2 -> p2 == INPUTS378[2] }) >> RETURNED378
            1 * makeX({ p0 -> p0 == INPUTS382[0] }, { p1 -> p1 == INPUTS382[1] }, { p2 -> p2 == INPUTS382[2] }) >> RETURNED382
            1 * makeX({ p0 -> p0 == INPUTS386[0] }, { p1 -> p1 == INPUTS386[1] }, { p2 -> p2 == INPUTS386[2] }) >> RETURNED386
            1 * makeX({ p0 -> p0 == INPUTS388[0] }, { p1 -> p1 == INPUTS388[1] }, { p2 -> p2 == INPUTS388[2] }) >> RETURNED388
            1 * makeX({ p0 -> p0 == INPUTS377[0] }, { p1 -> p1 == INPUTS377[1] }, { p2 -> p2 == INPUTS377[2] }) >> RETURNED377
            1 * makeX({ p0 -> p0 == INPUTS380[0] }, { p1 -> p1 == INPUTS380[1] }, { p2 -> p2 == INPUTS380[2] }) >> RETURNED380
            1 * makeX({ p0 -> p0 == INPUTS384[0] }, { p1 -> p1 == INPUTS384[1] }, { p2 -> p2 == INPUTS384[2] }) >> RETURNED384
            1 * makeX({ p0 -> p0 == INPUTS385[0] }, { p1 -> p1 == INPUTS385[1] }, { p2 -> p2 == INPUTS385[2] }) >> RETURNED385
            1 * makeX({ p0 -> p0 == INPUTS379[0] }, { p1 -> p1 == INPUTS379[1] }, { p2 -> p2 == INPUTS379[2] }) >> RETURNED379
            1 * makeX({ p0 -> p0 == INPUTS395[0] }, { p1 -> p1 == INPUTS395[1] }, { p2 -> p2 == INPUTS395[2] }) >> RETURNED395
            1 * makeX({ p0 -> p0 == INPUTS397[0] }, { p1 -> p1 == INPUTS397[1] }, { p2 -> p2 == INPUTS397[2] }) >> RETURNED397
            1 * makeX({ p0 -> p0 == INPUTS401[0] }, { p1 -> p1 == INPUTS401[1] }, { p2 -> p2 == INPUTS401[2] }) >> RETURNED401
            1 * makeX({ p0 -> p0 == INPUTS399[0] }, { p1 -> p1 == INPUTS399[1] }, { p2 -> p2 == INPUTS399[2] }) >> RETURNED399
            1 * makeX({ p0 -> p0 == INPUTS403[0] }, { p1 -> p1 == INPUTS403[1] }, { p2 -> p2 == INPUTS403[2] }) >> RETURNED403
            1 * makeX({ p0 -> p0 == INPUTS400[0] }, { p1 -> p1 == INPUTS400[1] }, { p2 -> p2 == INPUTS400[2] }) >> RETURNED400
            1 * makeX({ p0 -> p0 == INPUTS404[0] }, { p1 -> p1 == INPUTS404[1] }, { p2 -> p2 == INPUTS404[2] }) >> RETURNED404
            1 * makeX({ p0 -> p0 == INPUTS402[0] }, { p1 -> p1 == INPUTS402[1] }, { p2 -> p2 == INPUTS402[2] }) >> RETURNED402
            1 * makeX({ p0 -> p0 == INPUTS411[0] }, { p1 -> p1 == INPUTS411[1] }, { p2 -> p2 == INPUTS411[2] }) >> RETURNED411
        }
        subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
            1 * doServiceC({ p0 -> p0 == INPUTS415[0] }) >> RETURNED415
            1 * doServiceC({ p0 -> p0 == INPUTS419[0] }) >> RETURNED419
        }
        when:
        def ret = subject.hello(*INPUTS375)
        then:
        ret == RETURNED375
    }


    static final def INPUTS380 = [
            't2',
            'x',
            3
    ]
    static final def INPUTS382 = [
            't2',
            'x',
            5
    ]
    static final def INPUTS384 = [
            't2',
            'x',
            2
    ]
    static final def INPUTS395 = [
            't2',
            'x',
            1
    ]
    static final def INPUTS385 = [
            't2',
            'x',
            8
    ]
    static final def INPUTS375 = [
            't2',
            12,
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
    static final def INPUTS386 = [
            't2',
            'x',
            4
    ]
    static final def INPUTS397 = [
            't2',
            'x',
            9
    ]
    static final def INPUTS388 = [
            't2',
            'x',
            7
    ]
    static final def INPUTS377 = [
            't2',
            'x',
            6
    ]
    static final def INPUTS399 = [
            't2',
            'x',
            5
    ]
    static final def INPUTS378 = [
            't2',
            'x',
            6
    ]
    static final def INPUTS400 = [
            't2',
            'x',
            2
    ]
    static final def INPUTS411 = [
            't2',
            'x',
            9
    ]
    static final def INPUTS379 = [
            't2',
            'x',
            3
    ]
    static final def INPUTS401 = [
            't2',
            'x',
            8
    ]
    static final def INPUTS402 = [
            't2',
            'x',
            4
    ]
    static final def INPUTS413 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS403 = [
            't2',
            'x',
            1
    ]
    static final def INPUTS404 = [
            't2',
            'x',
            7
    ]
    static final def INPUTS415 = [
            12
    ]
    static final def INPUTS416 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS419 = [
            12
    ]

    static final def OUTPUTS380 = [
            't2',
            'x',
            3
    ]
    static final def OUTPUTS382 = [
            't2',
            'x',
            5
    ]
    static final def OUTPUTS384 = [
            't2',
            'x',
            2
    ]
    static final def OUTPUTS395 = [
            't2',
            'x',
            1
    ]
    static final def OUTPUTS385 = [
            't2',
            'x',
            8
    ]
    static final def OUTPUTS375 = [
            't2',
            12,
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
    static final def OUTPUTS386 = [
            't2',
            'x',
            4
    ]
    static final def OUTPUTS397 = [
            't2',
            'x',
            9
    ]
    static final def OUTPUTS388 = [
            't2',
            'x',
            7
    ]
    static final def OUTPUTS377 = [
            't2',
            'x',
            6
    ]
    static final def OUTPUTS399 = [
            't2',
            'x',
            5
    ]
    static final def OUTPUTS378 = [
            't2',
            'x',
            6
    ]
    static final def OUTPUTS400 = [
            't2',
            'x',
            2
    ]
    static final def OUTPUTS411 = [
            't2',
            'x',
            9
    ]
    static final def OUTPUTS379 = [
            't2',
            'x',
            3
    ]
    static final def OUTPUTS401 = [
            't2',
            'x',
            8
    ]
    static final def OUTPUTS402 = [
            't2',
            'x',
            4
    ]
    static final def OUTPUTS413 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS403 = [
            't2',
            'x',
            1
    ]
    static final def OUTPUTS404 = [
            't2',
            'x',
            7
    ]
    static final def OUTPUTS415 = [
            12
    ]
    static final def OUTPUTS416 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS419 = [
            12
    ]

    static final def RETURNED380 = [
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

    static final def RETURNED382 = [
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

    static final def RETURNED384 = [
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

    static final def RETURNED395 = [
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

    static final def RETURNED385 = [
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

    static final def RETURNED375 = [
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
            fromServiceC: 144,
    ] as com.etz.replay.unit.targets.ServiceData

    static final def RETURNED386 = [
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

    static final def RETURNED397 = [
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

    static final def RETURNED388 = [
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

    static final def RETURNED377 = [
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

    static final def RETURNED399 = [
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

    static final def RETURNED378 = [
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

    static final def RETURNED400 = [
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

    static final def RETURNED411 = [
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

    static final def RETURNED379 = [
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

    static final def RETURNED401 = [
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

    static final def RETURNED402 = [
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

    static final def RETURNED413 = 'null<>null'

    static final def RETURNED403 = [
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

    static final def RETURNED404 = [
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

    static final def RETURNED415 = 144

    static final def RETURNED416 = 'null<>null'

    static final def RETURNED419 = 144


}
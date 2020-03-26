package com.etz.pkg20200326224537

import spock.lang.Specification

class ServiceAImplhello305Spec extends Specification {
    void verifyhello() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceAImpl()
        subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
            1 * doServiceB({ p0 -> p0 == INPUTS334[0] }) >> RETURNED334
            1 * doServiceB({ p0 -> p0 == INPUTS347[0] }) >> RETURNED347
        }
        subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
            1 * makeX({ p0 -> p0 == INPUTS307[0] }, { p1 -> p1 == INPUTS307[1] }, { p2 -> p2 == INPUTS307[2] }) >> RETURNED307
            1 * makeX({ p0 -> p0 == INPUTS308[0] }, { p1 -> p1 == INPUTS308[1] }, { p2 -> p2 == INPUTS308[2] }) >> RETURNED308
            1 * makeX({ p0 -> p0 == INPUTS309[0] }, { p1 -> p1 == INPUTS309[1] }, { p2 -> p2 == INPUTS309[2] }) >> RETURNED309
            1 * makeX({ p0 -> p0 == INPUTS310[0] }, { p1 -> p1 == INPUTS310[1] }, { p2 -> p2 == INPUTS310[2] }) >> RETURNED310
            1 * makeX({ p0 -> p0 == INPUTS311[0] }, { p1 -> p1 == INPUTS311[1] }, { p2 -> p2 == INPUTS311[2] }) >> RETURNED311
            1 * makeX({ p0 -> p0 == INPUTS312[0] }, { p1 -> p1 == INPUTS312[1] }, { p2 -> p2 == INPUTS312[2] }) >> RETURNED312
            1 * makeX({ p0 -> p0 == INPUTS320[0] }, { p1 -> p1 == INPUTS320[1] }, { p2 -> p2 == INPUTS320[2] }) >> RETURNED320
            1 * makeX({ p0 -> p0 == INPUTS319[0] }, { p1 -> p1 == INPUTS319[1] }, { p2 -> p2 == INPUTS319[2] }) >> RETURNED319
            1 * makeX({ p0 -> p0 == INPUTS321[0] }, { p1 -> p1 == INPUTS321[1] }, { p2 -> p2 == INPUTS321[2] }) >> RETURNED321
            1 * makeX({ p0 -> p0 == INPUTS322[0] }, { p1 -> p1 == INPUTS322[1] }, { p2 -> p2 == INPUTS322[2] }) >> RETURNED322
            1 * makeX({ p0 -> p0 == INPUTS324[0] }, { p1 -> p1 == INPUTS324[1] }, { p2 -> p2 == INPUTS324[2] }) >> RETURNED324
            1 * makeX({ p0 -> p0 == INPUTS325[0] }, { p1 -> p1 == INPUTS325[1] }, { p2 -> p2 == INPUTS325[2] }) >> RETURNED325
            1 * makeX({ p0 -> p0 == INPUTS330[0] }, { p1 -> p1 == INPUTS330[1] }, { p2 -> p2 == INPUTS330[2] }) >> RETURNED330
            1 * makeX({ p0 -> p0 == INPUTS332[0] }, { p1 -> p1 == INPUTS332[1] }, { p2 -> p2 == INPUTS332[2] }) >> RETURNED332
            1 * makeX({ p0 -> p0 == INPUTS333[0] }, { p1 -> p1 == INPUTS333[1] }, { p2 -> p2 == INPUTS333[2] }) >> RETURNED333
            1 * makeX({ p0 -> p0 == INPUTS336[0] }, { p1 -> p1 == INPUTS336[1] }, { p2 -> p2 == INPUTS336[2] }) >> RETURNED336
            1 * makeX({ p0 -> p0 == INPUTS339[0] }, { p1 -> p1 == INPUTS339[1] }, { p2 -> p2 == INPUTS339[2] }) >> RETURNED339
            1 * makeX({ p0 -> p0 == INPUTS341[0] }, { p1 -> p1 == INPUTS341[1] }, { p2 -> p2 == INPUTS341[2] }) >> RETURNED341
        }
        subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
            1 * doServiceC({ p0 -> p0 == INPUTS343[0] }) >> RETURNED343
            1 * doServiceC({ p0 -> p0 == INPUTS349[0] }) >> RETURNED349
        }
        when:
        def ret = subject.hello(*INPUTS305)
        then:
        ret == RETURNED305
    }


    static final def INPUTS330 = [
            't2',
            'x',
            8
    ]
    static final def INPUTS341 = [
            't2',
            'x',
            9
    ]
    static final def INPUTS320 = [
            't2',
            'x',
            1
    ]
    static final def INPUTS310 = [
            't2',
            'x',
            8
    ]
    static final def INPUTS321 = [
            't2',
            'x',
            9
    ]
    static final def INPUTS332 = [
            't2',
            'x',
            4
    ]
    static final def INPUTS343 = [
            11
    ]
    static final def INPUTS311 = [
            't2',
            'x',
            4
    ]
    static final def INPUTS322 = [
            't2',
            'x',
            5
    ]
    static final def INPUTS333 = [
            't2',
            'x',
            2
    ]
    static final def INPUTS312 = [
            't2',
            'x',
            3
    ]
    static final def INPUTS334 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS324 = [
            't2',
            'x',
            7
    ]
    static final def INPUTS325 = [
            't2',
            'x',
            3
    ]
    static final def INPUTS336 = [
            't2',
            'x',
            1
    ]
    static final def INPUTS347 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS305 = [
            't2',
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
    static final def INPUTS349 = [
            11
    ]
    static final def INPUTS339 = [
            't2',
            'x',
            7
    ]
    static final def INPUTS307 = [
            't2',
            'x',
            6
    ]
    static final def INPUTS308 = [
            't2',
            'x',
            6
    ]
    static final def INPUTS319 = [
            't2',
            'x',
            5
    ]
    static final def INPUTS309 = [
            't2',
            'x',
            2
    ]

    static final def OUTPUTS330 = [
            't2',
            'x',
            8
    ]
    static final def OUTPUTS341 = [
            't2',
            'x',
            9
    ]
    static final def OUTPUTS320 = [
            't2',
            'x',
            1
    ]
    static final def OUTPUTS310 = [
            't2',
            'x',
            8
    ]
    static final def OUTPUTS321 = [
            't2',
            'x',
            9
    ]
    static final def OUTPUTS332 = [
            't2',
            'x',
            4
    ]
    static final def OUTPUTS343 = [
            11
    ]
    static final def OUTPUTS311 = [
            't2',
            'x',
            4
    ]
    static final def OUTPUTS322 = [
            't2',
            'x',
            5
    ]
    static final def OUTPUTS333 = [
            't2',
            'x',
            2
    ]
    static final def OUTPUTS312 = [
            't2',
            'x',
            3
    ]
    static final def OUTPUTS334 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS324 = [
            't2',
            'x',
            7
    ]
    static final def OUTPUTS325 = [
            't2',
            'x',
            3
    ]
    static final def OUTPUTS336 = [
            't2',
            'x',
            1
    ]
    static final def OUTPUTS347 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS305 = [
            't2',
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
    static final def OUTPUTS349 = [
            11
    ]
    static final def OUTPUTS339 = [
            't2',
            'x',
            7
    ]
    static final def OUTPUTS307 = [
            't2',
            'x',
            6
    ]
    static final def OUTPUTS308 = [
            't2',
            'x',
            6
    ]
    static final def OUTPUTS319 = [
            't2',
            'x',
            5
    ]
    static final def OUTPUTS309 = [
            't2',
            'x',
            2
    ]

    static final def RETURNED330 = [
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

    static final def RETURNED341 = [
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

    static final def RETURNED320 = [
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

    static final def RETURNED310 = [
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

    static final def RETURNED321 = [
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

    static final def RETURNED332 = [
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

    static final def RETURNED343 = 121

    static final def RETURNED311 = [
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

    static final def RETURNED322 = [
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

    static final def RETURNED333 = [
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

    static final def RETURNED312 = [
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

    static final def RETURNED334 = 'null<>null'

    static final def RETURNED324 = [
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

    static final def RETURNED325 = [
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

    static final def RETURNED336 = [
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

    static final def RETURNED347 = 'null<>null'

    static final def RETURNED305 = [
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
            fromServiceC: 121,
    ] as com.etz.replay.unit.targets.ServiceData

    static final def RETURNED349 = 121

    static final def RETURNED339 = [
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

    static final def RETURNED307 = [
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

    static final def RETURNED308 = [
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

    static final def RETURNED319 = [
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

    static final def RETURNED309 = [
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
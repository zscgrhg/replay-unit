package com.etz.pkg20200326224538

import spock.lang.Specification

class ServiceAImplhello585Spec extends Specification {
    void verifyhello() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceAImpl()
        subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
            1 * doServiceB({ p0 -> p0 == INPUTS622[0] }) >> RETURNED622
            1 * doServiceB({ p0 -> p0 == INPUTS625[0] }) >> RETURNED625
        }
        subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
            1 * makeX({ p0 -> p0 == INPUTS591[0] }, { p1 -> p1 == INPUTS591[1] }, { p2 -> p2 == INPUTS591[2] }) >> RETURNED591
            1 * makeX({ p0 -> p0 == INPUTS592[0] }, { p1 -> p1 == INPUTS592[1] }, { p2 -> p2 == INPUTS592[2] }) >> RETURNED592
            1 * makeX({ p0 -> p0 == INPUTS589[0] }, { p1 -> p1 == INPUTS589[1] }, { p2 -> p2 == INPUTS589[2] }) >> RETURNED589
            1 * makeX({ p0 -> p0 == INPUTS587[0] }, { p1 -> p1 == INPUTS587[1] }, { p2 -> p2 == INPUTS587[2] }) >> RETURNED587
            1 * makeX({ p0 -> p0 == INPUTS588[0] }, { p1 -> p1 == INPUTS588[1] }, { p2 -> p2 == INPUTS588[2] }) >> RETURNED588
            1 * makeX({ p0 -> p0 == INPUTS590[0] }, { p1 -> p1 == INPUTS590[1] }, { p2 -> p2 == INPUTS590[2] }) >> RETURNED590
            1 * makeX({ p0 -> p0 == INPUTS600[0] }, { p1 -> p1 == INPUTS600[1] }, { p2 -> p2 == INPUTS600[2] }) >> RETURNED600
            1 * makeX({ p0 -> p0 == INPUTS602[0] }, { p1 -> p1 == INPUTS602[1] }, { p2 -> p2 == INPUTS602[2] }) >> RETURNED602
            1 * makeX({ p0 -> p0 == INPUTS599[0] }, { p1 -> p1 == INPUTS599[1] }, { p2 -> p2 == INPUTS599[2] }) >> RETURNED599
            1 * makeX({ p0 -> p0 == INPUTS597[0] }, { p1 -> p1 == INPUTS597[1] }, { p2 -> p2 == INPUTS597[2] }) >> RETURNED597
            1 * makeX({ p0 -> p0 == INPUTS605[0] }, { p1 -> p1 == INPUTS605[1] }, { p2 -> p2 == INPUTS605[2] }) >> RETURNED605
            1 * makeX({ p0 -> p0 == INPUTS608[0] }, { p1 -> p1 == INPUTS608[1] }, { p2 -> p2 == INPUTS608[2] }) >> RETURNED608
            1 * makeX({ p0 -> p0 == INPUTS610[0] }, { p1 -> p1 == INPUTS610[1] }, { p2 -> p2 == INPUTS610[2] }) >> RETURNED610
            1 * makeX({ p0 -> p0 == INPUTS611[0] }, { p1 -> p1 == INPUTS611[1] }, { p2 -> p2 == INPUTS611[2] }) >> RETURNED611
            1 * makeX({ p0 -> p0 == INPUTS609[0] }, { p1 -> p1 == INPUTS609[1] }, { p2 -> p2 == INPUTS609[2] }) >> RETURNED609
            1 * makeX({ p0 -> p0 == INPUTS615[0] }, { p1 -> p1 == INPUTS615[1] }, { p2 -> p2 == INPUTS615[2] }) >> RETURNED615
            1 * makeX({ p0 -> p0 == INPUTS619[0] }, { p1 -> p1 == INPUTS619[1] }, { p2 -> p2 == INPUTS619[2] }) >> RETURNED619
            1 * makeX({ p0 -> p0 == INPUTS616[0] }, { p1 -> p1 == INPUTS616[1] }, { p2 -> p2 == INPUTS616[2] }) >> RETURNED616
        }
        subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
            1 * doServiceC({ p0 -> p0 == INPUTS626[0] }) >> RETURNED626
            1 * doServiceC({ p0 -> p0 == INPUTS629[0] }) >> RETURNED629
        }
        when:
        def ret = subject.hello(*INPUTS585)
        then:
        ret == RETURNED585
    }


    static final def INPUTS590 = [
            't2',
            'x',
            5
    ]
    static final def INPUTS591 = [
            't2',
            'x',
            6
    ]
    static final def INPUTS592 = [
            't2',
            'x',
            3
    ]
    static final def INPUTS585 = [
            't2',
            14,
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
    static final def INPUTS597 = [
            't2',
            'x',
            4
    ]
    static final def INPUTS587 = [
            't2',
            'x',
            6
    ]
    static final def INPUTS588 = [
            't2',
            'x',
            3
    ]
    static final def INPUTS599 = [
            't2',
            'x',
            9
    ]
    static final def INPUTS610 = [
            't2',
            'x',
            1
    ]
    static final def INPUTS589 = [
            't2',
            'x',
            8
    ]
    static final def INPUTS600 = [
            't2',
            'x',
            5
    ]
    static final def INPUTS611 = [
            't2',
            'x',
            2
    ]
    static final def INPUTS622 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS602 = [
            't2',
            'x',
            2
    ]
    static final def INPUTS625 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS615 = [
            't2',
            'x',
            7
    ]
    static final def INPUTS626 = [
            14
    ]
    static final def INPUTS605 = [
            't2',
            'x',
            4
    ]
    static final def INPUTS616 = [
            't2',
            'x',
            9
    ]
    static final def INPUTS629 = [
            14
    ]
    static final def INPUTS608 = [
            't2',
            'x',
            8
    ]
    static final def INPUTS619 = [
            't2',
            'x',
            1
    ]
    static final def INPUTS609 = [
            't2',
            'x',
            7
    ]

    static final def OUTPUTS590 = [
            't2',
            'x',
            5
    ]
    static final def OUTPUTS591 = [
            't2',
            'x',
            6
    ]
    static final def OUTPUTS592 = [
            't2',
            'x',
            3
    ]
    static final def OUTPUTS585 = [
            't2',
            14,
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
    static final def OUTPUTS597 = [
            't2',
            'x',
            4
    ]
    static final def OUTPUTS587 = [
            't2',
            'x',
            6
    ]
    static final def OUTPUTS588 = [
            't2',
            'x',
            3
    ]
    static final def OUTPUTS599 = [
            't2',
            'x',
            9
    ]
    static final def OUTPUTS610 = [
            't2',
            'x',
            1
    ]
    static final def OUTPUTS589 = [
            't2',
            'x',
            8
    ]
    static final def OUTPUTS600 = [
            't2',
            'x',
            5
    ]
    static final def OUTPUTS611 = [
            't2',
            'x',
            2
    ]
    static final def OUTPUTS622 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS602 = [
            't2',
            'x',
            2
    ]
    static final def OUTPUTS625 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS615 = [
            't2',
            'x',
            7
    ]
    static final def OUTPUTS626 = [
            14
    ]
    static final def OUTPUTS605 = [
            't2',
            'x',
            4
    ]
    static final def OUTPUTS616 = [
            't2',
            'x',
            9
    ]
    static final def OUTPUTS629 = [
            14
    ]
    static final def OUTPUTS608 = [
            't2',
            'x',
            8
    ]
    static final def OUTPUTS619 = [
            't2',
            'x',
            1
    ]
    static final def OUTPUTS609 = [
            't2',
            'x',
            7
    ]

    static final def RETURNED590 = [
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

    static final def RETURNED591 = [
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

    static final def RETURNED592 = [
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

    static final def RETURNED585 = [
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
            fromServiceC: 196,
    ] as com.etz.replay.unit.targets.ServiceData

    static final def RETURNED597 = [
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

    static final def RETURNED587 = [
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

    static final def RETURNED588 = [
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

    static final def RETURNED599 = [
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

    static final def RETURNED610 = [
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

    static final def RETURNED589 = [
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

    static final def RETURNED600 = [
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

    static final def RETURNED611 = [
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

    static final def RETURNED622 = 'null<>null'

    static final def RETURNED602 = [
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

    static final def RETURNED625 = 'null<>null'

    static final def RETURNED615 = [
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

    static final def RETURNED626 = 196

    static final def RETURNED605 = [
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

    static final def RETURNED616 = [
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

    static final def RETURNED629 = 196

    static final def RETURNED608 = [
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

    static final def RETURNED619 = [
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

    static final def RETURNED609 = [
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
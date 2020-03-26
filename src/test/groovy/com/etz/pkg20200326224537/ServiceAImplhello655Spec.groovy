package com.etz.pkg20200326224538

import spock.lang.Specification

class ServiceAImplhello655Spec extends Specification {
    void verifyhello() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceAImpl()
        subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
            1 * doServiceB({ p0 -> p0 == INPUTS692[0] }) >> RETURNED692
            1 * doServiceB({ p0 -> p0 == INPUTS695[0] }) >> RETURNED695
        }
        subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
            1 * makeX({ p0 -> p0 == INPUTS658[0] }, { p1 -> p1 == INPUTS658[1] }, { p2 -> p2 == INPUTS658[2] }) >> RETURNED658
            1 * makeX({ p0 -> p0 == INPUTS660[0] }, { p1 -> p1 == INPUTS660[1] }, { p2 -> p2 == INPUTS660[2] }) >> RETURNED660
            1 * makeX({ p0 -> p0 == INPUTS662[0] }, { p1 -> p1 == INPUTS662[1] }, { p2 -> p2 == INPUTS662[2] }) >> RETURNED662
            1 * makeX({ p0 -> p0 == INPUTS664[0] }, { p1 -> p1 == INPUTS664[1] }, { p2 -> p2 == INPUTS664[2] }) >> RETURNED664
            1 * makeX({ p0 -> p0 == INPUTS666[0] }, { p1 -> p1 == INPUTS666[1] }, { p2 -> p2 == INPUTS666[2] }) >> RETURNED666
            1 * makeX({ p0 -> p0 == INPUTS668[0] }, { p1 -> p1 == INPUTS668[1] }, { p2 -> p2 == INPUTS668[2] }) >> RETURNED668
            1 * makeX({ p0 -> p0 == INPUTS670[0] }, { p1 -> p1 == INPUTS670[1] }, { p2 -> p2 == INPUTS670[2] }) >> RETURNED670
            1 * makeX({ p0 -> p0 == INPUTS672[0] }, { p1 -> p1 == INPUTS672[1] }, { p2 -> p2 == INPUTS672[2] }) >> RETURNED672
            1 * makeX({ p0 -> p0 == INPUTS674[0] }, { p1 -> p1 == INPUTS674[1] }, { p2 -> p2 == INPUTS674[2] }) >> RETURNED674
            1 * makeX({ p0 -> p0 == INPUTS675[0] }, { p1 -> p1 == INPUTS675[1] }, { p2 -> p2 == INPUTS675[2] }) >> RETURNED675
            1 * makeX({ p0 -> p0 == INPUTS657[0] }, { p1 -> p1 == INPUTS657[1] }, { p2 -> p2 == INPUTS657[2] }) >> RETURNED657
            1 * makeX({ p0 -> p0 == INPUTS677[0] }, { p1 -> p1 == INPUTS677[1] }, { p2 -> p2 == INPUTS677[2] }) >> RETURNED677
            1 * makeX({ p0 -> p0 == INPUTS680[0] }, { p1 -> p1 == INPUTS680[1] }, { p2 -> p2 == INPUTS680[2] }) >> RETURNED680
            1 * makeX({ p0 -> p0 == INPUTS681[0] }, { p1 -> p1 == INPUTS681[1] }, { p2 -> p2 == INPUTS681[2] }) >> RETURNED681
            1 * makeX({ p0 -> p0 == INPUTS684[0] }, { p1 -> p1 == INPUTS684[1] }, { p2 -> p2 == INPUTS684[2] }) >> RETURNED684
            1 * makeX({ p0 -> p0 == INPUTS688[0] }, { p1 -> p1 == INPUTS688[1] }, { p2 -> p2 == INPUTS688[2] }) >> RETURNED688
            1 * makeX({ p0 -> p0 == INPUTS687[0] }, { p1 -> p1 == INPUTS687[1] }, { p2 -> p2 == INPUTS687[2] }) >> RETURNED687
            1 * makeX({ p0 -> p0 == INPUTS683[0] }, { p1 -> p1 == INPUTS683[1] }, { p2 -> p2 == INPUTS683[2] }) >> RETURNED683
        }
        subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
            1 * doServiceC({ p0 -> p0 == INPUTS697[0] }) >> RETURNED697
            1 * doServiceC({ p0 -> p0 == INPUTS699[0] }) >> RETURNED699
        }
        when:
        def ret = subject.hello(*INPUTS655)
        then:
        ret == RETURNED655
    }


    static final def INPUTS680 = [
            't2',
            'x',
            7
    ]
    static final def INPUTS670 = [
            't2',
            'x',
            7
    ]
    static final def INPUTS681 = [
            't2',
            'x',
            9
    ]
    static final def INPUTS692 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS660 = [
            't2',
            'x',
            4
    ]
    static final def INPUTS672 = [
            't2',
            'x',
            5
    ]
    static final def INPUTS683 = [
            't2',
            'x',
            5
    ]
    static final def INPUTS662 = [
            't2',
            'x',
            2
    ]
    static final def INPUTS684 = [
            't2',
            'x',
            4
    ]
    static final def INPUTS695 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS674 = [
            't2',
            'x',
            6
    ]
    static final def INPUTS664 = [
            't2',
            'x',
            1
    ]
    static final def INPUTS675 = [
            't2',
            'x',
            3
    ]
    static final def INPUTS697 = [
            3
    ]
    static final def INPUTS687 = [
            't2',
            'x',
            2
    ]
    static final def INPUTS655 = [
            't2',
            3,
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
    static final def INPUTS666 = [
            't2',
            'x',
            8
    ]
    static final def INPUTS677 = [
            't2',
            'x',
            8
    ]
    static final def INPUTS688 = [
            't2',
            'x',
            1
    ]
    static final def INPUTS699 = [
            3
    ]
    static final def INPUTS668 = [
            't2',
            'x',
            9
    ]
    static final def INPUTS657 = [
            't2',
            'x',
            6
    ]
    static final def INPUTS658 = [
            't2',
            'x',
            3
    ]

    static final def OUTPUTS680 = [
            't2',
            'x',
            7
    ]
    static final def OUTPUTS670 = [
            't2',
            'x',
            7
    ]
    static final def OUTPUTS681 = [
            't2',
            'x',
            9
    ]
    static final def OUTPUTS692 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS660 = [
            't2',
            'x',
            4
    ]
    static final def OUTPUTS672 = [
            't2',
            'x',
            5
    ]
    static final def OUTPUTS683 = [
            't2',
            'x',
            5
    ]
    static final def OUTPUTS662 = [
            't2',
            'x',
            2
    ]
    static final def OUTPUTS684 = [
            't2',
            'x',
            4
    ]
    static final def OUTPUTS695 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS674 = [
            't2',
            'x',
            6
    ]
    static final def OUTPUTS664 = [
            't2',
            'x',
            1
    ]
    static final def OUTPUTS675 = [
            't2',
            'x',
            3
    ]
    static final def OUTPUTS697 = [
            3
    ]
    static final def OUTPUTS687 = [
            't2',
            'x',
            2
    ]
    static final def OUTPUTS655 = [
            't2',
            3,
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
    static final def OUTPUTS666 = [
            't2',
            'x',
            8
    ]
    static final def OUTPUTS677 = [
            't2',
            'x',
            8
    ]
    static final def OUTPUTS688 = [
            't2',
            'x',
            1
    ]
    static final def OUTPUTS699 = [
            3
    ]
    static final def OUTPUTS668 = [
            't2',
            'x',
            9
    ]
    static final def OUTPUTS657 = [
            't2',
            'x',
            6
    ]
    static final def OUTPUTS658 = [
            't2',
            'x',
            3
    ]

    static final def RETURNED680 = [
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

    static final def RETURNED670 = [
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

    static final def RETURNED681 = [
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

    static final def RETURNED692 = 'null<>null'

    static final def RETURNED660 = [
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

    static final def RETURNED672 = [
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

    static final def RETURNED683 = [
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

    static final def RETURNED662 = [
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

    static final def RETURNED684 = [
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

    static final def RETURNED695 = 'null<>null'

    static final def RETURNED674 = [
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

    static final def RETURNED664 = [
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

    static final def RETURNED675 = [
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

    static final def RETURNED697 = 9

    static final def RETURNED687 = [
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

    static final def RETURNED655 = [
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
            fromServiceC: 9,
    ] as com.etz.replay.unit.targets.ServiceData

    static final def RETURNED666 = [
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

    static final def RETURNED677 = [
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

    static final def RETURNED688 = [
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

    static final def RETURNED699 = 9

    static final def RETURNED668 = [
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

    static final def RETURNED657 = [
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

    static final def RETURNED658 = [
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
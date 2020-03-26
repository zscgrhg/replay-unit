package com.etz.pkg20200326224537

import spock.lang.Specification

class ServiceAImplhello165Spec extends Specification {
    void verifyhello() {
        given:
        def subject = new com.etz.replay.unit.targets.ServiceAImpl()
        subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
            1 * doServiceB({ p0 -> p0 == INPUTS198[0] }) >> RETURNED198
            1 * doServiceB({ p0 -> p0 == INPUTS206[0] }) >> RETURNED206
        }
        subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
            1 * makeX({ p0 -> p0 == INPUTS170[0] }, { p1 -> p1 == INPUTS170[1] }, { p2 -> p2 == INPUTS170[2] }) >> RETURNED170
            1 * makeX({ p0 -> p0 == INPUTS169[0] }, { p1 -> p1 == INPUTS169[1] }, { p2 -> p2 == INPUTS169[2] }) >> RETURNED169
            1 * makeX({ p0 -> p0 == INPUTS168[0] }, { p1 -> p1 == INPUTS168[1] }, { p2 -> p2 == INPUTS168[2] }) >> RETURNED168
            1 * makeX({ p0 -> p0 == INPUTS167[0] }, { p1 -> p1 == INPUTS167[1] }, { p2 -> p2 == INPUTS167[2] }) >> RETURNED167
            1 * makeX({ p0 -> p0 == INPUTS172[0] }, { p1 -> p1 == INPUTS172[1] }, { p2 -> p2 == INPUTS172[2] }) >> RETURNED172
            1 * makeX({ p0 -> p0 == INPUTS171[0] }, { p1 -> p1 == INPUTS171[1] }, { p2 -> p2 == INPUTS171[2] }) >> RETURNED171
            1 * makeX({ p0 -> p0 == INPUTS179[0] }, { p1 -> p1 == INPUTS179[1] }, { p2 -> p2 == INPUTS179[2] }) >> RETURNED179
            1 * makeX({ p0 -> p0 == INPUTS183[0] }, { p1 -> p1 == INPUTS183[1] }, { p2 -> p2 == INPUTS183[2] }) >> RETURNED183
            1 * makeX({ p0 -> p0 == INPUTS180[0] }, { p1 -> p1 == INPUTS180[1] }, { p2 -> p2 == INPUTS180[2] }) >> RETURNED180
            1 * makeX({ p0 -> p0 == INPUTS181[0] }, { p1 -> p1 == INPUTS181[1] }, { p2 -> p2 == INPUTS181[2] }) >> RETURNED181
            1 * makeX({ p0 -> p0 == INPUTS182[0] }, { p1 -> p1 == INPUTS182[1] }, { p2 -> p2 == INPUTS182[2] }) >> RETURNED182
            1 * makeX({ p0 -> p0 == INPUTS185[0] }, { p1 -> p1 == INPUTS185[1] }, { p2 -> p2 == INPUTS185[2] }) >> RETURNED185
            1 * makeX({ p0 -> p0 == INPUTS189[0] }, { p1 -> p1 == INPUTS189[1] }, { p2 -> p2 == INPUTS189[2] }) >> RETURNED189
            1 * makeX({ p0 -> p0 == INPUTS192[0] }, { p1 -> p1 == INPUTS192[1] }, { p2 -> p2 == INPUTS192[2] }) >> RETURNED192
            1 * makeX({ p0 -> p0 == INPUTS194[0] }, { p1 -> p1 == INPUTS194[1] }, { p2 -> p2 == INPUTS194[2] }) >> RETURNED194
            1 * makeX({ p0 -> p0 == INPUTS196[0] }, { p1 -> p1 == INPUTS196[1] }, { p2 -> p2 == INPUTS196[2] }) >> RETURNED196
            1 * makeX({ p0 -> p0 == INPUTS195[0] }, { p1 -> p1 == INPUTS195[1] }, { p2 -> p2 == INPUTS195[2] }) >> RETURNED195
            1 * makeX({ p0 -> p0 == INPUTS201[0] }, { p1 -> p1 == INPUTS201[1] }, { p2 -> p2 == INPUTS201[2] }) >> RETURNED201
        }
        subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
            1 * doServiceC({ p0 -> p0 == INPUTS205[0] }) >> RETURNED205
            1 * doServiceC({ p0 -> p0 == INPUTS209[0] }) >> RETURNED209
        }
        when:
        def ret = subject.hello(*INPUTS165)
        then:
        ret == RETURNED165
    }


    static final def INPUTS180 = [
            't2',
            'x',
            5
    ]
    static final def INPUTS170 = [
            't2',
            'x',
            8
    ]
    static final def INPUTS181 = [
            't2',
            'x',
            4
    ]
    static final def INPUTS192 = [
            't2',
            'x',
            8
    ]
    static final def INPUTS171 = [
            't2',
            'x',
            3
    ]
    static final def INPUTS182 = [
            't2',
            'x',
            4
    ]
    static final def INPUTS172 = [
            't2',
            'x',
            2
    ]
    static final def INPUTS183 = [
            't2',
            'x',
            5
    ]
    static final def INPUTS194 = [
            't2',
            'x',
            1
    ]
    static final def INPUTS195 = [
            't2',
            'x',
            2
    ]
    static final def INPUTS185 = [
            't2',
            'x',
            1
    ]
    static final def INPUTS196 = [
            't2',
            'x',
            7
    ]
    static final def INPUTS165 = [
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
    static final def INPUTS198 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS167 = [
            't2',
            'x',
            6
    ]
    static final def INPUTS189 = [
            't2',
            'x',
            7
    ]
    static final def INPUTS168 = [
            't2',
            'x',
            3
    ]
    static final def INPUTS179 = [
            't2',
            'x',
            9
    ]
    static final def INPUTS201 = [
            't2',
            'x',
            9
    ]
    static final def INPUTS169 = [
            't2',
            'x',
            6
    ]
    static final def INPUTS205 = [
            11
    ]
    static final def INPUTS206 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def INPUTS209 = [
            11
    ]

    static final def OUTPUTS180 = [
            't2',
            'x',
            5
    ]
    static final def OUTPUTS170 = [
            't2',
            'x',
            8
    ]
    static final def OUTPUTS181 = [
            't2',
            'x',
            4
    ]
    static final def OUTPUTS192 = [
            't2',
            'x',
            8
    ]
    static final def OUTPUTS171 = [
            't2',
            'x',
            3
    ]
    static final def OUTPUTS182 = [
            't2',
            'x',
            4
    ]
    static final def OUTPUTS172 = [
            't2',
            'x',
            2
    ]
    static final def OUTPUTS183 = [
            't2',
            'x',
            5
    ]
    static final def OUTPUTS194 = [
            't2',
            'x',
            1
    ]
    static final def OUTPUTS195 = [
            't2',
            'x',
            2
    ]
    static final def OUTPUTS185 = [
            't2',
            'x',
            1
    ]
    static final def OUTPUTS196 = [
            't2',
            'x',
            7
    ]
    static final def OUTPUTS165 = [
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
    static final def OUTPUTS198 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS167 = [
            't2',
            'x',
            6
    ]
    static final def OUTPUTS189 = [
            't2',
            'x',
            7
    ]
    static final def OUTPUTS168 = [
            't2',
            'x',
            3
    ]
    static final def OUTPUTS179 = [
            't2',
            'x',
            9
    ]
    static final def OUTPUTS201 = [
            't2',
            'x',
            9
    ]
    static final def OUTPUTS169 = [
            't2',
            'x',
            6
    ]
    static final def OUTPUTS205 = [
            11
    ]
    static final def OUTPUTS206 = [
            [
                    fieldFromX: null,
                    dataFromX : null,
                    dataY     : null,
            ] as com.etz.replay.unit.targets.DataX
    ]
    static final def OUTPUTS209 = [
            11
    ]

    static final def RETURNED180 = [
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

    static final def RETURNED170 = [
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

    static final def RETURNED181 = [
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

    static final def RETURNED192 = [
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

    static final def RETURNED171 = [
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

    static final def RETURNED182 = [
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

    static final def RETURNED172 = [
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

    static final def RETURNED183 = [
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

    static final def RETURNED194 = [
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

    static final def RETURNED195 = [
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

    static final def RETURNED185 = [
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

    static final def RETURNED196 = [
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

    static final def RETURNED165 = [
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

    static final def RETURNED198 = 'null<>null'

    static final def RETURNED167 = [
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

    static final def RETURNED189 = [
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

    static final def RETURNED168 = [
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

    static final def RETURNED179 = [
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

    static final def RETURNED201 = [
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

    static final def RETURNED169 = [
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

    static final def RETURNED205 = 121

    static final def RETURNED206 = 'null<>null'

    static final def RETURNED209 = 121


}
def args = [
        't1',
        1,
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
        ] as com.etz.replay.unit.targets.DataX,
]

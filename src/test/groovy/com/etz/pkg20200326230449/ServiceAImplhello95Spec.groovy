package com.etz.pkg20200326230450

import spock.lang.Specification

class ServiceAImplhello95Spec extends Specification {
	void verifyhello() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceAImpl()
			subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
				1 * doServiceB({ p0 -> p0 == INPUTS132[0] }) >> RETURNED132
				1 * doServiceB({ p0 -> p0 == INPUTS135[0] }) >> RETURNED135
			}
			subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
				1 * makeX({ p0 -> p0 == INPUTS97[0] }, { p1 -> p1 == INPUTS97[1] }, { p2 -> p2 == INPUTS97[2] }) >> RETURNED97
				1 * makeX({ p0 -> p0 == INPUTS100[0] }, { p1 -> p1 == INPUTS100[1] }, { p2 -> p2 == INPUTS100[2] }) >> RETURNED100
				1 * makeX({ p0 -> p0 == INPUTS98[0] }, { p1 -> p1 == INPUTS98[1] }, { p2 -> p2 == INPUTS98[2] }) >> RETURNED98
				1 * makeX({ p0 -> p0 == INPUTS104[0] }, { p1 -> p1 == INPUTS104[1] }, { p2 -> p2 == INPUTS104[2] }) >> RETURNED104
				1 * makeX({ p0 -> p0 == INPUTS99[0] }, { p1 -> p1 == INPUTS99[1] }, { p2 -> p2 == INPUTS99[2] }) >> RETURNED99
				1 * makeX({ p0 -> p0 == INPUTS102[0] }, { p1 -> p1 == INPUTS102[1] }, { p2 -> p2 == INPUTS102[2] }) >> RETURNED102
				1 * makeX({ p0 -> p0 == INPUTS106[0] }, { p1 -> p1 == INPUTS106[1] }, { p2 -> p2 == INPUTS106[2] }) >> RETURNED106
				1 * makeX({ p0 -> p0 == INPUTS107[0] }, { p1 -> p1 == INPUTS107[1] }, { p2 -> p2 == INPUTS107[2] }) >> RETURNED107
				1 * makeX({ p0 -> p0 == INPUTS113[0] }, { p1 -> p1 == INPUTS113[1] }, { p2 -> p2 == INPUTS113[2] }) >> RETURNED113
				1 * makeX({ p0 -> p0 == INPUTS114[0] }, { p1 -> p1 == INPUTS114[1] }, { p2 -> p2 == INPUTS114[2] }) >> RETURNED114
				1 * makeX({ p0 -> p0 == INPUTS115[0] }, { p1 -> p1 == INPUTS115[1] }, { p2 -> p2 == INPUTS115[2] }) >> RETURNED115
				1 * makeX({ p0 -> p0 == INPUTS117[0] }, { p1 -> p1 == INPUTS117[1] }, { p2 -> p2 == INPUTS117[2] }) >> RETURNED117
				1 * makeX({ p0 -> p0 == INPUTS116[0] }, { p1 -> p1 == INPUTS116[1] }, { p2 -> p2 == INPUTS116[2] }) >> RETURNED116
				1 * makeX({ p0 -> p0 == INPUTS119[0] }, { p1 -> p1 == INPUTS119[1] }, { p2 -> p2 == INPUTS119[2] }) >> RETURNED119
				1 * makeX({ p0 -> p0 == INPUTS122[0] }, { p1 -> p1 == INPUTS122[1] }, { p2 -> p2 == INPUTS122[2] }) >> RETURNED122
				1 * makeX({ p0 -> p0 == INPUTS126[0] }, { p1 -> p1 == INPUTS126[1] }, { p2 -> p2 == INPUTS126[2] }) >> RETURNED126
				1 * makeX({ p0 -> p0 == INPUTS127[0] }, { p1 -> p1 == INPUTS127[1] }, { p2 -> p2 == INPUTS127[2] }) >> RETURNED127
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
			3
	]
	static final def INPUTS132 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS100 = [
			't2',
			'x',
			3
	]
	static final def INPUTS122 = [
			't2',
			'x',
			7
	]
	static final def INPUTS102 = [
			't2',
			'x',
			8
	]
	static final def INPUTS113 = [
			't2',
			'x',
			5
	]
	static final def INPUTS135 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS114 = [
			't2',
			'x',
			1
	]
	static final def INPUTS136 = [
			3
	]
	static final def INPUTS104 = [
			't2',
			'x',
			2
	]
	static final def INPUTS115 = [
			't2',
			'x',
			8
	]
	static final def INPUTS126 = [
			't2',
			'x',
			9
	]
	static final def INPUTS116 = [
			't2',
			'x',
			4
	]
	static final def INPUTS127 = [
			't2',
			'x',
			1
	]
	static final def INPUTS106 = [
			't2',
			'x',
			4
	]
	static final def INPUTS117 = [
			't2',
			'x',
			9
	]
	static final def INPUTS139 = [
			3
	]
	static final def INPUTS107 = [
			't2',
			'x',
			5
	]
	static final def INPUTS129 = [
			't2',
			'x',
			7
	]
	static final def INPUTS119 = [
			't2',
			'x',
			2
	]
	static final def INPUTS95 = [
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
	static final def INPUTS97 = [
			't2',
			'x',
			6
	]
	static final def INPUTS98 = [
			't2',
			'x',
			6
	]
	
	static final def OUTPUTS99 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS132 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS100 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS122 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS102 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS113 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS135 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS114 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS136 = [
			3
	]
	static final def OUTPUTS104 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS115 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS126 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS116 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS127 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS106 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS117 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS139 = [
			3
	]
	static final def OUTPUTS107 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS129 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS119 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS95 = [
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
	static final def OUTPUTS97 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS98 = [
			't2',
			'x',
			6
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
	
	static final def RETURNED132 = 'null<>null'
	
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
	
	static final def RETURNED135 = 'null<>null'
	
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
	
	static final def RETURNED136 = 9
	
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
	
	static final def RETURNED127 = [
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
	
	static final def RETURNED117 = [
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
	
	static final def RETURNED139 = 9
	
	static final def RETURNED107 = [
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
	
	static final def RETURNED119 = [
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
			fromServiceC: 9,
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
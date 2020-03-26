package com.etz.pkg20200326230733

import spock.lang.Specification

class ServiceAImplhello95Spec extends Specification {
	void verifyhello() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceAImpl()
			subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
				1 * doServiceB({ p0 -> p0 == INPUTS131[0] }) >> RETURNED131
				1 * doServiceB({ p0 -> p0 == INPUTS135[0] }) >> RETURNED135
			}
			subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
				1 * makeX({ p0 -> p0 == INPUTS97[0] }, { p1 -> p1 == INPUTS97[1] }, { p2 -> p2 == INPUTS97[2] }) >> RETURNED97
				1 * makeX({ p0 -> p0 == INPUTS100[0] }, { p1 -> p1 == INPUTS100[1] }, { p2 -> p2 == INPUTS100[2] }) >> RETURNED100
				1 * makeX({ p0 -> p0 == INPUTS99[0] }, { p1 -> p1 == INPUTS99[1] }, { p2 -> p2 == INPUTS99[2] }) >> RETURNED99
				1 * makeX({ p0 -> p0 == INPUTS101[0] }, { p1 -> p1 == INPUTS101[1] }, { p2 -> p2 == INPUTS101[2] }) >> RETURNED101
				1 * makeX({ p0 -> p0 == INPUTS98[0] }, { p1 -> p1 == INPUTS98[1] }, { p2 -> p2 == INPUTS98[2] }) >> RETURNED98
				1 * makeX({ p0 -> p0 == INPUTS102[0] }, { p1 -> p1 == INPUTS102[1] }, { p2 -> p2 == INPUTS102[2] }) >> RETURNED102
				1 * makeX({ p0 -> p0 == INPUTS110[0] }, { p1 -> p1 == INPUTS110[1] }, { p2 -> p2 == INPUTS110[2] }) >> RETURNED110
				1 * makeX({ p0 -> p0 == INPUTS109[0] }, { p1 -> p1 == INPUTS109[1] }, { p2 -> p2 == INPUTS109[2] }) >> RETURNED109
				1 * makeX({ p0 -> p0 == INPUTS111[0] }, { p1 -> p1 == INPUTS111[1] }, { p2 -> p2 == INPUTS111[2] }) >> RETURNED111
				1 * makeX({ p0 -> p0 == INPUTS114[0] }, { p1 -> p1 == INPUTS114[1] }, { p2 -> p2 == INPUTS114[2] }) >> RETURNED114
				1 * makeX({ p0 -> p0 == INPUTS116[0] }, { p1 -> p1 == INPUTS116[1] }, { p2 -> p2 == INPUTS116[2] }) >> RETURNED116
				1 * makeX({ p0 -> p0 == INPUTS112[0] }, { p1 -> p1 == INPUTS112[1] }, { p2 -> p2 == INPUTS112[2] }) >> RETURNED112
				1 * makeX({ p0 -> p0 == INPUTS119[0] }, { p1 -> p1 == INPUTS119[1] }, { p2 -> p2 == INPUTS119[2] }) >> RETURNED119
				1 * makeX({ p0 -> p0 == INPUTS118[0] }, { p1 -> p1 == INPUTS118[1] }, { p2 -> p2 == INPUTS118[2] }) >> RETURNED118
				1 * makeX({ p0 -> p0 == INPUTS125[0] }, { p1 -> p1 == INPUTS125[1] }, { p2 -> p2 == INPUTS125[2] }) >> RETURNED125
				1 * makeX({ p0 -> p0 == INPUTS127[0] }, { p1 -> p1 == INPUTS127[1] }, { p2 -> p2 == INPUTS127[2] }) >> RETURNED127
				1 * makeX({ p0 -> p0 == INPUTS126[0] }, { p1 -> p1 == INPUTS126[1] }, { p2 -> p2 == INPUTS126[2] }) >> RETURNED126
				1 * makeX({ p0 -> p0 == INPUTS128[0] }, { p1 -> p1 == INPUTS128[1] }, { p2 -> p2 == INPUTS128[2] }) >> RETURNED128
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
			6
	]
	static final def INPUTS131 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS110 = [
			't2',
			'x',
			5
	]
	static final def INPUTS100 = [
			't2',
			'x',
			2
	]
	static final def INPUTS111 = [
			't2',
			'x',
			9
	]
	static final def INPUTS101 = [
			't2',
			'x',
			8
	]
	static final def INPUTS112 = [
			't2',
			'x',
			3
	]
	static final def INPUTS102 = [
			't2',
			'x',
			4
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
			5
	]
	static final def INPUTS125 = [
			't2',
			'x',
			4
	]
	static final def INPUTS136 = [
			17
	]
	static final def INPUTS126 = [
			't2',
			'x',
			8
	]
	static final def INPUTS116 = [
			't2',
			'x',
			2
	]
	static final def INPUTS127 = [
			't2',
			'x',
			7
	]
	static final def INPUTS128 = [
			't2',
			'x',
			9
	]
	static final def INPUTS139 = [
			17
	]
	static final def INPUTS118 = [
			't2',
			'x',
			7
	]
	static final def INPUTS119 = [
			't2',
			'x',
			1
	]
	static final def INPUTS109 = [
			't2',
			'x',
			1
	]
	static final def INPUTS95 = [
			't2',
			17,
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
	static final def OUTPUTS131 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS110 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS100 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS111 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS101 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS112 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS102 = [
			't2',
			'x',
			4
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
			5
	]
	static final def OUTPUTS125 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS136 = [
			17
	]
	static final def OUTPUTS126 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS116 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS127 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS128 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS139 = [
			17
	]
	static final def OUTPUTS118 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS119 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS109 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS95 = [
			't2',
			17,
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
	
	static final def RETURNED131 = 'null<>null'
	
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
	
	static final def RETURNED136 = 289
	
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
	
	static final def RETURNED128 = [
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
	
	static final def RETURNED139 = 289
	
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
			fromServiceC: 289,
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
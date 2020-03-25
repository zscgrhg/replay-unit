package com.etz

import spock.lang.Specification

class ServiceAImpldoServiceA21Spec extends Specification {
	void verifydoServiceA2() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceAImpl()
			subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
				1 * doServiceB({ p0 -> p0 == INPUTS3[0] }) >> RETURNED3
				1 * doServiceB({ p0 -> p0 == INPUTS25[0] }) >> RETURNED25
			}
			subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
				1 * makeX({ p0 -> p0 == INPUTS5[0] }, { p1 -> p1 == INPUTS5[1] }, { p2 -> p2 == INPUTS5[2] }) >> RETURNED5
				1 * makeX({ p0 -> p0 == INPUTS6[0] }, { p1 -> p1 == INPUTS6[1] }, { p2 -> p2 == INPUTS6[2] }) >> RETURNED6
				1 * makeX({ p0 -> p0 == INPUTS10[0] }, { p1 -> p1 == INPUTS10[1] }, { p2 -> p2 == INPUTS10[2] }) >> RETURNED10
				1 * makeX({ p0 -> p0 == INPUTS8[0] }, { p1 -> p1 == INPUTS8[1] }, { p2 -> p2 == INPUTS8[2] }) >> RETURNED8
				1 * makeX({ p0 -> p0 == INPUTS7[0] }, { p1 -> p1 == INPUTS7[1] }, { p2 -> p2 == INPUTS7[2] }) >> RETURNED7
				1 * makeX({ p0 -> p0 == INPUTS9[0] }, { p1 -> p1 == INPUTS9[1] }, { p2 -> p2 == INPUTS9[2] }) >> RETURNED9
				1 * makeX({ p0 -> p0 == INPUTS17[0] }, { p1 -> p1 == INPUTS17[1] }, { p2 -> p2 == INPUTS17[2] }) >> RETURNED17
				1 * makeX({ p0 -> p0 == INPUTS19[0] }, { p1 -> p1 == INPUTS19[1] }, { p2 -> p2 == INPUTS19[2] }) >> RETURNED19
				1 * makeX({ p0 -> p0 == INPUTS18[0] }, { p1 -> p1 == INPUTS18[1] }, { p2 -> p2 == INPUTS18[2] }) >> RETURNED18
				1 * makeX({ p0 -> p0 == INPUTS28[0] }, { p1 -> p1 == INPUTS28[1] }, { p2 -> p2 == INPUTS28[2] }) >> RETURNED28
				1 * makeX({ p0 -> p0 == INPUTS27[0] }, { p1 -> p1 == INPUTS27[1] }, { p2 -> p2 == INPUTS27[2] }) >> RETURNED27
				1 * makeX({ p0 -> p0 == INPUTS29[0] }, { p1 -> p1 == INPUTS29[1] }, { p2 -> p2 == INPUTS29[2] }) >> RETURNED29
				1 * makeX({ p0 -> p0 == INPUTS35[0] }, { p1 -> p1 == INPUTS35[1] }, { p2 -> p2 == INPUTS35[2] }) >> RETURNED35
				1 * makeX({ p0 -> p0 == INPUTS30[0] }, { p1 -> p1 == INPUTS30[1] }, { p2 -> p2 == INPUTS30[2] }) >> RETURNED30
				1 * makeX({ p0 -> p0 == INPUTS32[0] }, { p1 -> p1 == INPUTS32[1] }, { p2 -> p2 == INPUTS32[2] }) >> RETURNED32
				1 * makeX({ p0 -> p0 == INPUTS31[0] }, { p1 -> p1 == INPUTS31[1] }, { p2 -> p2 == INPUTS31[2] }) >> RETURNED31
				1 * makeX({ p0 -> p0 == INPUTS36[0] }, { p1 -> p1 == INPUTS36[1] }, { p2 -> p2 == INPUTS36[2] }) >> RETURNED36
				1 * makeX({ p0 -> p0 == INPUTS43[0] }, { p1 -> p1 == INPUTS43[1] }, { p2 -> p2 == INPUTS43[2] }) >> RETURNED43
			}
			subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
				1 * doServiceC({ p0 -> p0 == INPUTS23[0] }) >> RETURNED23
				1 * doServiceC({ p0 -> p0 == INPUTS45[0] }) >> RETURNED45
			}
		when:
			def ret = subject.doServiceA2(*INPUTS1)
		then:
			ret == RETURNED1
	}
	
	
	static final def INPUTS23 = [
			1
	]
	static final def INPUTS45 = [
			1
	]
	static final def INPUTS35 = [
			't',
			'x',
			9
	]
	static final def INPUTS25 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS36 = [
			't',
			'x',
			5
	]
	static final def INPUTS27 = [
			't',
			'x',
			6
	]
	static final def INPUTS17 = [
			't',
			'x',
			4
	]
	static final def INPUTS28 = [
			't',
			'x',
			8
	]
	static final def INPUTS18 = [
			't',
			'x',
			1
	]
	static final def INPUTS29 = [
			't',
			'x',
			7
	]
	static final def INPUTS19 = [
			't',
			'x',
			9
	]
	static final def INPUTS1 = [
			't',
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
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS3 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS5 = [
			't',
			'x',
			6
	]
	static final def INPUTS6 = [
			't',
			'x',
			3
	]
	static final def INPUTS7 = [
			't',
			'x',
			7
	]
	static final def INPUTS8 = [
			't',
			'x',
			2
	]
	static final def INPUTS9 = [
			't',
			'x',
			8
	]
	static final def INPUTS30 = [
			't',
			'x',
			1
	]
	static final def INPUTS31 = [
			't',
			'x',
			2
	]
	static final def INPUTS10 = [
			't',
			'x',
			5
	]
	static final def INPUTS32 = [
			't',
			'x',
			3
	]
	static final def INPUTS43 = [
			't',
			'x',
			4
	]
	
	static final def OUTPUTS23 = [
			1
	]
	static final def OUTPUTS45 = [
			1
	]
	static final def OUTPUTS35 = [
			't',
			'x',
			9
	]
	static final def OUTPUTS25 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS36 = [
			't',
			'x',
			5
	]
	static final def OUTPUTS27 = [
			't',
			'x',
			6
	]
	static final def OUTPUTS17 = [
			't',
			'x',
			4
	]
	static final def OUTPUTS28 = [
			't',
			'x',
			8
	]
	static final def OUTPUTS18 = [
			't',
			'x',
			1
	]
	static final def OUTPUTS29 = [
			't',
			'x',
			7
	]
	static final def OUTPUTS19 = [
			't',
			'x',
			9
	]
	static final def OUTPUTS1 = [
			't',
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
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS3 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS5 = [
			't',
			'x',
			6
	]
	static final def OUTPUTS6 = [
			't',
			'x',
			3
	]
	static final def OUTPUTS7 = [
			't',
			'x',
			7
	]
	static final def OUTPUTS8 = [
			't',
			'x',
			2
	]
	static final def OUTPUTS9 = [
			't',
			'x',
			8
	]
	static final def OUTPUTS30 = [
			't',
			'x',
			1
	]
	static final def OUTPUTS31 = [
			't',
			'x',
			2
	]
	static final def OUTPUTS10 = [
			't',
			'x',
			5
	]
	static final def OUTPUTS32 = [
			't',
			'x',
			3
	]
	static final def OUTPUTS43 = [
			't',
			'x',
			4
	]
	
	static final def RETURNED23 = 1
	
	static final def RETURNED45 = 1
	
	static final def RETURNED35 = [
			fieldFromX: 't',
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
	
	static final def RETURNED25 = 'null<>null'
	
	static final def RETURNED36 = [
			fieldFromX: 't',
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
	
	static final def RETURNED27 = [
			fieldFromX: 't',
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
	
	static final def RETURNED17 = [
			fieldFromX: 't',
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
	
	static final def RETURNED28 = [
			fieldFromX: 't',
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
	
	static final def RETURNED18 = [
			fieldFromX: 't',
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
	
	static final def RETURNED29 = [
			fieldFromX: 't',
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
	
	static final def RETURNED19 = [
			fieldFromX: 't',
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
	
	static final def RETURNED1 = [
			dataX       : [
					fieldFromX: 't',
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
			fromServiceC: 1,
	] as com.etz.replay.unit.targets.ServiceData
	
	static final def RETURNED3 = 'null<>null'
	
	static final def RETURNED5 = [
			fieldFromX: 't',
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
	
	static final def RETURNED6 = [
			fieldFromX: 't',
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
	
	static final def RETURNED7 = [
			fieldFromX: 't',
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
	
	static final def RETURNED8 = [
			fieldFromX: 't',
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
	
	static final def RETURNED9 = [
			fieldFromX: 't',
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
	
	static final def RETURNED30 = [
			fieldFromX: 't',
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
	
	static final def RETURNED31 = [
			fieldFromX: 't',
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
	
	static final def RETURNED10 = [
			fieldFromX: 't',
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
	
	static final def RETURNED32 = [
			fieldFromX: 't',
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
	
	static final def RETURNED43 = [
			fieldFromX: 't',
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
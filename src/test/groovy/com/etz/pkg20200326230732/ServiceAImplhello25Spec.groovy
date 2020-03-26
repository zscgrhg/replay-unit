package com.etz.pkg20200326230732

import spock.lang.Specification

class ServiceAImplhello25Spec extends Specification {
	void verifyhello() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceAImpl()
			subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
				1 * doServiceB({ p0 -> p0 == INPUTS60[0] }) >> RETURNED60
				1 * doServiceB({ p0 -> p0 == INPUTS65[0] }) >> RETURNED65
			}
			subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
				1 * makeX({ p0 -> p0 == INPUTS27[0] }, { p1 -> p1 == INPUTS27[1] }, { p2 -> p2 == INPUTS27[2] }) >> RETURNED27
				1 * makeX({ p0 -> p0 == INPUTS28[0] }, { p1 -> p1 == INPUTS28[1] }, { p2 -> p2 == INPUTS28[2] }) >> RETURNED28
				1 * makeX({ p0 -> p0 == INPUTS31[0] }, { p1 -> p1 == INPUTS31[1] }, { p2 -> p2 == INPUTS31[2] }) >> RETURNED31
				1 * makeX({ p0 -> p0 == INPUTS29[0] }, { p1 -> p1 == INPUTS29[1] }, { p2 -> p2 == INPUTS29[2] }) >> RETURNED29
				1 * makeX({ p0 -> p0 == INPUTS30[0] }, { p1 -> p1 == INPUTS30[1] }, { p2 -> p2 == INPUTS30[2] }) >> RETURNED30
				1 * makeX({ p0 -> p0 == INPUTS32[0] }, { p1 -> p1 == INPUTS32[1] }, { p2 -> p2 == INPUTS32[2] }) >> RETURNED32
				1 * makeX({ p0 -> p0 == INPUTS35[0] }, { p1 -> p1 == INPUTS35[1] }, { p2 -> p2 == INPUTS35[2] }) >> RETURNED35
				1 * makeX({ p0 -> p0 == INPUTS36[0] }, { p1 -> p1 == INPUTS36[1] }, { p2 -> p2 == INPUTS36[2] }) >> RETURNED36
				1 * makeX({ p0 -> p0 == INPUTS43[0] }, { p1 -> p1 == INPUTS43[1] }, { p2 -> p2 == INPUTS43[2] }) >> RETURNED43
				1 * makeX({ p0 -> p0 == INPUTS44[0] }, { p1 -> p1 == INPUTS44[1] }, { p2 -> p2 == INPUTS44[2] }) >> RETURNED44
				1 * makeX({ p0 -> p0 == INPUTS46[0] }, { p1 -> p1 == INPUTS46[1] }, { p2 -> p2 == INPUTS46[2] }) >> RETURNED46
				1 * makeX({ p0 -> p0 == INPUTS47[0] }, { p1 -> p1 == INPUTS47[1] }, { p2 -> p2 == INPUTS47[2] }) >> RETURNED47
				1 * makeX({ p0 -> p0 == INPUTS45[0] }, { p1 -> p1 == INPUTS45[1] }, { p2 -> p2 == INPUTS45[2] }) >> RETURNED45
				1 * makeX({ p0 -> p0 == INPUTS48[0] }, { p1 -> p1 == INPUTS48[1] }, { p2 -> p2 == INPUTS48[2] }) >> RETURNED48
				1 * makeX({ p0 -> p0 == INPUTS54[0] }, { p1 -> p1 == INPUTS54[1] }, { p2 -> p2 == INPUTS54[2] }) >> RETURNED54
				1 * makeX({ p0 -> p0 == INPUTS56[0] }, { p1 -> p1 == INPUTS56[1] }, { p2 -> p2 == INPUTS56[2] }) >> RETURNED56
				1 * makeX({ p0 -> p0 == INPUTS57[0] }, { p1 -> p1 == INPUTS57[1] }, { p2 -> p2 == INPUTS57[2] }) >> RETURNED57
				1 * makeX({ p0 -> p0 == INPUTS58[0] }, { p1 -> p1 == INPUTS58[1] }, { p2 -> p2 == INPUTS58[2] }) >> RETURNED58
			}
			subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
				1 * doServiceC({ p0 -> p0 == INPUTS66[0] }) >> RETURNED66
				1 * doServiceC({ p0 -> p0 == INPUTS69[0] }) >> RETURNED69
			}
		when:
			def ret = subject.hello(*INPUTS25)
		then:
			ret == RETURNED25
	}
	
	
	static final def INPUTS44 = [
			't2',
			'x',
			4
	]
	static final def INPUTS66 = [
			6
	]
	static final def INPUTS45 = [
			't2',
			'x',
			3
	]
	static final def INPUTS56 = [
			't2',
			'x',
			7
	]
	static final def INPUTS35 = [
			't2',
			'x',
			2
	]
	static final def INPUTS46 = [
			't2',
			'x',
			2
	]
	static final def INPUTS57 = [
			't2',
			'x',
			1
	]
	static final def INPUTS25 = [
			't2',
			6,
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
	static final def INPUTS36 = [
			't2',
			'x',
			5
	]
	static final def INPUTS47 = [
			't2',
			'x',
			8
	]
	static final def INPUTS58 = [
			't2',
			'x',
			9
	]
	static final def INPUTS69 = [
			6
	]
	static final def INPUTS48 = [
			't2',
			'x',
			1
	]
	static final def INPUTS27 = [
			't2',
			'x',
			6
	]
	static final def INPUTS28 = [
			't2',
			'x',
			6
	]
	static final def INPUTS29 = [
			't2',
			'x',
			5
	]
	static final def INPUTS60 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS30 = [
			't2',
			'x',
			7
	]
	static final def INPUTS31 = [
			't2',
			'x',
			3
	]
	static final def INPUTS32 = [
			't2',
			'x',
			8
	]
	static final def INPUTS43 = [
			't2',
			'x',
			9
	]
	static final def INPUTS54 = [
			't2',
			'x',
			4
	]
	static final def INPUTS65 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	
	static final def OUTPUTS44 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS66 = [
			6
	]
	static final def OUTPUTS45 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS56 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS35 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS46 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS57 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS25 = [
			't2',
			6,
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
	static final def OUTPUTS36 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS47 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS58 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS69 = [
			6
	]
	static final def OUTPUTS48 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS27 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS28 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS29 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS60 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS30 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS31 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS32 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS43 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS54 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS65 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	
	static final def RETURNED44 = [
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
	
	static final def RETURNED66 = 36
	
	static final def RETURNED45 = [
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
	
	static final def RETURNED56 = [
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
	
	static final def RETURNED35 = [
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
	
	static final def RETURNED46 = [
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
	
	static final def RETURNED57 = [
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
	
	static final def RETURNED25 = [
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
			fromServiceC: 36,
	] as com.etz.replay.unit.targets.ServiceData
	
	static final def RETURNED36 = [
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
	
	static final def RETURNED47 = [
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
	
	static final def RETURNED58 = [
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
	
	static final def RETURNED69 = 36
	
	static final def RETURNED48 = [
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
	
	static final def RETURNED27 = [
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
	
	static final def RETURNED28 = [
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
	
	static final def RETURNED29 = [
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
	
	static final def RETURNED60 = 'null<>null'
	
	static final def RETURNED30 = [
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
	
	static final def RETURNED31 = [
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
	
	static final def RETURNED32 = [
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
	
	static final def RETURNED43 = [
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
	
	static final def RETURNED54 = [
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
	
	static final def RETURNED65 = 'null<>null'
	
	
}
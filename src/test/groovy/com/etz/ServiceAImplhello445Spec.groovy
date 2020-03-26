package com.etz.pkg20200326213328

import spock.lang.Specification

class ServiceAImplhello445Spec extends Specification {
	void verifyhello() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceAImpl()
			subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
				1 * doServiceB({ p0 -> p0 == INPUTS483[0] }) >> RETURNED483
				1 * doServiceB({ p0 -> p0 == INPUTS484[0] }) >> RETURNED484
			}
			subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
				1 * makeX({ p0 -> p0 == INPUTS447[0] }, { p1 -> p1 == INPUTS447[1] }, { p2 -> p2 == INPUTS447[2] }) >> RETURNED447
				1 * makeX({ p0 -> p0 == INPUTS449[0] }, { p1 -> p1 == INPUTS449[1] }, { p2 -> p2 == INPUTS449[2] }) >> RETURNED449
				1 * makeX({ p0 -> p0 == INPUTS448[0] }, { p1 -> p1 == INPUTS448[1] }, { p2 -> p2 == INPUTS448[2] }) >> RETURNED448
				1 * makeX({ p0 -> p0 == INPUTS451[0] }, { p1 -> p1 == INPUTS451[1] }, { p2 -> p2 == INPUTS451[2] }) >> RETURNED451
				1 * makeX({ p0 -> p0 == INPUTS450[0] }, { p1 -> p1 == INPUTS450[1] }, { p2 -> p2 == INPUTS450[2] }) >> RETURNED450
				1 * makeX({ p0 -> p0 == INPUTS452[0] }, { p1 -> p1 == INPUTS452[1] }, { p2 -> p2 == INPUTS452[2] }) >> RETURNED452
				1 * makeX({ p0 -> p0 == INPUTS459[0] }, { p1 -> p1 == INPUTS459[1] }, { p2 -> p2 == INPUTS459[2] }) >> RETURNED459
				1 * makeX({ p0 -> p0 == INPUTS460[0] }, { p1 -> p1 == INPUTS460[1] }, { p2 -> p2 == INPUTS460[2] }) >> RETURNED460
				1 * makeX({ p0 -> p0 == INPUTS461[0] }, { p1 -> p1 == INPUTS461[1] }, { p2 -> p2 == INPUTS461[2] }) >> RETURNED461
				1 * makeX({ p0 -> p0 == INPUTS463[0] }, { p1 -> p1 == INPUTS463[1] }, { p2 -> p2 == INPUTS463[2] }) >> RETURNED463
				1 * makeX({ p0 -> p0 == INPUTS465[0] }, { p1 -> p1 == INPUTS465[1] }, { p2 -> p2 == INPUTS465[2] }) >> RETURNED465
				1 * makeX({ p0 -> p0 == INPUTS462[0] }, { p1 -> p1 == INPUTS462[1] }, { p2 -> p2 == INPUTS462[2] }) >> RETURNED462
				1 * makeX({ p0 -> p0 == INPUTS470[0] }, { p1 -> p1 == INPUTS470[1] }, { p2 -> p2 == INPUTS470[2] }) >> RETURNED470
				1 * makeX({ p0 -> p0 == INPUTS472[0] }, { p1 -> p1 == INPUTS472[1] }, { p2 -> p2 == INPUTS472[2] }) >> RETURNED472
				1 * makeX({ p0 -> p0 == INPUTS473[0] }, { p1 -> p1 == INPUTS473[1] }, { p2 -> p2 == INPUTS473[2] }) >> RETURNED473
				1 * makeX({ p0 -> p0 == INPUTS474[0] }, { p1 -> p1 == INPUTS474[1] }, { p2 -> p2 == INPUTS474[2] }) >> RETURNED474
				1 * makeX({ p0 -> p0 == INPUTS476[0] }, { p1 -> p1 == INPUTS476[1] }, { p2 -> p2 == INPUTS476[2] }) >> RETURNED476
				1 * makeX({ p0 -> p0 == INPUTS477[0] }, { p1 -> p1 == INPUTS477[1] }, { p2 -> p2 == INPUTS477[2] }) >> RETURNED477
			}
			subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
				1 * doServiceC({ p0 -> p0 == INPUTS487[0] }) >> RETURNED487
				1 * doServiceC({ p0 -> p0 == INPUTS489[0] }) >> RETURNED489
			}
		when:
			def ret = subject.hello(*INPUTS445)
		then:
			ret == RETURNED445
	}
	
	
	static final def INPUTS470 = [
			't2',
			'x',
			8
	]
	static final def INPUTS460 = [
			't2',
			'x',
			5
	]
	static final def INPUTS450 = [
			't2',
			'x',
			3
	]
	static final def INPUTS461 = [
			't2',
			'x',
			2
	]
	static final def INPUTS472 = [
			't2',
			'x',
			7
	]
	static final def INPUTS483 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS451 = [
			't2',
			'x',
			8
	]
	static final def INPUTS462 = [
			't2',
			'x',
			2
	]
	static final def INPUTS473 = [
			't2',
			'x',
			1
	]
	static final def INPUTS484 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS452 = [
			't2',
			'x',
			5
	]
	static final def INPUTS463 = [
			't2',
			'x',
			4
	]
	static final def INPUTS474 = [
			't2',
			'x',
			7
	]
	static final def INPUTS465 = [
			't2',
			'x',
			9
	]
	static final def INPUTS476 = [
			't2',
			'x',
			1
	]
	static final def INPUTS487 = [
			12
	]
	static final def INPUTS477 = [
			't2',
			'x',
			9
	]
	static final def INPUTS445 = [
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
	static final def INPUTS489 = [
			12
	]
	static final def INPUTS447 = [
			't2',
			'x',
			6
	]
	static final def INPUTS448 = [
			't2',
			'x',
			3
	]
	static final def INPUTS459 = [
			't2',
			'x',
			4
	]
	static final def INPUTS449 = [
			't2',
			'x',
			6
	]
	
	static final def OUTPUTS470 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS460 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS450 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS461 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS472 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS483 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS451 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS462 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS473 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS484 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS452 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS463 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS474 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS465 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS476 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS487 = [
			12
	]
	static final def OUTPUTS477 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS445 = [
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
	static final def OUTPUTS489 = [
			12
	]
	static final def OUTPUTS447 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS448 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS459 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS449 = [
			't2',
			'x',
			6
	]
	
	static final def RETURNED470 = [
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
	
	static final def RETURNED460 = [
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
	
	static final def RETURNED450 = [
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
	
	static final def RETURNED461 = [
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
	
	static final def RETURNED472 = [
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
	
	static final def RETURNED483 = 'null<>null'
	
	static final def RETURNED451 = [
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
	
	static final def RETURNED462 = [
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
	
	static final def RETURNED473 = [
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
	
	static final def RETURNED484 = 'null<>null'
	
	static final def RETURNED452 = [
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
	
	static final def RETURNED463 = [
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
	
	static final def RETURNED474 = [
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
	
	static final def RETURNED465 = [
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
	
	static final def RETURNED476 = [
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
	
	static final def RETURNED487 = 144
	
	static final def RETURNED477 = [
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
	
	static final def RETURNED445 = [
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
	
	static final def RETURNED489 = 144
	
	static final def RETURNED447 = [
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
	
	static final def RETURNED448 = [
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
	
	static final def RETURNED459 = [
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
	
	static final def RETURNED449 = [
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
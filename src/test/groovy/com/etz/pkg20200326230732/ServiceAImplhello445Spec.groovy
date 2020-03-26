package com.etz.pkg20200326230732

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
				1 * makeX({ p0 -> p0 == INPUTS448[0] }, { p1 -> p1 == INPUTS448[1] }, { p2 -> p2 == INPUTS448[2] }) >> RETURNED448
				1 * makeX({ p0 -> p0 == INPUTS450[0] }, { p1 -> p1 == INPUTS450[1] }, { p2 -> p2 == INPUTS450[2] }) >> RETURNED450
				1 * makeX({ p0 -> p0 == INPUTS449[0] }, { p1 -> p1 == INPUTS449[1] }, { p2 -> p2 == INPUTS449[2] }) >> RETURNED449
				1 * makeX({ p0 -> p0 == INPUTS451[0] }, { p1 -> p1 == INPUTS451[1] }, { p2 -> p2 == INPUTS451[2] }) >> RETURNED451
				1 * makeX({ p0 -> p0 == INPUTS447[0] }, { p1 -> p1 == INPUTS447[1] }, { p2 -> p2 == INPUTS447[2] }) >> RETURNED447
				1 * makeX({ p0 -> p0 == INPUTS452[0] }, { p1 -> p1 == INPUTS452[1] }, { p2 -> p2 == INPUTS452[2] }) >> RETURNED452
				1 * makeX({ p0 -> p0 == INPUTS458[0] }, { p1 -> p1 == INPUTS458[1] }, { p2 -> p2 == INPUTS458[2] }) >> RETURNED458
				1 * makeX({ p0 -> p0 == INPUTS459[0] }, { p1 -> p1 == INPUTS459[1] }, { p2 -> p2 == INPUTS459[2] }) >> RETURNED459
				1 * makeX({ p0 -> p0 == INPUTS460[0] }, { p1 -> p1 == INPUTS460[1] }, { p2 -> p2 == INPUTS460[2] }) >> RETURNED460
				1 * makeX({ p0 -> p0 == INPUTS461[0] }, { p1 -> p1 == INPUTS461[1] }, { p2 -> p2 == INPUTS461[2] }) >> RETURNED461
				1 * makeX({ p0 -> p0 == INPUTS465[0] }, { p1 -> p1 == INPUTS465[1] }, { p2 -> p2 == INPUTS465[2] }) >> RETURNED465
				1 * makeX({ p0 -> p0 == INPUTS466[0] }, { p1 -> p1 == INPUTS466[1] }, { p2 -> p2 == INPUTS466[2] }) >> RETURNED466
				1 * makeX({ p0 -> p0 == INPUTS469[0] }, { p1 -> p1 == INPUTS469[1] }, { p2 -> p2 == INPUTS469[2] }) >> RETURNED469
				1 * makeX({ p0 -> p0 == INPUTS472[0] }, { p1 -> p1 == INPUTS472[1] }, { p2 -> p2 == INPUTS472[2] }) >> RETURNED472
				1 * makeX({ p0 -> p0 == INPUTS474[0] }, { p1 -> p1 == INPUTS474[1] }, { p2 -> p2 == INPUTS474[2] }) >> RETURNED474
				1 * makeX({ p0 -> p0 == INPUTS475[0] }, { p1 -> p1 == INPUTS475[1] }, { p2 -> p2 == INPUTS475[2] }) >> RETURNED475
				1 * makeX({ p0 -> p0 == INPUTS477[0] }, { p1 -> p1 == INPUTS477[1] }, { p2 -> p2 == INPUTS477[2] }) >> RETURNED477
				1 * makeX({ p0 -> p0 == INPUTS478[0] }, { p1 -> p1 == INPUTS478[1] }, { p2 -> p2 == INPUTS478[2] }) >> RETURNED478
			}
			subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
				1 * doServiceC({ p0 -> p0 == INPUTS487[0] }) >> RETURNED487
				1 * doServiceC({ p0 -> p0 == INPUTS488[0] }) >> RETURNED488
			}
		when:
			def ret = subject.hello(*INPUTS445)
		then:
			ret == RETURNED445
	}
	
	
	static final def INPUTS460 = [
			't2',
			'x',
			5
	]
	static final def INPUTS450 = [
			't2',
			'x',
			5
	]
	static final def INPUTS461 = [
			't2',
			'x',
			4
	]
	static final def INPUTS472 = [
			't2',
			'x',
			2
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
			3
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
			8
	]
	static final def INPUTS474 = [
			't2',
			'x',
			8
	]
	static final def INPUTS475 = [
			't2',
			'x',
			1
	]
	static final def INPUTS465 = [
			't2',
			'x',
			4
	]
	static final def INPUTS487 = [
			4
	]
	static final def INPUTS466 = [
			't2',
			'x',
			2
	]
	static final def INPUTS477 = [
			't2',
			'x',
			9
	]
	static final def INPUTS488 = [
			4
	]
	static final def INPUTS445 = [
			't2',
			4,
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
	static final def INPUTS478 = [
			't2',
			'x',
			7
	]
	static final def INPUTS447 = [
			't2',
			'x',
			6
	]
	static final def INPUTS458 = [
			't2',
			'x',
			7
	]
	static final def INPUTS469 = [
			't2',
			'x',
			1
	]
	static final def INPUTS448 = [
			't2',
			'x',
			6
	]
	static final def INPUTS459 = [
			't2',
			'x',
			9
	]
	static final def INPUTS449 = [
			't2',
			'x',
			3
	]
	
	static final def OUTPUTS460 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS450 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS461 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS472 = [
			't2',
			'x',
			2
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
			3
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
			8
	]
	static final def OUTPUTS474 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS475 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS465 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS487 = [
			4
	]
	static final def OUTPUTS466 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS477 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS488 = [
			4
	]
	static final def OUTPUTS445 = [
			't2',
			4,
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
	static final def OUTPUTS478 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS447 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS458 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS469 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS448 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS459 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS449 = [
			't2',
			'x',
			3
	]
	
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
	
	static final def RETURNED475 = [
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
	
	static final def RETURNED487 = 16
	
	static final def RETURNED466 = [
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
	
	static final def RETURNED488 = 16
	
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
			fromServiceC: 16,
	] as com.etz.replay.unit.targets.ServiceData
	
	static final def RETURNED478 = [
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
	
	static final def RETURNED458 = [
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
	
	static final def RETURNED469 = [
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
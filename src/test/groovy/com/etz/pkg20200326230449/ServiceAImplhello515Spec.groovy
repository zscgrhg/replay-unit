package com.etz.pkg20200326230449

import spock.lang.Specification

class ServiceAImplhello515Spec extends Specification {
	void verifyhello() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceAImpl()
			subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
				1 * doServiceB({ p0 -> p0 == INPUTS551[0] }) >> RETURNED551
				1 * doServiceB({ p0 -> p0 == INPUTS555[0] }) >> RETURNED555
			}
			subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
				1 * makeX({ p0 -> p0 == INPUTS520[0] }, { p1 -> p1 == INPUTS520[1] }, { p2 -> p2 == INPUTS520[2] }) >> RETURNED520
				1 * makeX({ p0 -> p0 == INPUTS517[0] }, { p1 -> p1 == INPUTS517[1] }, { p2 -> p2 == INPUTS517[2] }) >> RETURNED517
				1 * makeX({ p0 -> p0 == INPUTS521[0] }, { p1 -> p1 == INPUTS521[1] }, { p2 -> p2 == INPUTS521[2] }) >> RETURNED521
				1 * makeX({ p0 -> p0 == INPUTS518[0] }, { p1 -> p1 == INPUTS518[1] }, { p2 -> p2 == INPUTS518[2] }) >> RETURNED518
				1 * makeX({ p0 -> p0 == INPUTS522[0] }, { p1 -> p1 == INPUTS522[1] }, { p2 -> p2 == INPUTS522[2] }) >> RETURNED522
				1 * makeX({ p0 -> p0 == INPUTS519[0] }, { p1 -> p1 == INPUTS519[1] }, { p2 -> p2 == INPUTS519[2] }) >> RETURNED519
				1 * makeX({ p0 -> p0 == INPUTS529[0] }, { p1 -> p1 == INPUTS529[1] }, { p2 -> p2 == INPUTS529[2] }) >> RETURNED529
				1 * makeX({ p0 -> p0 == INPUTS528[0] }, { p1 -> p1 == INPUTS528[1] }, { p2 -> p2 == INPUTS528[2] }) >> RETURNED528
				1 * makeX({ p0 -> p0 == INPUTS530[0] }, { p1 -> p1 == INPUTS530[1] }, { p2 -> p2 == INPUTS530[2] }) >> RETURNED530
				1 * makeX({ p0 -> p0 == INPUTS532[0] }, { p1 -> p1 == INPUTS532[1] }, { p2 -> p2 == INPUTS532[2] }) >> RETURNED532
				1 * makeX({ p0 -> p0 == INPUTS534[0] }, { p1 -> p1 == INPUTS534[1] }, { p2 -> p2 == INPUTS534[2] }) >> RETURNED534
				1 * makeX({ p0 -> p0 == INPUTS540[0] }, { p1 -> p1 == INPUTS540[1] }, { p2 -> p2 == INPUTS540[2] }) >> RETURNED540
				1 * makeX({ p0 -> p0 == INPUTS541[0] }, { p1 -> p1 == INPUTS541[1] }, { p2 -> p2 == INPUTS541[2] }) >> RETURNED541
				1 * makeX({ p0 -> p0 == INPUTS543[0] }, { p1 -> p1 == INPUTS543[1] }, { p2 -> p2 == INPUTS543[2] }) >> RETURNED543
				1 * makeX({ p0 -> p0 == INPUTS539[0] }, { p1 -> p1 == INPUTS539[1] }, { p2 -> p2 == INPUTS539[2] }) >> RETURNED539
				1 * makeX({ p0 -> p0 == INPUTS542[0] }, { p1 -> p1 == INPUTS542[1] }, { p2 -> p2 == INPUTS542[2] }) >> RETURNED542
				1 * makeX({ p0 -> p0 == INPUTS544[0] }, { p1 -> p1 == INPUTS544[1] }, { p2 -> p2 == INPUTS544[2] }) >> RETURNED544
				1 * makeX({ p0 -> p0 == INPUTS548[0] }, { p1 -> p1 == INPUTS548[1] }, { p2 -> p2 == INPUTS548[2] }) >> RETURNED548
			}
			subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
				1 * doServiceC({ p0 -> p0 == INPUTS556[0] }) >> RETURNED556
				1 * doServiceC({ p0 -> p0 == INPUTS559[0] }) >> RETURNED559
			}
		when:
			def ret = subject.hello(*INPUTS515)
		then:
			ret == RETURNED515
	}
	
	
	static final def INPUTS540 = [
			't2',
			'x',
			2
	]
	static final def INPUTS551 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS530 = [
			't2',
			'x',
			4
	]
	static final def INPUTS541 = [
			't2',
			'x',
			2
	]
	static final def INPUTS520 = [
			't2',
			'x',
			8
	]
	static final def INPUTS542 = [
			't2',
			'x',
			1
	]
	static final def INPUTS521 = [
			't2',
			'x',
			6
	]
	static final def INPUTS532 = [
			't2',
			'x',
			9
	]
	static final def INPUTS543 = [
			't2',
			'x',
			1
	]
	static final def INPUTS522 = [
			't2',
			'x',
			3
	]
	static final def INPUTS544 = [
			't2',
			'x',
			7
	]
	static final def INPUTS555 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS534 = [
			't2',
			'x',
			7
	]
	static final def INPUTS556 = [
			1
	]
	static final def INPUTS515 = [
			't2',
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
	static final def INPUTS548 = [
			't2',
			'x',
			9
	]
	static final def INPUTS559 = [
			1
	]
	static final def INPUTS517 = [
			't2',
			'x',
			6
	]
	static final def INPUTS528 = [
			't2',
			'x',
			5
	]
	static final def INPUTS539 = [
			't2',
			'x',
			8
	]
	static final def INPUTS518 = [
			't2',
			'x',
			3
	]
	static final def INPUTS529 = [
			't2',
			'x',
			4
	]
	static final def INPUTS519 = [
			't2',
			'x',
			5
	]
	
	static final def OUTPUTS540 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS551 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS530 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS541 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS520 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS542 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS521 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS532 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS543 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS522 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS544 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS555 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS534 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS556 = [
			1
	]
	static final def OUTPUTS515 = [
			't2',
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
	static final def OUTPUTS548 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS559 = [
			1
	]
	static final def OUTPUTS517 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS528 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS539 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS518 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS529 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS519 = [
			't2',
			'x',
			5
	]
	
	static final def RETURNED540 = [
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
	
	static final def RETURNED551 = 'null<>null'
	
	static final def RETURNED530 = [
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
	
	static final def RETURNED541 = [
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
	
	static final def RETURNED520 = [
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
	
	static final def RETURNED542 = [
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
	
	static final def RETURNED521 = [
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
	
	static final def RETURNED532 = [
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
	
	static final def RETURNED543 = [
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
	
	static final def RETURNED522 = [
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
	
	static final def RETURNED544 = [
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
	
	static final def RETURNED555 = 'null<>null'
	
	static final def RETURNED534 = [
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
	
	static final def RETURNED556 = 1
	
	static final def RETURNED515 = [
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
			fromServiceC: 1,
	] as com.etz.replay.unit.targets.ServiceData
	
	static final def RETURNED548 = [
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
	
	static final def RETURNED559 = 1
	
	static final def RETURNED517 = [
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
	
	static final def RETURNED528 = [
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
	
	static final def RETURNED539 = [
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
	
	static final def RETURNED518 = [
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
	
	static final def RETURNED529 = [
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
	
	static final def RETURNED519 = [
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
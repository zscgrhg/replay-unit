package com.etz.pkg20200326230732

import spock.lang.Specification

class ServiceAImplhello585Spec extends Specification {
	void verifyhello() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceAImpl()
			subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
				1 * doServiceB({ p0 -> p0 == INPUTS623[0] }) >> RETURNED623
				1 * doServiceB({ p0 -> p0 == INPUTS624[0] }) >> RETURNED624
			}
			subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
				1 * makeX({ p0 -> p0 == INPUTS588[0] }, { p1 -> p1 == INPUTS588[1] }, { p2 -> p2 == INPUTS588[2] }) >> RETURNED588
				1 * makeX({ p0 -> p0 == INPUTS587[0] }, { p1 -> p1 == INPUTS587[1] }, { p2 -> p2 == INPUTS587[2] }) >> RETURNED587
				1 * makeX({ p0 -> p0 == INPUTS589[0] }, { p1 -> p1 == INPUTS589[1] }, { p2 -> p2 == INPUTS589[2] }) >> RETURNED589
				1 * makeX({ p0 -> p0 == INPUTS590[0] }, { p1 -> p1 == INPUTS590[1] }, { p2 -> p2 == INPUTS590[2] }) >> RETURNED590
				1 * makeX({ p0 -> p0 == INPUTS592[0] }, { p1 -> p1 == INPUTS592[1] }, { p2 -> p2 == INPUTS592[2] }) >> RETURNED592
				1 * makeX({ p0 -> p0 == INPUTS591[0] }, { p1 -> p1 == INPUTS591[1] }, { p2 -> p2 == INPUTS591[2] }) >> RETURNED591
				1 * makeX({ p0 -> p0 == INPUTS599[0] }, { p1 -> p1 == INPUTS599[1] }, { p2 -> p2 == INPUTS599[2] }) >> RETURNED599
				1 * makeX({ p0 -> p0 == INPUTS601[0] }, { p1 -> p1 == INPUTS601[1] }, { p2 -> p2 == INPUTS601[2] }) >> RETURNED601
				1 * makeX({ p0 -> p0 == INPUTS600[0] }, { p1 -> p1 == INPUTS600[1] }, { p2 -> p2 == INPUTS600[2] }) >> RETURNED600
				1 * makeX({ p0 -> p0 == INPUTS602[0] }, { p1 -> p1 == INPUTS602[1] }, { p2 -> p2 == INPUTS602[2] }) >> RETURNED602
				1 * makeX({ p0 -> p0 == INPUTS603[0] }, { p1 -> p1 == INPUTS603[1] }, { p2 -> p2 == INPUTS603[2] }) >> RETURNED603
				1 * makeX({ p0 -> p0 == INPUTS604[0] }, { p1 -> p1 == INPUTS604[1] }, { p2 -> p2 == INPUTS604[2] }) >> RETURNED604
				1 * makeX({ p0 -> p0 == INPUTS611[0] }, { p1 -> p1 == INPUTS611[1] }, { p2 -> p2 == INPUTS611[2] }) >> RETURNED611
				1 * makeX({ p0 -> p0 == INPUTS613[0] }, { p1 -> p1 == INPUTS613[1] }, { p2 -> p2 == INPUTS613[2] }) >> RETURNED613
				1 * makeX({ p0 -> p0 == INPUTS612[0] }, { p1 -> p1 == INPUTS612[1] }, { p2 -> p2 == INPUTS612[2] }) >> RETURNED612
				1 * makeX({ p0 -> p0 == INPUTS615[0] }, { p1 -> p1 == INPUTS615[1] }, { p2 -> p2 == INPUTS615[2] }) >> RETURNED615
				1 * makeX({ p0 -> p0 == INPUTS616[0] }, { p1 -> p1 == INPUTS616[1] }, { p2 -> p2 == INPUTS616[2] }) >> RETURNED616
				1 * makeX({ p0 -> p0 == INPUTS617[0] }, { p1 -> p1 == INPUTS617[1] }, { p2 -> p2 == INPUTS617[2] }) >> RETURNED617
			}
			subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
				1 * doServiceC({ p0 -> p0 == INPUTS627[0] }) >> RETURNED627
				1 * doServiceC({ p0 -> p0 == INPUTS628[0] }) >> RETURNED628
			}
		when:
			def ret = subject.hello(*INPUTS585)
		then:
			ret == RETURNED585
	}
	
	
	static final def INPUTS590 = [
			't2',
			'x',
			8
	]
	static final def INPUTS591 = [
			't2',
			'x',
			8
	]
	static final def INPUTS592 = [
			't2',
			'x',
			6
	]
	static final def INPUTS585 = [
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
	static final def INPUTS587 = [
			't2',
			'x',
			6
	]
	static final def INPUTS588 = [
			't2',
			'x',
			3
	]
	static final def INPUTS599 = [
			't2',
			'x',
			4
	]
	static final def INPUTS589 = [
			't2',
			'x',
			3
	]
	static final def INPUTS600 = [
			't2',
			'x',
			9
	]
	static final def INPUTS611 = [
			't2',
			'x',
			2
	]
	static final def INPUTS601 = [
			't2',
			'x',
			5
	]
	static final def INPUTS612 = [
			't2',
			'x',
			2
	]
	static final def INPUTS623 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS602 = [
			't2',
			'x',
			4
	]
	static final def INPUTS613 = [
			't2',
			'x',
			1
	]
	static final def INPUTS624 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS603 = [
			't2',
			'x',
			5
	]
	static final def INPUTS604 = [
			't2',
			'x',
			9
	]
	static final def INPUTS615 = [
			't2',
			'x',
			1
	]
	static final def INPUTS616 = [
			't2',
			'x',
			7
	]
	static final def INPUTS627 = [
			3
	]
	static final def INPUTS617 = [
			't2',
			'x',
			7
	]
	static final def INPUTS628 = [
			3
	]
	
	static final def OUTPUTS590 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS591 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS592 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS585 = [
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
	static final def OUTPUTS587 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS588 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS599 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS589 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS600 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS611 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS601 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS612 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS623 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS602 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS613 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS624 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS603 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS604 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS615 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS616 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS627 = [
			3
	]
	static final def OUTPUTS617 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS628 = [
			3
	]
	
	static final def RETURNED590 = [
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
	
	static final def RETURNED591 = [
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
	
	static final def RETURNED592 = [
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
	
	static final def RETURNED585 = [
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
	
	static final def RETURNED587 = [
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
	
	static final def RETURNED588 = [
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
	
	static final def RETURNED599 = [
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
	
	static final def RETURNED589 = [
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
	
	static final def RETURNED600 = [
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
	
	static final def RETURNED611 = [
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
	
	static final def RETURNED601 = [
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
	
	static final def RETURNED612 = [
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
	
	static final def RETURNED623 = 'null<>null'
	
	static final def RETURNED602 = [
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
	
	static final def RETURNED613 = [
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
	
	static final def RETURNED624 = 'null<>null'
	
	static final def RETURNED603 = [
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
	
	static final def RETURNED604 = [
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
	
	static final def RETURNED615 = [
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
	
	static final def RETURNED616 = [
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
	
	static final def RETURNED627 = 9
	
	static final def RETURNED617 = [
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
	
	static final def RETURNED628 = 9
	
	
}
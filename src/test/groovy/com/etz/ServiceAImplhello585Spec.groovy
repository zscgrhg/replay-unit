package com.etz.pkg20200326213328

import spock.lang.Specification

class ServiceAImplhello585Spec extends Specification {
	void verifyhello() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceAImpl()
			subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
				1 * doServiceB({ p0 -> p0 == INPUTS617[0] }) >> RETURNED617
				1 * doServiceB({ p0 -> p0 == INPUTS627[0] }) >> RETURNED627
			}
			subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
				1 * makeX({ p0 -> p0 == INPUTS590[0] }, { p1 -> p1 == INPUTS590[1] }, { p2 -> p2 == INPUTS590[2] }) >> RETURNED590
				1 * makeX({ p0 -> p0 == INPUTS588[0] }, { p1 -> p1 == INPUTS588[1] }, { p2 -> p2 == INPUTS588[2] }) >> RETURNED588
				1 * makeX({ p0 -> p0 == INPUTS587[0] }, { p1 -> p1 == INPUTS587[1] }, { p2 -> p2 == INPUTS587[2] }) >> RETURNED587
				1 * makeX({ p0 -> p0 == INPUTS591[0] }, { p1 -> p1 == INPUTS591[1] }, { p2 -> p2 == INPUTS591[2] }) >> RETURNED591
				1 * makeX({ p0 -> p0 == INPUTS589[0] }, { p1 -> p1 == INPUTS589[1] }, { p2 -> p2 == INPUTS589[2] }) >> RETURNED589
				1 * makeX({ p0 -> p0 == INPUTS592[0] }, { p1 -> p1 == INPUTS592[1] }, { p2 -> p2 == INPUTS592[2] }) >> RETURNED592
				1 * makeX({ p0 -> p0 == INPUTS599[0] }, { p1 -> p1 == INPUTS599[1] }, { p2 -> p2 == INPUTS599[2] }) >> RETURNED599
				1 * makeX({ p0 -> p0 == INPUTS603[0] }, { p1 -> p1 == INPUTS603[1] }, { p2 -> p2 == INPUTS603[2] }) >> RETURNED603
				1 * makeX({ p0 -> p0 == INPUTS601[0] }, { p1 -> p1 == INPUTS601[1] }, { p2 -> p2 == INPUTS601[2] }) >> RETURNED601
				1 * makeX({ p0 -> p0 == INPUTS600[0] }, { p1 -> p1 == INPUTS600[1] }, { p2 -> p2 == INPUTS600[2] }) >> RETURNED600
				1 * makeX({ p0 -> p0 == INPUTS602[0] }, { p1 -> p1 == INPUTS602[1] }, { p2 -> p2 == INPUTS602[2] }) >> RETURNED602
				1 * makeX({ p0 -> p0 == INPUTS605[0] }, { p1 -> p1 == INPUTS605[1] }, { p2 -> p2 == INPUTS605[2] }) >> RETURNED605
				1 * makeX({ p0 -> p0 == INPUTS611[0] }, { p1 -> p1 == INPUTS611[1] }, { p2 -> p2 == INPUTS611[2] }) >> RETURNED611
				1 * makeX({ p0 -> p0 == INPUTS612[0] }, { p1 -> p1 == INPUTS612[1] }, { p2 -> p2 == INPUTS612[2] }) >> RETURNED612
				1 * makeX({ p0 -> p0 == INPUTS614[0] }, { p1 -> p1 == INPUTS614[1] }, { p2 -> p2 == INPUTS614[2] }) >> RETURNED614
				1 * makeX({ p0 -> p0 == INPUTS613[0] }, { p1 -> p1 == INPUTS613[1] }, { p2 -> p2 == INPUTS613[2] }) >> RETURNED613
				1 * makeX({ p0 -> p0 == INPUTS618[0] }, { p1 -> p1 == INPUTS618[1] }, { p2 -> p2 == INPUTS618[2] }) >> RETURNED618
				1 * makeX({ p0 -> p0 == INPUTS621[0] }, { p1 -> p1 == INPUTS621[1] }, { p2 -> p2 == INPUTS621[2] }) >> RETURNED621
			}
			subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
				1 * doServiceC({ p0 -> p0 == INPUTS624[0] }) >> RETURNED624
				1 * doServiceC({ p0 -> p0 == INPUTS629[0] }) >> RETURNED629
			}
		when:
			def ret = subject.hello(*INPUTS585)
		then:
			ret == RETURNED585
	}
	
	
	static final def INPUTS590 = [
			't2',
			'x',
			6
	]
	static final def INPUTS591 = [
			't2',
			'x',
			3
	]
	static final def INPUTS592 = [
			't2',
			'x',
			8
	]
	static final def INPUTS585 = [
			't2',
			9,
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
			7
	]
	static final def INPUTS599 = [
			't2',
			'x',
			5
	]
	static final def INPUTS621 = [
			't2',
			'x',
			9
	]
	static final def INPUTS589 = [
			't2',
			'x',
			2
	]
	static final def INPUTS600 = [
			't2',
			'x',
			3
	]
	static final def INPUTS611 = [
			't2',
			'x',
			8
	]
	static final def INPUTS601 = [
			't2',
			'x',
			4
	]
	static final def INPUTS612 = [
			't2',
			'x',
			4
	]
	static final def INPUTS602 = [
			't2',
			'x',
			1
	]
	static final def INPUTS613 = [
			't2',
			'x',
			2
	]
	static final def INPUTS624 = [
			9
	]
	static final def INPUTS603 = [
			't2',
			'x',
			5
	]
	static final def INPUTS614 = [
			't2',
			'x',
			7
	]
	static final def INPUTS605 = [
			't2',
			'x',
			9
	]
	static final def INPUTS627 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS617 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS618 = [
			't2',
			'x',
			1
	]
	static final def INPUTS629 = [
			9
	]
	
	static final def OUTPUTS590 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS591 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS592 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS585 = [
			't2',
			9,
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
			7
	]
	static final def OUTPUTS599 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS621 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS589 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS600 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS611 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS601 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS612 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS602 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS613 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS624 = [
			9
	]
	static final def OUTPUTS603 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS614 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS605 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS627 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS617 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS618 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS629 = [
			9
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
			fromServiceC: 81,
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
	
	static final def RETURNED621 = [
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
	
	static final def RETURNED624 = 81
	
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
	
	static final def RETURNED614 = [
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
	
	static final def RETURNED605 = [
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
	
	static final def RETURNED627 = 'null<>null'
	
	static final def RETURNED617 = 'null<>null'
	
	static final def RETURNED618 = [
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
	
	static final def RETURNED629 = 81
	
	
}
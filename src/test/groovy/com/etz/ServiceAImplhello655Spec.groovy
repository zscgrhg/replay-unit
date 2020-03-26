package com.etz.pkg20200326213328

import spock.lang.Specification

class ServiceAImplhello655Spec extends Specification {
	void verifyhello() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceAImpl()
			subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
				1 * doServiceB({ p0 -> p0 == INPUTS693[0] }) >> RETURNED693
				1 * doServiceB({ p0 -> p0 == INPUTS694[0] }) >> RETURNED694
			}
			subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
				1 * makeX({ p0 -> p0 == INPUTS658[0] }, { p1 -> p1 == INPUTS658[1] }, { p2 -> p2 == INPUTS658[2] }) >> RETURNED658
				1 * makeX({ p0 -> p0 == INPUTS659[0] }, { p1 -> p1 == INPUTS659[1] }, { p2 -> p2 == INPUTS659[2] }) >> RETURNED659
				1 * makeX({ p0 -> p0 == INPUTS657[0] }, { p1 -> p1 == INPUTS657[1] }, { p2 -> p2 == INPUTS657[2] }) >> RETURNED657
				1 * makeX({ p0 -> p0 == INPUTS663[0] }, { p1 -> p1 == INPUTS663[1] }, { p2 -> p2 == INPUTS663[2] }) >> RETURNED663
				1 * makeX({ p0 -> p0 == INPUTS661[0] }, { p1 -> p1 == INPUTS661[1] }, { p2 -> p2 == INPUTS661[2] }) >> RETURNED661
				1 * makeX({ p0 -> p0 == INPUTS662[0] }, { p1 -> p1 == INPUTS662[1] }, { p2 -> p2 == INPUTS662[2] }) >> RETURNED662
				1 * makeX({ p0 -> p0 == INPUTS666[0] }, { p1 -> p1 == INPUTS666[1] }, { p2 -> p2 == INPUTS666[2] }) >> RETURNED666
				1 * makeX({ p0 -> p0 == INPUTS669[0] }, { p1 -> p1 == INPUTS669[1] }, { p2 -> p2 == INPUTS669[2] }) >> RETURNED669
				1 * makeX({ p0 -> p0 == INPUTS672[0] }, { p1 -> p1 == INPUTS672[1] }, { p2 -> p2 == INPUTS672[2] }) >> RETURNED672
				1 * makeX({ p0 -> p0 == INPUTS674[0] }, { p1 -> p1 == INPUTS674[1] }, { p2 -> p2 == INPUTS674[2] }) >> RETURNED674
				1 * makeX({ p0 -> p0 == INPUTS676[0] }, { p1 -> p1 == INPUTS676[1] }, { p2 -> p2 == INPUTS676[2] }) >> RETURNED676
				1 * makeX({ p0 -> p0 == INPUTS677[0] }, { p1 -> p1 == INPUTS677[1] }, { p2 -> p2 == INPUTS677[2] }) >> RETURNED677
				1 * makeX({ p0 -> p0 == INPUTS678[0] }, { p1 -> p1 == INPUTS678[1] }, { p2 -> p2 == INPUTS678[2] }) >> RETURNED678
				1 * makeX({ p0 -> p0 == INPUTS679[0] }, { p1 -> p1 == INPUTS679[1] }, { p2 -> p2 == INPUTS679[2] }) >> RETURNED679
				1 * makeX({ p0 -> p0 == INPUTS681[0] }, { p1 -> p1 == INPUTS681[1] }, { p2 -> p2 == INPUTS681[2] }) >> RETURNED681
				1 * makeX({ p0 -> p0 == INPUTS686[0] }, { p1 -> p1 == INPUTS686[1] }, { p2 -> p2 == INPUTS686[2] }) >> RETURNED686
				1 * makeX({ p0 -> p0 == INPUTS689[0] }, { p1 -> p1 == INPUTS689[1] }, { p2 -> p2 == INPUTS689[2] }) >> RETURNED689
				1 * makeX({ p0 -> p0 == INPUTS688[0] }, { p1 -> p1 == INPUTS688[1] }, { p2 -> p2 == INPUTS688[2] }) >> RETURNED688
			}
			subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
				1 * doServiceC({ p0 -> p0 == INPUTS697[0] }) >> RETURNED697
				1 * doServiceC({ p0 -> p0 == INPUTS698[0] }) >> RETURNED698
			}
		when:
			def ret = subject.hello(*INPUTS655)
		then:
			ret == RETURNED655
	}
	
	
	static final def INPUTS681 = [
			't2',
			'x',
			7
	]
	static final def INPUTS693 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS661 = [
			't2',
			'x',
			5
	]
	static final def INPUTS672 = [
			't2',
			'x',
			9
	]
	static final def INPUTS694 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS662 = [
			't2',
			'x',
			3
	]
	static final def INPUTS663 = [
			't2',
			'x',
			8
	]
	static final def INPUTS674 = [
			't2',
			'x',
			7
	]
	static final def INPUTS686 = [
			't2',
			'x',
			1
	]
	static final def INPUTS697 = [
			16
	]
	static final def INPUTS676 = [
			't2',
			'x',
			4
	]
	static final def INPUTS698 = [
			16
	]
	static final def INPUTS655 = [
			't2',
			16,
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
	static final def INPUTS666 = [
			't2',
			'x',
			4
	]
	static final def INPUTS677 = [
			't2',
			'x',
			2
	]
	static final def INPUTS688 = [
			't2',
			'x',
			9
	]
	static final def INPUTS678 = [
			't2',
			'x',
			2
	]
	static final def INPUTS689 = [
			't2',
			'x',
			1
	]
	static final def INPUTS657 = [
			't2',
			'x',
			6
	]
	static final def INPUTS679 = [
			't2',
			'x',
			8
	]
	static final def INPUTS658 = [
			't2',
			'x',
			3
	]
	static final def INPUTS669 = [
			't2',
			'x',
			5
	]
	static final def INPUTS659 = [
			't2',
			'x',
			6
	]
	
	static final def OUTPUTS681 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS693 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS661 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS672 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS694 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS662 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS663 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS674 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS686 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS697 = [
			16
	]
	static final def OUTPUTS676 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS698 = [
			16
	]
	static final def OUTPUTS655 = [
			't2',
			16,
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
	static final def OUTPUTS666 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS677 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS688 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS678 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS689 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS657 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS679 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS658 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS669 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS659 = [
			't2',
			'x',
			6
	]
	
	static final def RETURNED681 = [
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
	
	static final def RETURNED693 = 'null<>null'
	
	static final def RETURNED661 = [
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
	
	static final def RETURNED672 = [
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
	
	static final def RETURNED694 = 'null<>null'
	
	static final def RETURNED662 = [
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
	
	static final def RETURNED663 = [
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
	
	static final def RETURNED674 = [
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
	
	static final def RETURNED686 = [
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
	
	static final def RETURNED697 = 256
	
	static final def RETURNED676 = [
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
	
	static final def RETURNED698 = 256
	
	static final def RETURNED655 = [
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
			fromServiceC: 256,
	] as com.etz.replay.unit.targets.ServiceData
	
	static final def RETURNED666 = [
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
	
	static final def RETURNED677 = [
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
	
	static final def RETURNED688 = [
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
	
	static final def RETURNED678 = [
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
	
	static final def RETURNED689 = [
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
	
	static final def RETURNED657 = [
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
	
	static final def RETURNED679 = [
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
	
	static final def RETURNED658 = [
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
	
	static final def RETURNED669 = [
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
	
	static final def RETURNED659 = [
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
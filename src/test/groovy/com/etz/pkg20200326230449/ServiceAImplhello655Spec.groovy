package com.etz.pkg20200326230450

import spock.lang.Specification

class ServiceAImplhello655Spec extends Specification {
	void verifyhello() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceAImpl()
			subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
				1 * doServiceB({ p0 -> p0 == INPUTS691[0] }) >> RETURNED691
				1 * doServiceB({ p0 -> p0 == INPUTS695[0] }) >> RETURNED695
			}
			subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
				1 * makeX({ p0 -> p0 == INPUTS659[0] }, { p1 -> p1 == INPUTS659[1] }, { p2 -> p2 == INPUTS659[2] }) >> RETURNED659
				1 * makeX({ p0 -> p0 == INPUTS662[0] }, { p1 -> p1 == INPUTS662[1] }, { p2 -> p2 == INPUTS662[2] }) >> RETURNED662
				1 * makeX({ p0 -> p0 == INPUTS658[0] }, { p1 -> p1 == INPUTS658[1] }, { p2 -> p2 == INPUTS658[2] }) >> RETURNED658
				1 * makeX({ p0 -> p0 == INPUTS660[0] }, { p1 -> p1 == INPUTS660[1] }, { p2 -> p2 == INPUTS660[2] }) >> RETURNED660
				1 * makeX({ p0 -> p0 == INPUTS661[0] }, { p1 -> p1 == INPUTS661[1] }, { p2 -> p2 == INPUTS661[2] }) >> RETURNED661
				1 * makeX({ p0 -> p0 == INPUTS657[0] }, { p1 -> p1 == INPUTS657[1] }, { p2 -> p2 == INPUTS657[2] }) >> RETURNED657
				1 * makeX({ p0 -> p0 == INPUTS669[0] }, { p1 -> p1 == INPUTS669[1] }, { p2 -> p2 == INPUTS669[2] }) >> RETURNED669
				1 * makeX({ p0 -> p0 == INPUTS670[0] }, { p1 -> p1 == INPUTS670[1] }, { p2 -> p2 == INPUTS670[2] }) >> RETURNED670
				1 * makeX({ p0 -> p0 == INPUTS672[0] }, { p1 -> p1 == INPUTS672[1] }, { p2 -> p2 == INPUTS672[2] }) >> RETURNED672
				1 * makeX({ p0 -> p0 == INPUTS671[0] }, { p1 -> p1 == INPUTS671[1] }, { p2 -> p2 == INPUTS671[2] }) >> RETURNED671
				1 * makeX({ p0 -> p0 == INPUTS673[0] }, { p1 -> p1 == INPUTS673[1] }, { p2 -> p2 == INPUTS673[2] }) >> RETURNED673
				1 * makeX({ p0 -> p0 == INPUTS677[0] }, { p1 -> p1 == INPUTS677[1] }, { p2 -> p2 == INPUTS677[2] }) >> RETURNED677
				1 * makeX({ p0 -> p0 == INPUTS680[0] }, { p1 -> p1 == INPUTS680[1] }, { p2 -> p2 == INPUTS680[2] }) >> RETURNED680
				1 * makeX({ p0 -> p0 == INPUTS681[0] }, { p1 -> p1 == INPUTS681[1] }, { p2 -> p2 == INPUTS681[2] }) >> RETURNED681
				1 * makeX({ p0 -> p0 == INPUTS682[0] }, { p1 -> p1 == INPUTS682[1] }, { p2 -> p2 == INPUTS682[2] }) >> RETURNED682
				1 * makeX({ p0 -> p0 == INPUTS684[0] }, { p1 -> p1 == INPUTS684[1] }, { p2 -> p2 == INPUTS684[2] }) >> RETURNED684
				1 * makeX({ p0 -> p0 == INPUTS686[0] }, { p1 -> p1 == INPUTS686[1] }, { p2 -> p2 == INPUTS686[2] }) >> RETURNED686
				1 * makeX({ p0 -> p0 == INPUTS690[0] }, { p1 -> p1 == INPUTS690[1] }, { p2 -> p2 == INPUTS690[2] }) >> RETURNED690
			}
			subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
				1 * doServiceC({ p0 -> p0 == INPUTS696[0] }) >> RETURNED696
				1 * doServiceC({ p0 -> p0 == INPUTS699[0] }) >> RETURNED699
			}
		when:
			def ret = subject.hello(*INPUTS655)
		then:
			ret == RETURNED655
	}
	
	
	static final def INPUTS690 = [
			't2',
			'x',
			9
	]
	static final def INPUTS680 = [
			't2',
			'x',
			4
	]
	static final def INPUTS691 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS670 = [
			't2',
			'x',
			9
	]
	static final def INPUTS681 = [
			't2',
			'x',
			7
	]
	static final def INPUTS660 = [
			't2',
			'x',
			6
	]
	static final def INPUTS671 = [
			't2',
			'x',
			2
	]
	static final def INPUTS682 = [
			't2',
			'x',
			8
	]
	static final def INPUTS661 = [
			't2',
			'x',
			2
	]
	static final def INPUTS672 = [
			't2',
			'x',
			3
	]
	static final def INPUTS662 = [
			't2',
			'x',
			4
	]
	static final def INPUTS673 = [
			't2',
			'x',
			5
	]
	static final def INPUTS684 = [
			't2',
			'x',
			1
	]
	static final def INPUTS695 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS696 = [
			1
	]
	static final def INPUTS686 = [
			't2',
			'x',
			7
	]
	static final def INPUTS655 = [
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
	static final def INPUTS677 = [
			't2',
			'x',
			5
	]
	static final def INPUTS699 = [
			1
	]
	static final def INPUTS657 = [
			't2',
			'x',
			6
	]
	static final def INPUTS658 = [
			't2',
			'x',
			3
	]
	static final def INPUTS669 = [
			't2',
			'x',
			1
	]
	static final def INPUTS659 = [
			't2',
			'x',
			8
	]
	
	static final def OUTPUTS690 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS680 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS691 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS670 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS681 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS660 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS671 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS682 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS661 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS672 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS662 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS673 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS684 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS695 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS696 = [
			1
	]
	static final def OUTPUTS686 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS655 = [
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
	static final def OUTPUTS677 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS699 = [
			1
	]
	static final def OUTPUTS657 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS658 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS669 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS659 = [
			't2',
			'x',
			8
	]
	
	static final def RETURNED690 = [
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
	
	static final def RETURNED680 = [
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
	
	static final def RETURNED691 = 'null<>null'
	
	static final def RETURNED670 = [
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
	
	static final def RETURNED660 = [
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
	
	static final def RETURNED671 = [
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
	
	static final def RETURNED682 = [
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
	
	static final def RETURNED673 = [
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
	
	static final def RETURNED684 = [
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
	
	static final def RETURNED695 = 'null<>null'
	
	static final def RETURNED696 = 1
	
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
			fromServiceC: 1,
	] as com.etz.replay.unit.targets.ServiceData
	
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
	
	static final def RETURNED699 = 1
	
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
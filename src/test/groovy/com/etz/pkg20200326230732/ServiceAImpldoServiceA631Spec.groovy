package com.etz.pkg20200326230733

import spock.lang.Specification

class ServiceAImpldoServiceA631Spec extends Specification {
	void verifydoServiceA() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceAImpl()
			subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
				1 * doServiceB({ p0 -> p0 == INPUTS651[0] }) >> RETURNED651
			}
			subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
				1 * makeX({ p0 -> p0 == INPUTS633[0] }, { p1 -> p1 == INPUTS633[1] }, { p2 -> p2 == INPUTS633[2] }) >> RETURNED633
				1 * makeX({ p0 -> p0 == INPUTS635[0] }, { p1 -> p1 == INPUTS635[1] }, { p2 -> p2 == INPUTS635[2] }) >> RETURNED635
				1 * makeX({ p0 -> p0 == INPUTS637[0] }, { p1 -> p1 == INPUTS637[1] }, { p2 -> p2 == INPUTS637[2] }) >> RETURNED637
				1 * makeX({ p0 -> p0 == INPUTS634[0] }, { p1 -> p1 == INPUTS634[1] }, { p2 -> p2 == INPUTS634[2] }) >> RETURNED634
				1 * makeX({ p0 -> p0 == INPUTS636[0] }, { p1 -> p1 == INPUTS636[1] }, { p2 -> p2 == INPUTS636[2] }) >> RETURNED636
				1 * makeX({ p0 -> p0 == INPUTS638[0] }, { p1 -> p1 == INPUTS638[1] }, { p2 -> p2 == INPUTS638[2] }) >> RETURNED638
				1 * makeX({ p0 -> p0 == INPUTS643[0] }, { p1 -> p1 == INPUTS643[1] }, { p2 -> p2 == INPUTS643[2] }) >> RETURNED643
				1 * makeX({ p0 -> p0 == INPUTS645[0] }, { p1 -> p1 == INPUTS645[1] }, { p2 -> p2 == INPUTS645[2] }) >> RETURNED645
				1 * makeX({ p0 -> p0 == INPUTS646[0] }, { p1 -> p1 == INPUTS646[1] }, { p2 -> p2 == INPUTS646[2] }) >> RETURNED646
			}
			subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
				1 * doServiceC({ p0 -> p0 == INPUTS653[0] }) >> RETURNED653
			}
		when:
			def ret = subject.doServiceA(*INPUTS631)
		then:
			ret == RETURNED631
	}
	
	
	static final def INPUTS651 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS631 = [
			't',
			0,
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
	static final def INPUTS653 = [
			0
	]
	static final def INPUTS643 = [
			't',
			'x',
			5
	]
	static final def INPUTS633 = [
			't',
			'x',
			6
	]
	static final def INPUTS634 = [
			't',
			'x',
			2
	]
	static final def INPUTS645 = [
			't',
			'x',
			7
	]
	static final def INPUTS635 = [
			't',
			'x',
			3
	]
	static final def INPUTS646 = [
			't',
			'x',
			9
	]
	static final def INPUTS636 = [
			't',
			'x',
			4
	]
	static final def INPUTS637 = [
			't',
			'x',
			1
	]
	static final def INPUTS638 = [
			't',
			'x',
			8
	]
	
	static final def OUTPUTS651 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS631 = [
			't',
			0,
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
	static final def OUTPUTS653 = [
			0
	]
	static final def OUTPUTS643 = [
			't',
			'x',
			5
	]
	static final def OUTPUTS633 = [
			't',
			'x',
			6
	]
	static final def OUTPUTS634 = [
			't',
			'x',
			2
	]
	static final def OUTPUTS645 = [
			't',
			'x',
			7
	]
	static final def OUTPUTS635 = [
			't',
			'x',
			3
	]
	static final def OUTPUTS646 = [
			't',
			'x',
			9
	]
	static final def OUTPUTS636 = [
			't',
			'x',
			4
	]
	static final def OUTPUTS637 = [
			't',
			'x',
			1
	]
	static final def OUTPUTS638 = [
			't',
			'x',
			8
	]
	
	static final def RETURNED651 = 'null<>null'
	
	static final def RETURNED631 = [
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
			fromServiceC: 0,
	] as com.etz.replay.unit.targets.ServiceData
	
	static final def RETURNED653 = 0
	
	static final def RETURNED643 = [
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
	
	static final def RETURNED633 = [
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
	
	static final def RETURNED634 = [
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
	
	static final def RETURNED645 = [
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
	
	static final def RETURNED635 = [
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
	
	static final def RETURNED646 = [
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
	
	static final def RETURNED636 = [
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
	
	static final def RETURNED637 = [
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
	
	static final def RETURNED638 = [
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
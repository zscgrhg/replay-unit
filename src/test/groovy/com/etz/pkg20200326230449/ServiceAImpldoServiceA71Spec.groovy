package com.etz.pkg20200326230450

import spock.lang.Specification

class ServiceAImpldoServiceA71Spec extends Specification {
	void verifydoServiceA() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceAImpl()
			subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
				1 * doServiceB({ p0 -> p0 == INPUTS91[0] }) >> RETURNED91
			}
			subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
				1 * makeX({ p0 -> p0 == INPUTS73[0] }, { p1 -> p1 == INPUTS73[1] }, { p2 -> p2 == INPUTS73[2] }) >> RETURNED73
				1 * makeX({ p0 -> p0 == INPUTS78[0] }, { p1 -> p1 == INPUTS78[1] }, { p2 -> p2 == INPUTS78[2] }) >> RETURNED78
				1 * makeX({ p0 -> p0 == INPUTS75[0] }, { p1 -> p1 == INPUTS75[1] }, { p2 -> p2 == INPUTS75[2] }) >> RETURNED75
				1 * makeX({ p0 -> p0 == INPUTS77[0] }, { p1 -> p1 == INPUTS77[1] }, { p2 -> p2 == INPUTS77[2] }) >> RETURNED77
				1 * makeX({ p0 -> p0 == INPUTS76[0] }, { p1 -> p1 == INPUTS76[1] }, { p2 -> p2 == INPUTS76[2] }) >> RETURNED76
				1 * makeX({ p0 -> p0 == INPUTS74[0] }, { p1 -> p1 == INPUTS74[1] }, { p2 -> p2 == INPUTS74[2] }) >> RETURNED74
				1 * makeX({ p0 -> p0 == INPUTS85[0] }, { p1 -> p1 == INPUTS85[1] }, { p2 -> p2 == INPUTS85[2] }) >> RETURNED85
				1 * makeX({ p0 -> p0 == INPUTS87[0] }, { p1 -> p1 == INPUTS87[1] }, { p2 -> p2 == INPUTS87[2] }) >> RETURNED87
				1 * makeX({ p0 -> p0 == INPUTS86[0] }, { p1 -> p1 == INPUTS86[1] }, { p2 -> p2 == INPUTS86[2] }) >> RETURNED86
			}
			subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
				1 * doServiceC({ p0 -> p0 == INPUTS93[0] }) >> RETURNED93
			}
		when:
			def ret = subject.doServiceA(*INPUTS71)
		then:
			ret == RETURNED71
	}
	
	
	static final def INPUTS77 = [
			't',
			'x',
			3
	]
	static final def INPUTS78 = [
			't',
			'x',
			1
	]
	static final def INPUTS91 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS71 = [
			't',
			7,
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
	static final def INPUTS93 = [
			7
	]
	static final def INPUTS73 = [
			't',
			'x',
			6
	]
	static final def INPUTS74 = [
			't',
			'x',
			8
	]
	static final def INPUTS85 = [
			't',
			'x',
			4
	]
	static final def INPUTS75 = [
			't',
			'x',
			5
	]
	static final def INPUTS86 = [
			't',
			'x',
			7
	]
	static final def INPUTS76 = [
			't',
			'x',
			2
	]
	static final def INPUTS87 = [
			't',
			'x',
			9
	]
	
	static final def OUTPUTS77 = [
			't',
			'x',
			3
	]
	static final def OUTPUTS78 = [
			't',
			'x',
			1
	]
	static final def OUTPUTS91 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS71 = [
			't',
			7,
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
	static final def OUTPUTS93 = [
			7
	]
	static final def OUTPUTS73 = [
			't',
			'x',
			6
	]
	static final def OUTPUTS74 = [
			't',
			'x',
			8
	]
	static final def OUTPUTS85 = [
			't',
			'x',
			4
	]
	static final def OUTPUTS75 = [
			't',
			'x',
			5
	]
	static final def OUTPUTS86 = [
			't',
			'x',
			7
	]
	static final def OUTPUTS76 = [
			't',
			'x',
			2
	]
	static final def OUTPUTS87 = [
			't',
			'x',
			9
	]
	
	static final def RETURNED77 = [
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
	
	static final def RETURNED78 = [
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
	
	static final def RETURNED91 = 'null<>null'
	
	static final def RETURNED71 = [
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
			fromServiceC: 49,
	] as com.etz.replay.unit.targets.ServiceData
	
	static final def RETURNED93 = 49
	
	static final def RETURNED73 = [
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
	
	static final def RETURNED74 = [
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
	
	static final def RETURNED85 = [
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
	
	static final def RETURNED75 = [
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
	
	static final def RETURNED86 = [
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
	
	static final def RETURNED76 = [
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
	
	static final def RETURNED87 = [
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
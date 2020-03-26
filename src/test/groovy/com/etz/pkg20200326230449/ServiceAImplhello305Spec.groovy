package com.etz.pkg20200326230449

import spock.lang.Specification

class ServiceAImplhello305Spec extends Specification {
	void verifyhello() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceAImpl()
			subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
				1 * doServiceB({ p0 -> p0 == INPUTS343[0] }) >> RETURNED343
				1 * doServiceB({ p0 -> p0 == INPUTS344[0] }) >> RETURNED344
			}
			subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
				1 * makeX({ p0 -> p0 == INPUTS310[0] }, { p1 -> p1 == INPUTS310[1] }, { p2 -> p2 == INPUTS310[2] }) >> RETURNED310
				1 * makeX({ p0 -> p0 == INPUTS308[0] }, { p1 -> p1 == INPUTS308[1] }, { p2 -> p2 == INPUTS308[2] }) >> RETURNED308
				1 * makeX({ p0 -> p0 == INPUTS309[0] }, { p1 -> p1 == INPUTS309[1] }, { p2 -> p2 == INPUTS309[2] }) >> RETURNED309
				1 * makeX({ p0 -> p0 == INPUTS311[0] }, { p1 -> p1 == INPUTS311[1] }, { p2 -> p2 == INPUTS311[2] }) >> RETURNED311
				1 * makeX({ p0 -> p0 == INPUTS307[0] }, { p1 -> p1 == INPUTS307[1] }, { p2 -> p2 == INPUTS307[2] }) >> RETURNED307
				1 * makeX({ p0 -> p0 == INPUTS312[0] }, { p1 -> p1 == INPUTS312[1] }, { p2 -> p2 == INPUTS312[2] }) >> RETURNED312
				1 * makeX({ p0 -> p0 == INPUTS320[0] }, { p1 -> p1 == INPUTS320[1] }, { p2 -> p2 == INPUTS320[2] }) >> RETURNED320
				1 * makeX({ p0 -> p0 == INPUTS318[0] }, { p1 -> p1 == INPUTS318[1] }, { p2 -> p2 == INPUTS318[2] }) >> RETURNED318
				1 * makeX({ p0 -> p0 == INPUTS319[0] }, { p1 -> p1 == INPUTS319[1] }, { p2 -> p2 == INPUTS319[2] }) >> RETURNED319
				1 * makeX({ p0 -> p0 == INPUTS324[0] }, { p1 -> p1 == INPUTS324[1] }, { p2 -> p2 == INPUTS324[2] }) >> RETURNED324
				1 * makeX({ p0 -> p0 == INPUTS325[0] }, { p1 -> p1 == INPUTS325[1] }, { p2 -> p2 == INPUTS325[2] }) >> RETURNED325
				1 * makeX({ p0 -> p0 == INPUTS327[0] }, { p1 -> p1 == INPUTS327[1] }, { p2 -> p2 == INPUTS327[2] }) >> RETURNED327
				1 * makeX({ p0 -> p0 == INPUTS328[0] }, { p1 -> p1 == INPUTS328[1] }, { p2 -> p2 == INPUTS328[2] }) >> RETURNED328
				1 * makeX({ p0 -> p0 == INPUTS329[0] }, { p1 -> p1 == INPUTS329[1] }, { p2 -> p2 == INPUTS329[2] }) >> RETURNED329
				1 * makeX({ p0 -> p0 == INPUTS331[0] }, { p1 -> p1 == INPUTS331[1] }, { p2 -> p2 == INPUTS331[2] }) >> RETURNED331
				1 * makeX({ p0 -> p0 == INPUTS336[0] }, { p1 -> p1 == INPUTS336[1] }, { p2 -> p2 == INPUTS336[2] }) >> RETURNED336
				1 * makeX({ p0 -> p0 == INPUTS337[0] }, { p1 -> p1 == INPUTS337[1] }, { p2 -> p2 == INPUTS337[2] }) >> RETURNED337
				1 * makeX({ p0 -> p0 == INPUTS338[0] }, { p1 -> p1 == INPUTS338[1] }, { p2 -> p2 == INPUTS338[2] }) >> RETURNED338
			}
			subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
				1 * doServiceC({ p0 -> p0 == INPUTS347[0] }) >> RETURNED347
				1 * doServiceC({ p0 -> p0 == INPUTS348[0] }) >> RETURNED348
			}
		when:
			def ret = subject.hello(*INPUTS305)
		then:
			ret == RETURNED305
	}
	
	
	static final def INPUTS320 = [
			't2',
			'x',
			5
	]
	static final def INPUTS331 = [
			't2',
			'x',
			7
	]
	static final def INPUTS310 = [
			't2',
			'x',
			6
	]
	static final def INPUTS343 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS311 = [
			't2',
			'x',
			8
	]
	static final def INPUTS344 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS312 = [
			't2',
			'x',
			2
	]
	static final def INPUTS324 = [
			't2',
			'x',
			9
	]
	static final def INPUTS325 = [
			't2',
			'x',
			1
	]
	static final def INPUTS336 = [
			't2',
			'x',
			7
	]
	static final def INPUTS347 = [
			4
	]
	static final def INPUTS337 = [
			't2',
			'x',
			9
	]
	static final def INPUTS348 = [
			4
	]
	static final def INPUTS305 = [
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
	static final def INPUTS327 = [
			't2',
			'x',
			5
	]
	static final def INPUTS338 = [
			't2',
			'x',
			1
	]
	static final def INPUTS328 = [
			't2',
			'x',
			2
	]
	static final def INPUTS307 = [
			't2',
			'x',
			6
	]
	static final def INPUTS318 = [
			't2',
			'x',
			4
	]
	static final def INPUTS329 = [
			't2',
			'x',
			8
	]
	static final def INPUTS308 = [
			't2',
			'x',
			3
	]
	static final def INPUTS319 = [
			't2',
			'x',
			4
	]
	static final def INPUTS309 = [
			't2',
			'x',
			3
	]
	
	static final def OUTPUTS320 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS331 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS310 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS343 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS311 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS344 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS312 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS324 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS325 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS336 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS347 = [
			4
	]
	static final def OUTPUTS337 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS348 = [
			4
	]
	static final def OUTPUTS305 = [
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
	static final def OUTPUTS327 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS338 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS328 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS307 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS318 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS329 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS308 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS319 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS309 = [
			't2',
			'x',
			3
	]
	
	static final def RETURNED320 = [
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
	
	static final def RETURNED331 = [
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
	
	static final def RETURNED310 = [
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
	
	static final def RETURNED343 = 'null<>null'
	
	static final def RETURNED311 = [
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
	
	static final def RETURNED344 = 'null<>null'
	
	static final def RETURNED312 = [
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
	
	static final def RETURNED324 = [
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
	
	static final def RETURNED325 = [
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
	
	static final def RETURNED336 = [
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
	
	static final def RETURNED347 = 16
	
	static final def RETURNED337 = [
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
	
	static final def RETURNED348 = 16
	
	static final def RETURNED305 = [
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
	
	static final def RETURNED327 = [
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
	
	static final def RETURNED338 = [
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
	
	static final def RETURNED328 = [
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
	
	static final def RETURNED307 = [
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
	
	static final def RETURNED318 = [
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
	
	static final def RETURNED329 = [
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
	
	static final def RETURNED308 = [
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
	
	static final def RETURNED319 = [
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
	
	static final def RETURNED309 = [
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
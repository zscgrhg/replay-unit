package com.etz.pkg20200326230449

import spock.lang.Specification

class ServiceAImplhello375Spec extends Specification {
	void verifyhello() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceAImpl()
			subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
				1 * doServiceB({ p0 -> p0 == INPUTS403[0] }) >> RETURNED403
				1 * doServiceB({ p0 -> p0 == INPUTS417[0] }) >> RETURNED417
			}
			subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
				1 * makeX({ p0 -> p0 == INPUTS378[0] }, { p1 -> p1 == INPUTS378[1] }, { p2 -> p2 == INPUTS378[2] }) >> RETURNED378
				1 * makeX({ p0 -> p0 == INPUTS381[0] }, { p1 -> p1 == INPUTS381[1] }, { p2 -> p2 == INPUTS381[2] }) >> RETURNED381
				1 * makeX({ p0 -> p0 == INPUTS380[0] }, { p1 -> p1 == INPUTS380[1] }, { p2 -> p2 == INPUTS380[2] }) >> RETURNED380
				1 * makeX({ p0 -> p0 == INPUTS382[0] }, { p1 -> p1 == INPUTS382[1] }, { p2 -> p2 == INPUTS382[2] }) >> RETURNED382
				1 * makeX({ p0 -> p0 == INPUTS379[0] }, { p1 -> p1 == INPUTS379[1] }, { p2 -> p2 == INPUTS379[2] }) >> RETURNED379
				1 * makeX({ p0 -> p0 == INPUTS377[0] }, { p1 -> p1 == INPUTS377[1] }, { p2 -> p2 == INPUTS377[2] }) >> RETURNED377
				1 * makeX({ p0 -> p0 == INPUTS388[0] }, { p1 -> p1 == INPUTS388[1] }, { p2 -> p2 == INPUTS388[2] }) >> RETURNED388
				1 * makeX({ p0 -> p0 == INPUTS390[0] }, { p1 -> p1 == INPUTS390[1] }, { p2 -> p2 == INPUTS390[2] }) >> RETURNED390
				1 * makeX({ p0 -> p0 == INPUTS391[0] }, { p1 -> p1 == INPUTS391[1] }, { p2 -> p2 == INPUTS391[2] }) >> RETURNED391
				1 * makeX({ p0 -> p0 == INPUTS392[0] }, { p1 -> p1 == INPUTS392[1] }, { p2 -> p2 == INPUTS392[2] }) >> RETURNED392
				1 * makeX({ p0 -> p0 == INPUTS395[0] }, { p1 -> p1 == INPUTS395[1] }, { p2 -> p2 == INPUTS395[2] }) >> RETURNED395
				1 * makeX({ p0 -> p0 == INPUTS399[0] }, { p1 -> p1 == INPUTS399[1] }, { p2 -> p2 == INPUTS399[2] }) >> RETURNED399
				1 * makeX({ p0 -> p0 == INPUTS398[0] }, { p1 -> p1 == INPUTS398[1] }, { p2 -> p2 == INPUTS398[2] }) >> RETURNED398
				1 * makeX({ p0 -> p0 == INPUTS402[0] }, { p1 -> p1 == INPUTS402[1] }, { p2 -> p2 == INPUTS402[2] }) >> RETURNED402
				1 * makeX({ p0 -> p0 == INPUTS401[0] }, { p1 -> p1 == INPUTS401[1] }, { p2 -> p2 == INPUTS401[2] }) >> RETURNED401
				1 * makeX({ p0 -> p0 == INPUTS408[0] }, { p1 -> p1 == INPUTS408[1] }, { p2 -> p2 == INPUTS408[2] }) >> RETURNED408
				1 * makeX({ p0 -> p0 == INPUTS409[0] }, { p1 -> p1 == INPUTS409[1] }, { p2 -> p2 == INPUTS409[2] }) >> RETURNED409
				1 * makeX({ p0 -> p0 == INPUTS411[0] }, { p1 -> p1 == INPUTS411[1] }, { p2 -> p2 == INPUTS411[2] }) >> RETURNED411
			}
			subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
				1 * doServiceC({ p0 -> p0 == INPUTS414[0] }) >> RETURNED414
				1 * doServiceC({ p0 -> p0 == INPUTS419[0] }) >> RETURNED419
			}
		when:
			def ret = subject.hello(*INPUTS375)
		then:
			ret == RETURNED375
	}
	
	
	static final def INPUTS390 = [
			't2',
			'x',
			9
	]
	static final def INPUTS380 = [
			't2',
			'x',
			6
	]
	static final def INPUTS391 = [
			't2',
			'x',
			1
	]
	static final def INPUTS381 = [
			't2',
			'x',
			8
	]
	static final def INPUTS392 = [
			't2',
			'x',
			7
	]
	static final def INPUTS382 = [
			't2',
			'x',
			5
	]
	static final def INPUTS395 = [
			't2',
			'x',
			5
	]
	static final def INPUTS375 = [
			't2',
			19,
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
	static final def INPUTS398 = [
			't2',
			'x',
			8
	]
	static final def INPUTS377 = [
			't2',
			'x',
			6
	]
	static final def INPUTS388 = [
			't2',
			'x',
			4
	]
	static final def INPUTS399 = [
			't2',
			'x',
			3
	]
	static final def INPUTS378 = [
			't2',
			'x',
			3
	]
	static final def INPUTS411 = [
			't2',
			'x',
			1
	]
	static final def INPUTS379 = [
			't2',
			'x',
			2
	]
	static final def INPUTS401 = [
			't2',
			'x',
			7
	]
	static final def INPUTS402 = [
			't2',
			'x',
			9
	]
	static final def INPUTS403 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS414 = [
			19
	]
	static final def INPUTS417 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS408 = [
			't2',
			'x',
			2
	]
	static final def INPUTS419 = [
			19
	]
	static final def INPUTS409 = [
			't2',
			'x',
			4
	]
	
	static final def OUTPUTS390 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS380 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS391 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS381 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS392 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS382 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS395 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS375 = [
			't2',
			19,
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
	static final def OUTPUTS398 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS377 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS388 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS399 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS378 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS411 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS379 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS401 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS402 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS403 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS414 = [
			19
	]
	static final def OUTPUTS417 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS408 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS419 = [
			19
	]
	static final def OUTPUTS409 = [
			't2',
			'x',
			4
	]
	
	static final def RETURNED390 = [
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
	
	static final def RETURNED380 = [
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
	
	static final def RETURNED391 = [
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
	
	static final def RETURNED381 = [
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
	
	static final def RETURNED392 = [
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
	
	static final def RETURNED382 = [
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
	
	static final def RETURNED395 = [
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
	
	static final def RETURNED375 = [
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
			fromServiceC: 361,
	] as com.etz.replay.unit.targets.ServiceData
	
	static final def RETURNED398 = [
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
	
	static final def RETURNED377 = [
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
	
	static final def RETURNED388 = [
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
	
	static final def RETURNED399 = [
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
	
	static final def RETURNED378 = [
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
	
	static final def RETURNED411 = [
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
	
	static final def RETURNED379 = [
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
	
	static final def RETURNED401 = [
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
	
	static final def RETURNED402 = [
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
	
	static final def RETURNED403 = 'null<>null'
	
	static final def RETURNED414 = 361
	
	static final def RETURNED417 = 'null<>null'
	
	static final def RETURNED408 = [
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
	
	static final def RETURNED419 = 361
	
	static final def RETURNED409 = [
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
package com.etz.pkg20200326213328

import spock.lang.Specification

class ServiceAImplhello375Spec extends Specification {
	void verifyhello() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceAImpl()
			subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
				1 * doServiceB({ p0 -> p0 == INPUTS411[0] }) >> RETURNED411
				1 * doServiceB({ p0 -> p0 == INPUTS416[0] }) >> RETURNED416
			}
			subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
				1 * makeX({ p0 -> p0 == INPUTS381[0] }, { p1 -> p1 == INPUTS381[1] }, { p2 -> p2 == INPUTS381[2] }) >> RETURNED381
				1 * makeX({ p0 -> p0 == INPUTS378[0] }, { p1 -> p1 == INPUTS378[1] }, { p2 -> p2 == INPUTS378[2] }) >> RETURNED378
				1 * makeX({ p0 -> p0 == INPUTS380[0] }, { p1 -> p1 == INPUTS380[1] }, { p2 -> p2 == INPUTS380[2] }) >> RETURNED380
				1 * makeX({ p0 -> p0 == INPUTS377[0] }, { p1 -> p1 == INPUTS377[1] }, { p2 -> p2 == INPUTS377[2] }) >> RETURNED377
				1 * makeX({ p0 -> p0 == INPUTS379[0] }, { p1 -> p1 == INPUTS379[1] }, { p2 -> p2 == INPUTS379[2] }) >> RETURNED379
				1 * makeX({ p0 -> p0 == INPUTS382[0] }, { p1 -> p1 == INPUTS382[1] }, { p2 -> p2 == INPUTS382[2] }) >> RETURNED382
				1 * makeX({ p0 -> p0 == INPUTS389[0] }, { p1 -> p1 == INPUTS389[1] }, { p2 -> p2 == INPUTS389[2] }) >> RETURNED389
				1 * makeX({ p0 -> p0 == INPUTS390[0] }, { p1 -> p1 == INPUTS390[1] }, { p2 -> p2 == INPUTS390[2] }) >> RETURNED390
				1 * makeX({ p0 -> p0 == INPUTS391[0] }, { p1 -> p1 == INPUTS391[1] }, { p2 -> p2 == INPUTS391[2] }) >> RETURNED391
				1 * makeX({ p0 -> p0 == INPUTS394[0] }, { p1 -> p1 == INPUTS394[1] }, { p2 -> p2 == INPUTS394[2] }) >> RETURNED394
				1 * makeX({ p0 -> p0 == INPUTS393[0] }, { p1 -> p1 == INPUTS393[1] }, { p2 -> p2 == INPUTS393[2] }) >> RETURNED393
				1 * makeX({ p0 -> p0 == INPUTS392[0] }, { p1 -> p1 == INPUTS392[1] }, { p2 -> p2 == INPUTS392[2] }) >> RETURNED392
				1 * makeX({ p0 -> p0 == INPUTS400[0] }, { p1 -> p1 == INPUTS400[1] }, { p2 -> p2 == INPUTS400[2] }) >> RETURNED400
				1 * makeX({ p0 -> p0 == INPUTS402[0] }, { p1 -> p1 == INPUTS402[1] }, { p2 -> p2 == INPUTS402[2] }) >> RETURNED402
				1 * makeX({ p0 -> p0 == INPUTS403[0] }, { p1 -> p1 == INPUTS403[1] }, { p2 -> p2 == INPUTS403[2] }) >> RETURNED403
				1 * makeX({ p0 -> p0 == INPUTS404[0] }, { p1 -> p1 == INPUTS404[1] }, { p2 -> p2 == INPUTS404[2] }) >> RETURNED404
				1 * makeX({ p0 -> p0 == INPUTS406[0] }, { p1 -> p1 == INPUTS406[1] }, { p2 -> p2 == INPUTS406[2] }) >> RETURNED406
				1 * makeX({ p0 -> p0 == INPUTS412[0] }, { p1 -> p1 == INPUTS412[1] }, { p2 -> p2 == INPUTS412[2] }) >> RETURNED412
			}
			subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
				1 * doServiceC({ p0 -> p0 == INPUTS415[0] }) >> RETURNED415
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
			8
	]
	static final def INPUTS391 = [
			't2',
			'x',
			1
	]
	static final def INPUTS381 = [
			't2',
			'x',
			3
	]
	static final def INPUTS392 = [
			't2',
			'x',
			4
	]
	static final def INPUTS382 = [
			't2',
			'x',
			6
	]
	static final def INPUTS393 = [
			't2',
			'x',
			5
	]
	static final def INPUTS394 = [
			't2',
			'x',
			5
	]
	static final def INPUTS375 = [
			't2',
			2,
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
	static final def INPUTS377 = [
			't2',
			'x',
			6
	]
	static final def INPUTS378 = [
			't2',
			'x',
			3
	]
	static final def INPUTS389 = [
			't2',
			'x',
			4
	]
	static final def INPUTS400 = [
			't2',
			'x',
			2
	]
	static final def INPUTS411 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS379 = [
			't2',
			'x',
			2
	]
	static final def INPUTS412 = [
			't2',
			'x',
			9
	]
	static final def INPUTS402 = [
			't2',
			'x',
			1
	]
	static final def INPUTS403 = [
			't2',
			'x',
			7
	]
	static final def INPUTS404 = [
			't2',
			'x',
			8
	]
	static final def INPUTS415 = [
			2
	]
	static final def INPUTS416 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS406 = [
			't2',
			'x',
			7
	]
	static final def INPUTS419 = [
			2
	]
	
	static final def OUTPUTS390 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS380 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS391 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS381 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS392 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS382 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS393 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS394 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS375 = [
			't2',
			2,
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
	static final def OUTPUTS377 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS378 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS389 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS400 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS411 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS379 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS412 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS402 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS403 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS404 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS415 = [
			2
	]
	static final def OUTPUTS416 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS406 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS419 = [
			2
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
	
	static final def RETURNED393 = [
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
	
	static final def RETURNED394 = [
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
			fromServiceC: 4,
	] as com.etz.replay.unit.targets.ServiceData
	
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
	
	static final def RETURNED389 = [
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
	
	static final def RETURNED400 = [
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
	
	static final def RETURNED411 = 'null<>null'
	
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
	
	static final def RETURNED412 = [
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
	
	static final def RETURNED403 = [
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
	
	static final def RETURNED404 = [
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
	
	static final def RETURNED415 = 4
	
	static final def RETURNED416 = 'null<>null'
	
	static final def RETURNED406 = [
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
	
	static final def RETURNED419 = 4
	
	
}
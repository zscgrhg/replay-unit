package com.etz.pkg20200326230732

import spock.lang.Specification

class ServiceAImplhello235Spec extends Specification {
	void verifyhello() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceAImpl()
			subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
				1 * doServiceB({ p0 -> p0 == INPUTS273[0] }) >> RETURNED273
				1 * doServiceB({ p0 -> p0 == INPUTS274[0] }) >> RETURNED274
			}
			subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
				1 * makeX({ p0 -> p0 == INPUTS241[0] }, { p1 -> p1 == INPUTS241[1] }, { p2 -> p2 == INPUTS241[2] }) >> RETURNED241
				1 * makeX({ p0 -> p0 == INPUTS239[0] }, { p1 -> p1 == INPUTS239[1] }, { p2 -> p2 == INPUTS239[2] }) >> RETURNED239
				1 * makeX({ p0 -> p0 == INPUTS240[0] }, { p1 -> p1 == INPUTS240[1] }, { p2 -> p2 == INPUTS240[2] }) >> RETURNED240
				1 * makeX({ p0 -> p0 == INPUTS238[0] }, { p1 -> p1 == INPUTS238[1] }, { p2 -> p2 == INPUTS238[2] }) >> RETURNED238
				1 * makeX({ p0 -> p0 == INPUTS237[0] }, { p1 -> p1 == INPUTS237[1] }, { p2 -> p2 == INPUTS237[2] }) >> RETURNED237
				1 * makeX({ p0 -> p0 == INPUTS242[0] }, { p1 -> p1 == INPUTS242[1] }, { p2 -> p2 == INPUTS242[2] }) >> RETURNED242
				1 * makeX({ p0 -> p0 == INPUTS249[0] }, { p1 -> p1 == INPUTS249[1] }, { p2 -> p2 == INPUTS249[2] }) >> RETURNED249
				1 * makeX({ p0 -> p0 == INPUTS250[0] }, { p1 -> p1 == INPUTS250[1] }, { p2 -> p2 == INPUTS250[2] }) >> RETURNED250
				1 * makeX({ p0 -> p0 == INPUTS251[0] }, { p1 -> p1 == INPUTS251[1] }, { p2 -> p2 == INPUTS251[2] }) >> RETURNED251
				1 * makeX({ p0 -> p0 == INPUTS252[0] }, { p1 -> p1 == INPUTS252[1] }, { p2 -> p2 == INPUTS252[2] }) >> RETURNED252
				1 * makeX({ p0 -> p0 == INPUTS254[0] }, { p1 -> p1 == INPUTS254[1] }, { p2 -> p2 == INPUTS254[2] }) >> RETURNED254
				1 * makeX({ p0 -> p0 == INPUTS253[0] }, { p1 -> p1 == INPUTS253[1] }, { p2 -> p2 == INPUTS253[2] }) >> RETURNED253
				1 * makeX({ p0 -> p0 == INPUTS261[0] }, { p1 -> p1 == INPUTS261[1] }, { p2 -> p2 == INPUTS261[2] }) >> RETURNED261
				1 * makeX({ p0 -> p0 == INPUTS263[0] }, { p1 -> p1 == INPUTS263[1] }, { p2 -> p2 == INPUTS263[2] }) >> RETURNED263
				1 * makeX({ p0 -> p0 == INPUTS262[0] }, { p1 -> p1 == INPUTS262[1] }, { p2 -> p2 == INPUTS262[2] }) >> RETURNED262
				1 * makeX({ p0 -> p0 == INPUTS265[0] }, { p1 -> p1 == INPUTS265[1] }, { p2 -> p2 == INPUTS265[2] }) >> RETURNED265
				1 * makeX({ p0 -> p0 == INPUTS264[0] }, { p1 -> p1 == INPUTS264[1] }, { p2 -> p2 == INPUTS264[2] }) >> RETURNED264
				1 * makeX({ p0 -> p0 == INPUTS266[0] }, { p1 -> p1 == INPUTS266[1] }, { p2 -> p2 == INPUTS266[2] }) >> RETURNED266
			}
			subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
				1 * doServiceC({ p0 -> p0 == INPUTS277[0] }) >> RETURNED277
				1 * doServiceC({ p0 -> p0 == INPUTS278[0] }) >> RETURNED278
			}
		when:
			def ret = subject.hello(*INPUTS235)
		then:
			ret == RETURNED235
	}
	
	
	static final def INPUTS250 = [
			't2',
			'x',
			9
	]
	static final def INPUTS261 = [
			't2',
			'x',
			7
	]
	static final def INPUTS240 = [
			't2',
			'x',
			8
	]
	static final def INPUTS251 = [
			't2',
			'x',
			8
	]
	static final def INPUTS262 = [
			't2',
			'x',
			2
	]
	static final def INPUTS273 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS241 = [
			't2',
			'x',
			6
	]
	static final def INPUTS252 = [
			't2',
			'x',
			4
	]
	static final def INPUTS263 = [
			't2',
			'x',
			9
	]
	static final def INPUTS274 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS242 = [
			't2',
			'x',
			3
	]
	static final def INPUTS253 = [
			't2',
			'x',
			4
	]
	static final def INPUTS264 = [
			't2',
			'x',
			1
	]
	static final def INPUTS254 = [
			't2',
			'x',
			7
	]
	static final def INPUTS265 = [
			't2',
			'x',
			2
	]
	static final def INPUTS266 = [
			't2',
			'x',
			1
	]
	static final def INPUTS277 = [
			18
	]
	static final def INPUTS278 = [
			18
	]
	static final def INPUTS235 = [
			't2',
			18,
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
	static final def INPUTS237 = [
			't2',
			'x',
			6
	]
	static final def INPUTS238 = [
			't2',
			'x',
			3
	]
	static final def INPUTS249 = [
			't2',
			'x',
			5
	]
	static final def INPUTS239 = [
			't2',
			'x',
			5
	]
	
	static final def OUTPUTS250 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS261 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS240 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS251 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS262 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS273 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS241 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS252 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS263 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS274 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS242 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS253 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS264 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS254 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS265 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS266 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS277 = [
			18
	]
	static final def OUTPUTS278 = [
			18
	]
	static final def OUTPUTS235 = [
			't2',
			18,
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
	static final def OUTPUTS237 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS238 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS249 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS239 = [
			't2',
			'x',
			5
	]
	
	static final def RETURNED250 = [
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
	
	static final def RETURNED261 = [
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
	
	static final def RETURNED240 = [
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
	
	static final def RETURNED251 = [
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
	
	static final def RETURNED262 = [
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
	
	static final def RETURNED273 = 'null<>null'
	
	static final def RETURNED241 = [
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
	
	static final def RETURNED252 = [
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
	
	static final def RETURNED263 = [
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
	
	static final def RETURNED274 = 'null<>null'
	
	static final def RETURNED242 = [
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
	
	static final def RETURNED253 = [
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
	
	static final def RETURNED264 = [
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
	
	static final def RETURNED254 = [
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
	
	static final def RETURNED265 = [
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
	
	static final def RETURNED266 = [
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
	
	static final def RETURNED277 = 324
	
	static final def RETURNED278 = 324
	
	static final def RETURNED235 = [
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
			fromServiceC: 324,
	] as com.etz.replay.unit.targets.ServiceData
	
	static final def RETURNED237 = [
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
	
	static final def RETURNED238 = [
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
	
	static final def RETURNED249 = [
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
	
	static final def RETURNED239 = [
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
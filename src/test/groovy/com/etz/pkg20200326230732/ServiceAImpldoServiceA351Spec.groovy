package com.etz.pkg20200326230732

import spock.lang.Specification

class ServiceAImpldoServiceA351Spec extends Specification {
	void verifydoServiceA() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceAImpl()
			subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
				1 * doServiceB({ p0 -> p0 == INPUTS371[0] }) >> RETURNED371
			}
			subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
				1 * makeX({ p0 -> p0 == INPUTS353[0] }, { p1 -> p1 == INPUTS353[1] }, { p2 -> p2 == INPUTS353[2] }) >> RETURNED353
				1 * makeX({ p0 -> p0 == INPUTS354[0] }, { p1 -> p1 == INPUTS354[1] }, { p2 -> p2 == INPUTS354[2] }) >> RETURNED354
				1 * makeX({ p0 -> p0 == INPUTS357[0] }, { p1 -> p1 == INPUTS357[1] }, { p2 -> p2 == INPUTS357[2] }) >> RETURNED357
				1 * makeX({ p0 -> p0 == INPUTS358[0] }, { p1 -> p1 == INPUTS358[1] }, { p2 -> p2 == INPUTS358[2] }) >> RETURNED358
				1 * makeX({ p0 -> p0 == INPUTS356[0] }, { p1 -> p1 == INPUTS356[1] }, { p2 -> p2 == INPUTS356[2] }) >> RETURNED356
				1 * makeX({ p0 -> p0 == INPUTS355[0] }, { p1 -> p1 == INPUTS355[1] }, { p2 -> p2 == INPUTS355[2] }) >> RETURNED355
				1 * makeX({ p0 -> p0 == INPUTS365[0] }, { p1 -> p1 == INPUTS365[1] }, { p2 -> p2 == INPUTS365[2] }) >> RETURNED365
				1 * makeX({ p0 -> p0 == INPUTS367[0] }, { p1 -> p1 == INPUTS367[1] }, { p2 -> p2 == INPUTS367[2] }) >> RETURNED367
				1 * makeX({ p0 -> p0 == INPUTS366[0] }, { p1 -> p1 == INPUTS366[1] }, { p2 -> p2 == INPUTS366[2] }) >> RETURNED366
			}
			subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
				1 * doServiceC({ p0 -> p0 == INPUTS373[0] }) >> RETURNED373
			}
		when:
			def ret = subject.doServiceA(*INPUTS351)
		then:
			ret == RETURNED351
	}
	
	
	static final def INPUTS353 = [
			't',
			'x',
			6
	]
	static final def INPUTS354 = [
			't',
			'x',
			8
	]
	static final def INPUTS365 = [
			't',
			'x',
			7
	]
	static final def INPUTS355 = [
			't',
			'x',
			3
	]
	static final def INPUTS366 = [
			't',
			'x',
			9
	]
	static final def INPUTS356 = [
			't',
			'x',
			5
	]
	static final def INPUTS367 = [
			't',
			'x',
			4
	]
	static final def INPUTS357 = [
			't',
			'x',
			2
	]
	static final def INPUTS358 = [
			't',
			'x',
			1
	]
	static final def INPUTS371 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS351 = [
			't',
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
	static final def INPUTS373 = [
			18
	]
	
	static final def OUTPUTS353 = [
			't',
			'x',
			6
	]
	static final def OUTPUTS354 = [
			't',
			'x',
			8
	]
	static final def OUTPUTS365 = [
			't',
			'x',
			7
	]
	static final def OUTPUTS355 = [
			't',
			'x',
			3
	]
	static final def OUTPUTS366 = [
			't',
			'x',
			9
	]
	static final def OUTPUTS356 = [
			't',
			'x',
			5
	]
	static final def OUTPUTS367 = [
			't',
			'x',
			4
	]
	static final def OUTPUTS357 = [
			't',
			'x',
			2
	]
	static final def OUTPUTS358 = [
			't',
			'x',
			1
	]
	static final def OUTPUTS371 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS351 = [
			't',
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
	static final def OUTPUTS373 = [
			18
	]
	
	static final def RETURNED353 = [
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
	
	static final def RETURNED354 = [
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
	
	static final def RETURNED365 = [
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
	
	static final def RETURNED355 = [
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
	
	static final def RETURNED366 = [
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
	
	static final def RETURNED356 = [
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
	
	static final def RETURNED367 = [
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
	
	static final def RETURNED357 = [
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
	
	static final def RETURNED358 = [
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
	
	static final def RETURNED371 = 'null<>null'
	
	static final def RETURNED351 = [
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
			fromServiceC: 324,
	] as com.etz.replay.unit.targets.ServiceData
	
	static final def RETURNED373 = 324
	
	
}
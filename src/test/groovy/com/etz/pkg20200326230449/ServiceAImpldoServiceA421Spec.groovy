package com.etz.pkg20200326230449

import spock.lang.Specification

class ServiceAImpldoServiceA421Spec extends Specification {
	void verifydoServiceA() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceAImpl()
			subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
				1 * doServiceB({ p0 -> p0 == INPUTS441[0] }) >> RETURNED441
			}
			subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
				1 * makeX({ p0 -> p0 == INPUTS424[0] }, { p1 -> p1 == INPUTS424[1] }, { p2 -> p2 == INPUTS424[2] }) >> RETURNED424
				1 * makeX({ p0 -> p0 == INPUTS423[0] }, { p1 -> p1 == INPUTS423[1] }, { p2 -> p2 == INPUTS423[2] }) >> RETURNED423
				1 * makeX({ p0 -> p0 == INPUTS425[0] }, { p1 -> p1 == INPUTS425[1] }, { p2 -> p2 == INPUTS425[2] }) >> RETURNED425
				1 * makeX({ p0 -> p0 == INPUTS428[0] }, { p1 -> p1 == INPUTS428[1] }, { p2 -> p2 == INPUTS428[2] }) >> RETURNED428
				1 * makeX({ p0 -> p0 == INPUTS427[0] }, { p1 -> p1 == INPUTS427[1] }, { p2 -> p2 == INPUTS427[2] }) >> RETURNED427
				1 * makeX({ p0 -> p0 == INPUTS426[0] }, { p1 -> p1 == INPUTS426[1] }, { p2 -> p2 == INPUTS426[2] }) >> RETURNED426
				1 * makeX({ p0 -> p0 == INPUTS435[0] }, { p1 -> p1 == INPUTS435[1] }, { p2 -> p2 == INPUTS435[2] }) >> RETURNED435
				1 * makeX({ p0 -> p0 == INPUTS436[0] }, { p1 -> p1 == INPUTS436[1] }, { p2 -> p2 == INPUTS436[2] }) >> RETURNED436
				1 * makeX({ p0 -> p0 == INPUTS437[0] }, { p1 -> p1 == INPUTS437[1] }, { p2 -> p2 == INPUTS437[2] }) >> RETURNED437
			}
			subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
				1 * doServiceC({ p0 -> p0 == INPUTS443[0] }) >> RETURNED443
			}
		when:
			def ret = subject.doServiceA(*INPUTS421)
		then:
			ret == RETURNED421
	}
	
	
	static final def INPUTS441 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS421 = [
			't',
			10,
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
	static final def INPUTS443 = [
			10
	]
	static final def INPUTS423 = [
			't',
			'x',
			6
	]
	static final def INPUTS424 = [
			't',
			'x',
			5
	]
	static final def INPUTS435 = [
			't',
			'x',
			4
	]
	static final def INPUTS425 = [
			't',
			'x',
			2
	]
	static final def INPUTS436 = [
			't',
			'x',
			7
	]
	static final def INPUTS426 = [
			't',
			'x',
			3
	]
	static final def INPUTS437 = [
			't',
			'x',
			9
	]
	static final def INPUTS427 = [
			't',
			'x',
			1
	]
	static final def INPUTS428 = [
			't',
			'x',
			8
	]
	
	static final def OUTPUTS441 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS421 = [
			't',
			10,
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
	static final def OUTPUTS443 = [
			10
	]
	static final def OUTPUTS423 = [
			't',
			'x',
			6
	]
	static final def OUTPUTS424 = [
			't',
			'x',
			5
	]
	static final def OUTPUTS435 = [
			't',
			'x',
			4
	]
	static final def OUTPUTS425 = [
			't',
			'x',
			2
	]
	static final def OUTPUTS436 = [
			't',
			'x',
			7
	]
	static final def OUTPUTS426 = [
			't',
			'x',
			3
	]
	static final def OUTPUTS437 = [
			't',
			'x',
			9
	]
	static final def OUTPUTS427 = [
			't',
			'x',
			1
	]
	static final def OUTPUTS428 = [
			't',
			'x',
			8
	]
	
	static final def RETURNED441 = 'null<>null'
	
	static final def RETURNED421 = [
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
			fromServiceC: 100,
	] as com.etz.replay.unit.targets.ServiceData
	
	static final def RETURNED443 = 100
	
	static final def RETURNED423 = [
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
	
	static final def RETURNED424 = [
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
	
	static final def RETURNED435 = [
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
	
	static final def RETURNED425 = [
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
	
	static final def RETURNED436 = [
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
	
	static final def RETURNED426 = [
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
	
	static final def RETURNED437 = [
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
	
	static final def RETURNED427 = [
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
	
	static final def RETURNED428 = [
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
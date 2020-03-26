package com.etz.pkg20200326230732

import spock.lang.Specification

class ServiceAImpldoServiceA211Spec extends Specification {
	void verifydoServiceA() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceAImpl()
			subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
				1 * doServiceB({ p0 -> p0 == INPUTS231[0] }) >> RETURNED231
			}
			subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
				1 * makeX({ p0 -> p0 == INPUTS213[0] }, { p1 -> p1 == INPUTS213[1] }, { p2 -> p2 == INPUTS213[2] }) >> RETURNED213
				1 * makeX({ p0 -> p0 == INPUTS217[0] }, { p1 -> p1 == INPUTS217[1] }, { p2 -> p2 == INPUTS217[2] }) >> RETURNED217
				1 * makeX({ p0 -> p0 == INPUTS214[0] }, { p1 -> p1 == INPUTS214[1] }, { p2 -> p2 == INPUTS214[2] }) >> RETURNED214
				1 * makeX({ p0 -> p0 == INPUTS215[0] }, { p1 -> p1 == INPUTS215[1] }, { p2 -> p2 == INPUTS215[2] }) >> RETURNED215
				1 * makeX({ p0 -> p0 == INPUTS216[0] }, { p1 -> p1 == INPUTS216[1] }, { p2 -> p2 == INPUTS216[2] }) >> RETURNED216
				1 * makeX({ p0 -> p0 == INPUTS218[0] }, { p1 -> p1 == INPUTS218[1] }, { p2 -> p2 == INPUTS218[2] }) >> RETURNED218
				1 * makeX({ p0 -> p0 == INPUTS225[0] }, { p1 -> p1 == INPUTS225[1] }, { p2 -> p2 == INPUTS225[2] }) >> RETURNED225
				1 * makeX({ p0 -> p0 == INPUTS226[0] }, { p1 -> p1 == INPUTS226[1] }, { p2 -> p2 == INPUTS226[2] }) >> RETURNED226
				1 * makeX({ p0 -> p0 == INPUTS227[0] }, { p1 -> p1 == INPUTS227[1] }, { p2 -> p2 == INPUTS227[2] }) >> RETURNED227
			}
			subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
				1 * doServiceC({ p0 -> p0 == INPUTS233[0] }) >> RETURNED233
			}
		when:
			def ret = subject.doServiceA(*INPUTS211)
		then:
			ret == RETURNED211
	}
	
	
	static final def INPUTS231 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS211 = [
			't',
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
	static final def INPUTS233 = [
			4
	]
	static final def INPUTS213 = [
			't',
			'x',
			6
	]
	static final def INPUTS214 = [
			't',
			'x',
			8
	]
	static final def INPUTS225 = [
			't',
			'x',
			2
	]
	static final def INPUTS215 = [
			't',
			'x',
			5
	]
	static final def INPUTS226 = [
			't',
			'x',
			4
	]
	static final def INPUTS216 = [
			't',
			'x',
			7
	]
	static final def INPUTS227 = [
			't',
			'x',
			1
	]
	static final def INPUTS217 = [
			't',
			'x',
			9
	]
	static final def INPUTS218 = [
			't',
			'x',
			3
	]
	
	static final def OUTPUTS231 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS211 = [
			't',
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
	static final def OUTPUTS233 = [
			4
	]
	static final def OUTPUTS213 = [
			't',
			'x',
			6
	]
	static final def OUTPUTS214 = [
			't',
			'x',
			8
	]
	static final def OUTPUTS225 = [
			't',
			'x',
			2
	]
	static final def OUTPUTS215 = [
			't',
			'x',
			5
	]
	static final def OUTPUTS226 = [
			't',
			'x',
			4
	]
	static final def OUTPUTS216 = [
			't',
			'x',
			7
	]
	static final def OUTPUTS227 = [
			't',
			'x',
			1
	]
	static final def OUTPUTS217 = [
			't',
			'x',
			9
	]
	static final def OUTPUTS218 = [
			't',
			'x',
			3
	]
	
	static final def RETURNED231 = 'null<>null'
	
	static final def RETURNED211 = [
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
			fromServiceC: 16,
	] as com.etz.replay.unit.targets.ServiceData
	
	static final def RETURNED233 = 16
	
	static final def RETURNED213 = [
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
	
	static final def RETURNED214 = [
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
	
	static final def RETURNED225 = [
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
	
	static final def RETURNED215 = [
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
	
	static final def RETURNED226 = [
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
	
	static final def RETURNED216 = [
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
	
	static final def RETURNED227 = [
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
	
	static final def RETURNED217 = [
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
	
	static final def RETURNED218 = [
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
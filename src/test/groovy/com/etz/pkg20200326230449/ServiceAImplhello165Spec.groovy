package com.etz.pkg20200326230449

import spock.lang.Specification

class ServiceAImplhello165Spec extends Specification {
	void verifyhello() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceAImpl()
			subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl) {
				1 * doServiceB({ p0 -> p0 == INPUTS203[0] }) >> RETURNED203
				1 * doServiceB({ p0 -> p0 == INPUTS204[0] }) >> RETURNED204
			}
			subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
				1 * makeX({ p0 -> p0 == INPUTS170[0] }, { p1 -> p1 == INPUTS170[1] }, { p2 -> p2 == INPUTS170[2] }) >> RETURNED170
				1 * makeX({ p0 -> p0 == INPUTS168[0] }, { p1 -> p1 == INPUTS168[1] }, { p2 -> p2 == INPUTS168[2] }) >> RETURNED168
				1 * makeX({ p0 -> p0 == INPUTS169[0] }, { p1 -> p1 == INPUTS169[1] }, { p2 -> p2 == INPUTS169[2] }) >> RETURNED169
				1 * makeX({ p0 -> p0 == INPUTS171[0] }, { p1 -> p1 == INPUTS171[1] }, { p2 -> p2 == INPUTS171[2] }) >> RETURNED171
				1 * makeX({ p0 -> p0 == INPUTS167[0] }, { p1 -> p1 == INPUTS167[1] }, { p2 -> p2 == INPUTS167[2] }) >> RETURNED167
				1 * makeX({ p0 -> p0 == INPUTS172[0] }, { p1 -> p1 == INPUTS172[1] }, { p2 -> p2 == INPUTS172[2] }) >> RETURNED172
				1 * makeX({ p0 -> p0 == INPUTS178[0] }, { p1 -> p1 == INPUTS178[1] }, { p2 -> p2 == INPUTS178[2] }) >> RETURNED178
				1 * makeX({ p0 -> p0 == INPUTS181[0] }, { p1 -> p1 == INPUTS181[1] }, { p2 -> p2 == INPUTS181[2] }) >> RETURNED181
				1 * makeX({ p0 -> p0 == INPUTS180[0] }, { p1 -> p1 == INPUTS180[1] }, { p2 -> p2 == INPUTS180[2] }) >> RETURNED180
				1 * makeX({ p0 -> p0 == INPUTS182[0] }, { p1 -> p1 == INPUTS182[1] }, { p2 -> p2 == INPUTS182[2] }) >> RETURNED182
				1 * makeX({ p0 -> p0 == INPUTS184[0] }, { p1 -> p1 == INPUTS184[1] }, { p2 -> p2 == INPUTS184[2] }) >> RETURNED184
				1 * makeX({ p0 -> p0 == INPUTS188[0] }, { p1 -> p1 == INPUTS188[1] }, { p2 -> p2 == INPUTS188[2] }) >> RETURNED188
				1 * makeX({ p0 -> p0 == INPUTS189[0] }, { p1 -> p1 == INPUTS189[1] }, { p2 -> p2 == INPUTS189[2] }) >> RETURNED189
				1 * makeX({ p0 -> p0 == INPUTS190[0] }, { p1 -> p1 == INPUTS190[1] }, { p2 -> p2 == INPUTS190[2] }) >> RETURNED190
				1 * makeX({ p0 -> p0 == INPUTS193[0] }, { p1 -> p1 == INPUTS193[1] }, { p2 -> p2 == INPUTS193[2] }) >> RETURNED193
				1 * makeX({ p0 -> p0 == INPUTS194[0] }, { p1 -> p1 == INPUTS194[1] }, { p2 -> p2 == INPUTS194[2] }) >> RETURNED194
				1 * makeX({ p0 -> p0 == INPUTS197[0] }, { p1 -> p1 == INPUTS197[1] }, { p2 -> p2 == INPUTS197[2] }) >> RETURNED197
				1 * makeX({ p0 -> p0 == INPUTS198[0] }, { p1 -> p1 == INPUTS198[1] }, { p2 -> p2 == INPUTS198[2] }) >> RETURNED198
			}
			subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl) {
				1 * doServiceC({ p0 -> p0 == INPUTS207[0] }) >> RETURNED207
				1 * doServiceC({ p0 -> p0 == INPUTS208[0] }) >> RETURNED208
			}
		when:
			def ret = subject.hello(*INPUTS165)
		then:
			ret == RETURNED165
	}
	
	
	static final def INPUTS190 = [
			't2',
			'x',
			2
	]
	static final def INPUTS180 = [
			't2',
			'x',
			5
	]
	static final def INPUTS170 = [
			't2',
			'x',
			3
	]
	static final def INPUTS181 = [
			't2',
			'x',
			4
	]
	static final def INPUTS171 = [
			't2',
			'x',
			3
	]
	static final def INPUTS182 = [
			't2',
			'x',
			9
	]
	static final def INPUTS193 = [
			't2',
			'x',
			8
	]
	static final def INPUTS172 = [
			't2',
			'x',
			2
	]
	static final def INPUTS194 = [
			't2',
			'x',
			1
	]
	static final def INPUTS184 = [
			't2',
			'x',
			5
	]
	static final def INPUTS197 = [
			't2',
			'x',
			7
	]
	static final def INPUTS165 = [
			't2',
			12,
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
	static final def INPUTS198 = [
			't2',
			'x',
			9
	]
	static final def INPUTS188 = [
			't2',
			'x',
			1
	]
	static final def INPUTS167 = [
			't2',
			'x',
			6
	]
	static final def INPUTS178 = [
			't2',
			'x',
			4
	]
	static final def INPUTS189 = [
			't2',
			'x',
			7
	]
	static final def INPUTS168 = [
			't2',
			'x',
			8
	]
	static final def INPUTS169 = [
			't2',
			'x',
			6
	]
	static final def INPUTS203 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS204 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def INPUTS207 = [
			12
	]
	static final def INPUTS208 = [
			12
	]
	
	static final def OUTPUTS190 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS180 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS170 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS181 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS171 = [
			't2',
			'x',
			3
	]
	static final def OUTPUTS182 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS193 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS172 = [
			't2',
			'x',
			2
	]
	static final def OUTPUTS194 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS184 = [
			't2',
			'x',
			5
	]
	static final def OUTPUTS197 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS165 = [
			't2',
			12,
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
	static final def OUTPUTS198 = [
			't2',
			'x',
			9
	]
	static final def OUTPUTS188 = [
			't2',
			'x',
			1
	]
	static final def OUTPUTS167 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS178 = [
			't2',
			'x',
			4
	]
	static final def OUTPUTS189 = [
			't2',
			'x',
			7
	]
	static final def OUTPUTS168 = [
			't2',
			'x',
			8
	]
	static final def OUTPUTS169 = [
			't2',
			'x',
			6
	]
	static final def OUTPUTS203 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS204 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	static final def OUTPUTS207 = [
			12
	]
	static final def OUTPUTS208 = [
			12
	]
	
	static final def RETURNED190 = [
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
	
	static final def RETURNED180 = [
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
	
	static final def RETURNED170 = [
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
	
	static final def RETURNED181 = [
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
	
	static final def RETURNED171 = [
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
	
	static final def RETURNED182 = [
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
	
	static final def RETURNED193 = [
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
	
	static final def RETURNED172 = [
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
	
	static final def RETURNED194 = [
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
	
	static final def RETURNED184 = [
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
	
	static final def RETURNED197 = [
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
	
	static final def RETURNED165 = [
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
			fromServiceC: 144,
	] as com.etz.replay.unit.targets.ServiceData
	
	static final def RETURNED198 = [
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
	
	static final def RETURNED188 = [
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
	
	static final def RETURNED167 = [
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
	
	static final def RETURNED178 = [
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
	
	static final def RETURNED189 = [
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
	
	static final def RETURNED168 = [
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
	
	static final def RETURNED169 = [
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
	
	static final def RETURNED203 = 'null<>null'
	
	static final def RETURNED204 = 'null<>null'
	
	static final def RETURNED207 = 144
	
	static final def RETURNED208 = 144
	
	
}
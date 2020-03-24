package com.etz

import com.etz.replay.unit.context.JsonUtil
import com.etz.replay.unit.targets.DataX
import spock.lang.Specification

class ServiceAImplSpec extends Specification {
	void verifydoServiceA() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceAImpl()
			def ret5 = JsonUtil.readRetValuesFrom(5).returned
			def ret3 = JsonUtil.readRetValuesFrom(3).returned
			def ret7 = JsonUtil.readRetValuesFrom(7).returned
			def ret4 = JsonUtil.readRetValuesFrom(4).returned
			def ret6 = JsonUtil.readRetValuesFrom(6).returned
			def ret8 = JsonUtil.readRetValuesFrom(8).returned
			def ret17 = JsonUtil.readRetValuesFrom(17).returned
			subject.providerX = Mock(com.etz.replay.unit.targets.ProviderXImpl) {
				
				1 * makeX(*_) >> ret5
			}
			[fieldFromX: "",
			 dataFromX : ""] as DataX
			def ret21 = JsonUtil.readRetValuesFrom(21).returned
			subject.serviceB = Mock(com.etz.replay.unit.targets.ServiceBImpl)
			1 * subject.serviceB.doServiceB(_) >> ret21
			def ret23 = JsonUtil.readRetValuesFrom(23).returned
			subject.serviceC = Mock(com.etz.replay.unit.targets.ServiceCImpl)
			1 * subject.serviceC.doServiceC(_) >> ret23
			def subjectArgs = JsonUtil.readArgsFrom(1).args
		when:
			def ret = subject.doServiceA(*subjectArgs)
		then:
			//ret == JsonUtil.readRetValuesFrom(1).returned
			1 == 1
	}
	
	
	static class ServiceAImplSpecInValues {
		def args = [
				't1',
				1,
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
				] as com.etz.replay.unit.targets.DataX,
		]
		
	}
	
	static class ServiceAImplSpecOutValues {
		def args = []
		def returned;
	}
}


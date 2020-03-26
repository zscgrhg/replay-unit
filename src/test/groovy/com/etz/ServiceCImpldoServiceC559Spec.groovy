package com.etz.pkg20200326213328

import spock.lang.Specification

class ServiceCImpldoServiceC559Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS559)
		then:
			ret == RETURNED559
	}
	
	
	static final def INPUTS559 = [
			5
	]
	
	static final def OUTPUTS559 = [
			5
	]
	
	static final def RETURNED559 = 25
	
	
}
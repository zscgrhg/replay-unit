package com.etz

import spock.lang.Specification

class ServiceCImpldoServiceC45Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS45)
		then:
			ret == RETURNED45
	}
	
	
	static final def INPUTS45 = [
			1
	]
	
	static final def OUTPUTS45 = [
			1
	]
	
	static final def RETURNED45 = 1
	
	
}
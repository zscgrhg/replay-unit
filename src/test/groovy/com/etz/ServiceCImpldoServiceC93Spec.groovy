package com.etz.pkg20200326213328

import spock.lang.Specification

class ServiceCImpldoServiceC93Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS93)
		then:
			ret == RETURNED93
	}
	
	
	static final def INPUTS93 = [
			13
	]
	
	static final def OUTPUTS93 = [
			13
	]
	
	static final def RETURNED93 = 169
	
	
}
package com.etz.pkg20200326213328

import spock.lang.Specification

class ServiceCImpldoServiceC205Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS205)
		then:
			ret == RETURNED205
	}
	
	
	static final def INPUTS205 = [
			13
	]
	
	static final def OUTPUTS205 = [
			13
	]
	
	static final def RETURNED205 = 169
	
	
}
package com.etz.pkg20200326213328

import spock.lang.Specification

class ServiceCImpldoServiceC489Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS489)
		then:
			ret == RETURNED489
	}
	
	
	static final def INPUTS489 = [
			12
	]
	
	static final def OUTPUTS489 = [
			12
	]
	
	static final def RETURNED489 = 144
	
	
}
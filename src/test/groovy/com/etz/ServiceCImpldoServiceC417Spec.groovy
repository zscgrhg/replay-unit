package com.etz

import spock.lang.Specification

class ServiceCImpldoServiceC417Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS417)
		then:
			ret == RETURNED417
	}
	
	
	static final def INPUTS417 = [
			2
	]
	
	static final def OUTPUTS417 = [
			2
	]
	
	static final def RETURNED417 = 4
	
	
}
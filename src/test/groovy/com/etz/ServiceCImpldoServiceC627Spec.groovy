package com.etz

import spock.lang.Specification

class ServiceCImpldoServiceC627Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS627)
		then:
			ret == RETURNED627
	}
	
	
	static final def INPUTS627 = [
			2
	]
	
	static final def OUTPUTS627 = [
			2
	]
	
	static final def RETURNED627 = 4
	
	
}
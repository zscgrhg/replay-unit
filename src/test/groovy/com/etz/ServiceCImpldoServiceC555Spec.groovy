package com.etz

import spock.lang.Specification

class ServiceCImpldoServiceC555Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS555)
		then:
			ret == RETURNED555
	}
	
	
	static final def INPUTS555 = [
			2
	]
	
	static final def OUTPUTS555 = [
			2
	]
	
	static final def RETURNED555 = 4
	
	
}
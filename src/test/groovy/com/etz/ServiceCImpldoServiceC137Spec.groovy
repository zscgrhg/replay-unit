package com.etz

import spock.lang.Specification

class ServiceCImpldoServiceC137Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS137)
		then:
			ret == RETURNED137
	}
	
	
	static final def INPUTS137 = [
			2
	]
	
	static final def OUTPUTS137 = [
			2
	]
	
	static final def RETURNED137 = 4
	
	
}
package com.etz

import spock.lang.Specification

class ServiceCImpldoServiceC138Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS138)
		then:
			ret == RETURNED138
	}
	
	
	static final def INPUTS138 = [
			2
	]
	
	static final def OUTPUTS138 = [
			2
	]
	
	static final def RETURNED138 = 4
	
	
}
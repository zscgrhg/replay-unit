package com.etz

import spock.lang.Specification

class ServiceCImpldoServiceC345Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS345)
		then:
			ret == RETURNED345
	}
	
	
	static final def INPUTS345 = [
			2
	]
	
	static final def OUTPUTS345 = [
			2
	]
	
	static final def RETURNED345 = 4
	
	
}
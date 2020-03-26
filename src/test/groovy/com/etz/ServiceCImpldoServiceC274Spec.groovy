package com.etz.pkg20200326213211

import spock.lang.Specification

class ServiceCImpldoServiceC274Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS274)
		then:
			ret == RETURNED274
	}
	
	
	static final def INPUTS274 = [
			2
	]
	
	static final def OUTPUTS274 = [
			2
	]
	
	static final def RETURNED274 = 4
	
	
}
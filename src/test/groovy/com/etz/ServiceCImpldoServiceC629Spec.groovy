package com.etz.pkg20200326213328

import spock.lang.Specification

class ServiceCImpldoServiceC629Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS629)
		then:
			ret == RETURNED629
	}
	
	
	static final def INPUTS629 = [
			9
	]
	
	static final def OUTPUTS629 = [
			9
	]
	
	static final def RETURNED629 = 81
	
	
}
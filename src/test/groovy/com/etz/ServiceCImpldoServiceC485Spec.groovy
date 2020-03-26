package com.etz

import spock.lang.Specification

class ServiceCImpldoServiceC485Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS485)
		then:
			ret == RETURNED485
	}
	
	
	static final def INPUTS485 = [
			2
	]
	
	static final def OUTPUTS485 = [
			2
	]
	
	static final def RETURNED485 = 4
	
	
}
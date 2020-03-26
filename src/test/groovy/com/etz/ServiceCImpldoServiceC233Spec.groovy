package com.etz.pkg20200326213328

import spock.lang.Specification

class ServiceCImpldoServiceC233Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS233)
		then:
			ret == RETURNED233
	}
	
	
	static final def INPUTS233 = [
			4
	]
	
	static final def OUTPUTS233 = [
			4
	]
	
	static final def RETURNED233 = 16
	
	
}
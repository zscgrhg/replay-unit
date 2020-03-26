package com.etz.pkg20200326230732

import spock.lang.Specification

class ServiceCImpldoServiceC513Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS513)
		then:
			ret == RETURNED513
	}
	
	
	static final def INPUTS513 = [
			2
	]
	
	static final def OUTPUTS513 = [
			2
	]
	
	static final def RETURNED513 = 4
	
	
}
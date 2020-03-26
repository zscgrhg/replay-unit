package com.etz.pkg20200326230449

import spock.lang.Specification

class ServiceCImpldoServiceC136Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS136)
		then:
			ret == RETURNED136
	}
	
	
	static final def INPUTS136 = [
			3
	]
	
	static final def OUTPUTS136 = [
			3
	]
	
	static final def RETURNED136 = 9
	
	
}
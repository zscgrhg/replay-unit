package com.etz.pkg20200326230732

import spock.lang.Specification

class ServiceCImpldoServiceC303Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS303)
		then:
			ret == RETURNED303
	}
	
	
	static final def INPUTS303 = [
			4
	]
	
	static final def OUTPUTS303 = [
			4
	]
	
	static final def RETURNED303 = 16
	
	
}
package com.etz.pkg20200326230732

import spock.lang.Specification

class ServiceCImpldoServiceC206Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS206)
		then:
			ret == RETURNED206
	}
	
	
	static final def INPUTS206 = [
			0
	]
	
	static final def OUTPUTS206 = [
			0
	]
	
	static final def RETURNED206 = 0
	
	
}
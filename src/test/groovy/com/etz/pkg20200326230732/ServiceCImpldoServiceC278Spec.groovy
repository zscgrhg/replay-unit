package com.etz.pkg20200326230732

import spock.lang.Specification

class ServiceCImpldoServiceC278Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS278)
		then:
			ret == RETURNED278
	}
	
	
	static final def INPUTS278 = [
			18
	]
	
	static final def OUTPUTS278 = [
			18
	]
	
	static final def RETURNED278 = 324
	
	
}
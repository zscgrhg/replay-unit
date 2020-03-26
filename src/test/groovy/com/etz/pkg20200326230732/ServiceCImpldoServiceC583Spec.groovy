package com.etz.pkg20200326230732

import spock.lang.Specification

class ServiceCImpldoServiceC583Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS583)
		then:
			ret == RETURNED583
	}
	
	
	static final def INPUTS583 = [
			10
	]
	
	static final def OUTPUTS583 = [
			10
	]
	
	static final def RETURNED583 = 100
	
	
}
package com.etz.pkg20200326230732

import spock.lang.Specification

class ServiceCImpldoServiceC416Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS416)
		then:
			ret == RETURNED416
	}
	
	
	static final def INPUTS416 = [
			14
	]
	
	static final def OUTPUTS416 = [
			14
	]
	
	static final def RETURNED416 = 196
	
	
}
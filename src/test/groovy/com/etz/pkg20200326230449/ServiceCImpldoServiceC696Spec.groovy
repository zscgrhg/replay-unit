package com.etz.pkg20200326230450

import spock.lang.Specification

class ServiceCImpldoServiceC696Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS696)
		then:
			ret == RETURNED696
	}
	
	
	static final def INPUTS696 = [
			1
	]
	
	static final def OUTPUTS696 = [
			1
	]
	
	static final def RETURNED696 = 1
	
	
}
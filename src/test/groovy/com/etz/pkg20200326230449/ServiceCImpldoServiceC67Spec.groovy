package com.etz.pkg20200326230450

import spock.lang.Specification

class ServiceCImpldoServiceC67Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS67)
		then:
			ret == RETURNED67
	}
	
	
	static final def INPUTS67 = [
			4
	]
	
	static final def OUTPUTS67 = [
			4
	]
	
	static final def RETURNED67 = 16
	
	
}
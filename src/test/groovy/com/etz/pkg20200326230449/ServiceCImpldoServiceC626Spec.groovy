package com.etz.pkg20200326230450

import spock.lang.Specification

class ServiceCImpldoServiceC626Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS626)
		then:
			ret == RETURNED626
	}
	
	
	static final def INPUTS626 = [
			7
	]
	
	static final def OUTPUTS626 = [
			7
	]
	
	static final def RETURNED626 = 49
	
	
}
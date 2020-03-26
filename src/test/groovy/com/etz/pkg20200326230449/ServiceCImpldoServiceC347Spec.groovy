package com.etz.pkg20200326230449

import spock.lang.Specification

class ServiceCImpldoServiceC347Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS347)
		then:
			ret == RETURNED347
	}
	
	
	static final def INPUTS347 = [
			4
	]
	
	static final def OUTPUTS347 = [
			4
	]
	
	static final def RETURNED347 = 16
	
	
}
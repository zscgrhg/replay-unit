package com.etz.pkg20200326230732

import spock.lang.Specification

class ServiceCImpldoServiceC559Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS559)
		then:
			ret == RETURNED559
	}
	
	
	static final def INPUTS559 = [
			19
	]
	
	static final def OUTPUTS559 = [
			19
	]
	
	static final def RETURNED559 = 361
	
	
}
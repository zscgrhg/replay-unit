package com.etz.pkg20200326230449

import spock.lang.Specification

class ServiceCImpldoServiceC488Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS488)
		then:
			ret == RETURNED488
	}
	
	
	static final def INPUTS488 = [
			10
	]
	
	static final def OUTPUTS488 = [
			10
	]
	
	static final def RETURNED488 = 100
	
	
}
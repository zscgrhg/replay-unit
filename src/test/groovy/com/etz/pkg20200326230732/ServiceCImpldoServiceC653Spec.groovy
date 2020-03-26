package com.etz.pkg20200326230733

import spock.lang.Specification

class ServiceCImpldoServiceC653Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS653)
		then:
			ret == RETURNED653
	}
	
	
	static final def INPUTS653 = [
			0
	]
	
	static final def OUTPUTS653 = [
			0
	]
	
	static final def RETURNED653 = 0
	
	
}
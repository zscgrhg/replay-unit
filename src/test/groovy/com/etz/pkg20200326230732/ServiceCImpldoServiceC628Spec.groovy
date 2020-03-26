package com.etz.pkg20200326230733

import spock.lang.Specification

class ServiceCImpldoServiceC628Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS628)
		then:
			ret == RETURNED628
	}
	
	
	static final def INPUTS628 = [
			3
	]
	
	static final def OUTPUTS628 = [
			3
	]
	
	static final def RETURNED628 = 9
	
	
}
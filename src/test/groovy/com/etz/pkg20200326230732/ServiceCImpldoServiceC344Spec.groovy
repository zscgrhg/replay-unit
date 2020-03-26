package com.etz.pkg20200326230732

import spock.lang.Specification

class ServiceCImpldoServiceC344Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS344)
		then:
			ret == RETURNED344
	}
	
	
	static final def INPUTS344 = [
			7
	]
	
	static final def OUTPUTS344 = [
			7
	]
	
	static final def RETURNED344 = 49
	
	
}
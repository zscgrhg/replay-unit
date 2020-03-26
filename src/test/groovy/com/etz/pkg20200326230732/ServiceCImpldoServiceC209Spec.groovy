package com.etz.pkg20200326230732

import spock.lang.Specification

class ServiceCImpldoServiceC209Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS209)
		then:
			ret == RETURNED209
	}
	
	
	static final def INPUTS209 = [
			0
	]
	
	static final def OUTPUTS209 = [
			0
	]
	
	static final def RETURNED209 = 0
	
	
}
package com.etz.pkg20200326230732

import spock.lang.Specification

class ServiceCImpldoServiceC163Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS163)
		then:
			ret == RETURNED163
	}
	
	
	static final def INPUTS163 = [
			6
	]
	
	static final def OUTPUTS163 = [
			6
	]
	
	static final def RETURNED163 = 36
	
	
}
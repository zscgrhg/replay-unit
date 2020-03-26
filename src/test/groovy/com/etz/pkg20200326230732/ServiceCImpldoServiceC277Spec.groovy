package com.etz.pkg20200326230732

import spock.lang.Specification

class ServiceCImpldoServiceC277Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS277)
		then:
			ret == RETURNED277
	}
	
	
	static final def INPUTS277 = [
			18
	]
	
	static final def OUTPUTS277 = [
			18
	]
	
	static final def RETURNED277 = 324
	
	
}
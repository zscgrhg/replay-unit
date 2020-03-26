package com.etz.pkg20200326230732

import spock.lang.Specification

class ServiceCImpldoServiceC373Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS373)
		then:
			ret == RETURNED373
	}
	
	
	static final def INPUTS373 = [
			18
	]
	
	static final def OUTPUTS373 = [
			18
	]
	
	static final def RETURNED373 = 324
	
	
}
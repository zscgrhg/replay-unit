package com.etz.pkg20200326230449

import spock.lang.Specification

class ServiceCImpldoServiceC348Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS348)
		then:
			ret == RETURNED348
	}
	
	
	static final def INPUTS348 = [
			4
	]
	
	static final def OUTPUTS348 = [
			4
	]
	
	static final def RETURNED348 = 16
	
	
}
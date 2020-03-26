package com.etz.pkg20200326230449

import spock.lang.Specification

class ServiceCImpldoServiceC207Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS207)
		then:
			ret == RETURNED207
	}
	
	
	static final def INPUTS207 = [
			12
	]
	
	static final def OUTPUTS207 = [
			12
	]
	
	static final def RETURNED207 = 144
	
	
}
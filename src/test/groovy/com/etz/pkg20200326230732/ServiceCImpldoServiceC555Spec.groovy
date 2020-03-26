package com.etz.pkg20200326230732

import spock.lang.Specification

class ServiceCImpldoServiceC555Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS555)
		then:
			ret == RETURNED555
	}
	
	
	static final def INPUTS555 = [
			19
	]
	
	static final def OUTPUTS555 = [
			19
	]
	
	static final def RETURNED555 = 361
	
	
}
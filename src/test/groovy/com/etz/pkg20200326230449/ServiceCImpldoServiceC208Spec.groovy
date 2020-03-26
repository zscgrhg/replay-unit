package com.etz.pkg20200326230449

import spock.lang.Specification

class ServiceCImpldoServiceC208Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS208)
		then:
			ret == RETURNED208
	}
	
	
	static final def INPUTS208 = [
			12
	]
	
	static final def OUTPUTS208 = [
			12
	]
	
	static final def RETURNED208 = 144
	
	
}
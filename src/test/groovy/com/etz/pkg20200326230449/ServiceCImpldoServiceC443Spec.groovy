package com.etz.pkg20200326230449

import spock.lang.Specification

class ServiceCImpldoServiceC443Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS443)
		then:
			ret == RETURNED443
	}
	
	
	static final def INPUTS443 = [
			10
	]
	
	static final def OUTPUTS443 = [
			10
	]
	
	static final def RETURNED443 = 100
	
	
}
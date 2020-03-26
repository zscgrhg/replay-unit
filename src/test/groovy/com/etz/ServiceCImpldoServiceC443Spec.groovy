package com.etz.pkg20200326213328

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
			11
	]
	
	static final def OUTPUTS443 = [
			11
	]
	
	static final def RETURNED443 = 121
	
	
}
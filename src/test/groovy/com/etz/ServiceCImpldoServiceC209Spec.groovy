package com.etz.pkg20200326213328

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
			13
	]
	
	static final def OUTPUTS209 = [
			13
	]
	
	static final def RETURNED209 = 169
	
	
}
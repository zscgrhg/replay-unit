package com.etz.pkg20200326213115

import spock.lang.Specification

class ServiceCImpldoServiceC66Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS66)
		then:
			ret == RETURNED66
	}
	
	
	static final def INPUTS66 = [
			2
	]
	
	static final def OUTPUTS66 = [
			2
	]
	
	static final def RETURNED66 = 4
	
	
}
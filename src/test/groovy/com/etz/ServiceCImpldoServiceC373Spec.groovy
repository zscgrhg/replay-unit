package com.etz.pkg20200326213328

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
			7
	]
	
	static final def OUTPUTS373 = [
			7
	]
	
	static final def RETURNED373 = 49
	
	
}
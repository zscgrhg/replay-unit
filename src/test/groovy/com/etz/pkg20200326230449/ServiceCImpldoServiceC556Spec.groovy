package com.etz.pkg20200326230449

import spock.lang.Specification

class ServiceCImpldoServiceC556Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS556)
		then:
			ret == RETURNED556
	}
	
	
	static final def INPUTS556 = [
			1
	]
	
	static final def OUTPUTS556 = [
			1
	]
	
	static final def RETURNED556 = 1
	
	
}
package com.etz.pkg20200326230449

import spock.lang.Specification

class ServiceCImpldoServiceC414Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS414)
		then:
			ret == RETURNED414
	}
	
	
	static final def INPUTS414 = [
			19
	]
	
	static final def OUTPUTS414 = [
			19
	]
	
	static final def RETURNED414 = 361
	
	
}
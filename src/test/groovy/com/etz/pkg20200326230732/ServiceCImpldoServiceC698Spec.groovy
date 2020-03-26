package com.etz.pkg20200326230733

import spock.lang.Specification

class ServiceCImpldoServiceC698Spec extends Specification {
	void verifydoServiceC() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceCImpl()
		when:
			def ret = subject.doServiceC(*INPUTS698)
		then:
			ret == RETURNED698
	}
	
	
	static final def INPUTS698 = [
			5
	]
	
	static final def OUTPUTS698 = [
			5
	]
	
	static final def RETURNED698 = 25
	
	
}
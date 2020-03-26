package com.etz.pkg20200326230732

import spock.lang.Specification

class ServiceBImpldoServiceB347Spec extends Specification {
	void verifydoServiceB() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceBImpl()
		when:
			def ret = subject.doServiceB(*INPUTS347)
		then:
			ret == RETURNED347
	}
	
	
	static final def INPUTS347 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	
	static final def OUTPUTS347 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	
	static final def RETURNED347 = 'null<>null'
	
	
}
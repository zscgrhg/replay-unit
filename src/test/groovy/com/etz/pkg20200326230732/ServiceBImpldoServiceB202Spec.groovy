package com.etz.pkg20200326230732

import spock.lang.Specification

class ServiceBImpldoServiceB202Spec extends Specification {
	void verifydoServiceB() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceBImpl()
		when:
			def ret = subject.doServiceB(*INPUTS202)
		then:
			ret == RETURNED202
	}
	
	
	static final def INPUTS202 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	
	static final def OUTPUTS202 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	
	static final def RETURNED202 = 'null<>null'
	
	
}
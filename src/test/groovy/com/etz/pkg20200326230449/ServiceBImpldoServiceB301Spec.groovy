package com.etz.pkg20200326230449

import spock.lang.Specification

class ServiceBImpldoServiceB301Spec extends Specification {
	void verifydoServiceB() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceBImpl()
		when:
			def ret = subject.doServiceB(*INPUTS301)
		then:
			ret == RETURNED301
	}
	
	
	static final def INPUTS301 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	
	static final def OUTPUTS301 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	
	static final def RETURNED301 = 'null<>null'
	
	
}
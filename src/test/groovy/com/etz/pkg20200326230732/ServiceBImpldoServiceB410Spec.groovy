package com.etz.pkg20200326230732

import spock.lang.Specification

class ServiceBImpldoServiceB410Spec extends Specification {
	void verifydoServiceB() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceBImpl()
		when:
			def ret = subject.doServiceB(*INPUTS410)
		then:
			ret == RETURNED410
	}
	
	
	static final def INPUTS410 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	
	static final def OUTPUTS410 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	
	static final def RETURNED410 = 'null<>null'
	
	
}
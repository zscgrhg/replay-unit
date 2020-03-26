package com.etz.pkg20200326230733

import spock.lang.Specification

class ServiceBImpldoServiceB624Spec extends Specification {
	void verifydoServiceB() {
		given:
			def subject = new com.etz.replay.unit.targets.ServiceBImpl()
		when:
			def ret = subject.doServiceB(*INPUTS624)
		then:
			ret == RETURNED624
	}
	
	
	static final def INPUTS624 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	
	static final def OUTPUTS624 = [
			[
					fieldFromX: null,
					dataFromX : null,
					dataY     : null,
			] as com.etz.replay.unit.targets.DataX
	]
	
	static final def RETURNED624 = 'null<>null'
	
	
}
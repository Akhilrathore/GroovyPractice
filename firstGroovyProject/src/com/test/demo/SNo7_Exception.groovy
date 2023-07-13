package com.test.demo

import java.lang.runtime.SwitchBootstraps

import org.apache.groovy.parser.antlr4.GroovyParser.FinallyBlockContext

import groovy.transform.Final

//Groovy script not require 'class'

try {
	print 1/0
}
catch (Exception exp) {
	/*(Exception ) is use to get all exceptions, currently not run because Arithmetic Exception is handle in another catch
	 Note: program search related exception if correct exception it will execute it or looking for general exception otherwise system will handle it.
	 */
	println '------exception >>> ------ \n '+exp
	println '------Cause >>> ------ \n '+exp.getCause()
	println '------Complete  Message >>> ------ \n '+exp.getMessage()
}

/* 1/0 is Arithmetic exception */
catch (ArithmeticException ar_exp) {
	println '------from ArithmeticExceptio catch >>> ------ \n '
	println '------exception >>> ------ \n '+ar_exp
}
finally {
	println '------------finally block------------ \n 1. Run at everytime.\n 2. Can be use without catch block'
}
package com.test.demo

import java.lang.runtime.SwitchBootstraps

import org.apache.groovy.parser.antlr4.GroovyParser.FinallyBlockContext

import groovy.transform.Final

//Groovy script not require 'class'
println('Hello World - Single Quote');
println("Hello World - Double Quote");
println 'Hello World - Single Quote, without parenthesis';
println'Hello World - No Semicolon'
println '------------'
def name ="Akhil"
println 'My name is '+name
println 'My name is $name'
println 'My name is ${name}'

println "My name is "+name
println "My name is $name"
println "My name is ${name}"
println "Concat name ".concat(name)

def str1 ='''This is triple 
 single quota '''
println str1

def str2 ="""tTis is triple 
double quota """
println str2


def str="This is test STRING"
println "lenght: "+str.length()

println 'print index position '+str[9]

println 'print multiple index position '+str[2,6,11,16	]
println 'print index position -ve '+str[-9]
println "Index of letter 'i' "+ str.indexOf('i')
println 'print substring  after given index '+str.substring(3)
println 'print substring  bewteen '+str.substring(3,8)
println 'partial print from given index'+str[6..12]


println 'split string and give list >>> '+str.split(" ")

println 'remove from string '+str-("test")

println 'replace string '+str.replace("test","final")

println "upper case "+str.toUpperCase()
println "lower case "+str.toLowerCase()
println "in list "+str.toList()

println name*3

println'groovy is case senstive '+name.equals("Akhil")
println'groovy string check '+name.equalsIgnoreCase("Akhil")

def s1=/new stri
ng/
def s2=$/new 
string/$
def s3=/new string
	 $name/
def s4=$/new 
	string $name/$

def s5="My name is \"Akhil\""
def s6	="My name is /"Akhil/""
println s1
println s2
println s3
println s4
println s5
println s6
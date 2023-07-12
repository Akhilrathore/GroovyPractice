package com.test.demo

//Groovy script not require 'class'
//class Variables { }

def name="Akhil";
def Name='Rathore'

println 'My name is '+name+' '+Name
println 'My name is ${name} ${Name}'
println "My name is ${name} $Name"

//Groovy case-sensitive
def a=10
def A=99
println a
println A
//reassign not allow
//def a=9 

//Groovy dynamically typed (can change variable at run-time 
name =51
println name

//multiple value assign
def (b,c,d)=[9,45,67]
println b
println c
println d

//multiple value assign with datatype
def (String l,int m, float n)=[78,12,96]
println l
println m
println n

//Null value if any variable is not set value in multiple value assign
def (String x,int y, z )=[78,12]
println x
println y
println z


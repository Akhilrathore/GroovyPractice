package com.test.demo

import java.awt.geom.Arc2D.Double
import java.awt.geom.Arc2D.Float

import groovy.util.function.DoubleComparator

//Groovy script not require 'class'
//class Datatype { }

byte b=10
println "byte ${b}"
println b.class
println(Byte.MIN_VALUE +" to "+ Byte.MAX_VALUE)
println "----------------------------------------"

short s=20
println "short ${s}"
println(Short.MIN_VALUE +" to "+ Short.MAX_VALUE)
println "----------------------------------------"

int i=30
println "int ${i}"
println(Integer.MIN_VALUE +" to "+ Integer.MAX_VALUE)
println "----------------------------------------"

long l=40L
long l1=40
println "long l=${l}, l1=${l1}"
println(Long.MIN_VALUE +" to "+ Long.MAX_VALUE)
println "----------------------------------------"


float f=50
float f1=502F
float f2=50.2F
println "float f=${f}, f1=${f1}, f2=${f2}"

println "----------------------------------------"


double d=60
double d1=60.00001
println "double d=${d}, d1=${d1}"

println "----------------------------------------"

char c='$'
println "char ${c}"

println "----------------------------------------"

boolean flag=true
println("boolean ${flag}")
println(Boolean.isPrimitive())
println "----------------------------------------"

String str="asdf"
println str
println "----------------------------------------"

println "Type Casting >>>"
def cast=(float)80
println "Cast ${cast}"
println cast.getClass().getName();
println "----------------------------------------"

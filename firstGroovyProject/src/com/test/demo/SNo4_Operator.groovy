package com.test.demo


//Groovy script not require 'class'
//class Datatype { }
//<<<<<<<<<<<<<<<<<Arithmetic operators>>>>>>>>>>>>>>>>>
//if in 'assert' LHS!=RHS then error will print else nothing
assert  1  + 2 == 3
assert  4  - 3 == 1
assert  3  * 5 == 15
assert  3  / 2 == 1.5
assert 10  % 3 == 1
assert  2 ** 3 == 8

//int x=9/4 and if x==1  >>> int c = a / b; in Java
assert 9.intdiv(4)==2
//>>>>>>>>>>>>>>>>>>>Arithmetic operators<<<<<<<<<<<<<<<<<<<<
println '----------------------------'
def a=10, b=5
// <<<<<<<<<<<<<<<<<<<Unary operators>>>>>>>>>>>>>>>>
print 'a += 3 ans:'
println a += 3
assert a == 13

print 'b -= 3 ans:'
println b -= 3

print 'a *= 3 ans:'
println a *= 3

print 'a /= 2 ans:'
println a /= 2

print 'a %= 3 ans:'
println a %= 3

print 'b**2 ans:'
println b **= 2


// >>>>>>>>>>>>>>>>Unary operators<<<<<<<<<<<<<<<<<<<
println '----------------------------'
//if(12+3==15)
assert 1.plus(3)==4



//because 'plus' $var error
//println "Plus "+ $x.plus($b)
def x=25, y=12
println "Plus: "+ x.plus(y) + ' and ' + x.and(y)

println 'Minus: '+ x.minus(y)
println 'Multiply: '+x.multiply(y) + ' or ' + x.or(y)
println "Div: " +x.div(y)
println 'Power: '+ x.power(y)

println '----------------------------'
//println //  println without argument generate error

println "++X: "+ x.next()
println "--Y: "+ y.previous()

println '----------------------------'
// Increment/Decrement Pre and Post
def m =8, n=4
println "value of m: "+ m

println 'Pre-increment m: '+ ++m
println "after Pre-increment value of m: "+ m

println 'Post-increment n: '+ n++
println "after Post-increment value of n: "+ n

println '----------------------------'
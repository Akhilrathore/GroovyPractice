package com.test.demo

import java.lang.runtime.SwitchBootstraps

//Groovy script not require 'class'

for(def i=0; i<=5;i++) println "${i}"

print '----------------------------------------'
for(int j=20; j<=25;j++) println j
print '----------------------------------------'
for(k in  50..55) {
	println (k)
}
print 'us ing list----------------------------------------'
//using list
for(n in [2, 5, 6d, 8f, 7, 1, 4]) println n
print '----------------------------------------'

10.upto(15) {println("${it}")  }
print '----------------------------------------'
7.times {println "${it}"  }
print '----------------------------------------'
1.step(9, 2) { println "${it}" }

print 'by array----------------------------------------'
def array=(30..35).toArray();
for(m in array ) println m
print 'key:value pair----------------------------------------'
def map =["state":"m.p.","city":"indore","colony":"lv"]
for (x in map) {
	println x
	println 'key>>> ' +x.key
	println 'key>>> ' +x.value
}
print 'sting to text----------------------------------------'
def txt="akhil"
def list=[]
for (z in txt) {
	list.add(z)
	println z	
//	assert list==["a", "k", "h", "i", "l"]
}
print '----------------------------------------'
def d = 5

while ( d-- > 0 ) {
	println d
}


print '----------------------------------------'
def count = 5
def fact = 1
while(count > 1) {
    fact *= count--
} 
//assert fact == 120
print 'factorial: '+ fact
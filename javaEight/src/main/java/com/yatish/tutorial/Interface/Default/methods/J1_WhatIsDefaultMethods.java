package com.yatish.tutorial.Interface.Default.methods;

/*
 * Before Java 8, in interfaces, we can only declare the methods, we cannot write the definition of the method in it. But in Java 8, we can write the definition of the method in interface.
 * NOTE: if we are writing the definition of the method in the interface, then that should be either a default method or a static method. we cannot write definition for a non-static or
 * 			non-default method in the interface.
 * 
 * What is default method?
 * Default method is nothing but a method with 'default' keyword......
 * 
 * doesn't adding new 'default' method to interface affect the existing codes running in java 7, when companies decide to run them on java 8?
 * Not at all!!! do you think java guys are so dumb!!! hahaha
 * when we add a new 'default method' in the existing interfaces, that method definition will be inherited to the implementing child class. hence the classes which have implemented this
 * interface need to be touched at all to write the definition of the newly added 'default method'. hence there is a backward compatibility provided by java 8. hence no issues at all.
 */
public class J1_WhatIsDefaultMethods {

	public static void main(String[] args) {
		B obj = new B();
		obj.method1();
		obj.method2();
	}
}

interface A { 
	
	void method1();
	
	/*
	 * default 
	 */
	default public void method2() {
		System.out.println("Method2 executed with implementation defined in interface.");
		method1();
	}
}

class B implements A{
	
	public void method1() {
		System.out.println("Method1 executed with implementation defined implemented class B");
	}
}

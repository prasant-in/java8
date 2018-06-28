package com.yatish.tutorial.Interface.Static.methods;

public class J1_Static_Methods {
	
	public static void main(String[] args) {
		a.m1(); // we can directly access static methods by using interface name like how we do access static methods in class.
	}
}

/*
 * In java 8, we can use static methods in an interface but we have to provide the definition in the interface itself otherwise it will give error.
 */
interface a {
	
	public static void m1() {};
}

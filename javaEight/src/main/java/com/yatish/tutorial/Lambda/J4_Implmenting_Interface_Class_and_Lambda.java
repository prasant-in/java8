package com.yatish.tutorial.Lambda;

public class J4_Implmenting_Interface_Class_and_Lambda {

	public static void main(String[] args) {
		
		/*
		 * The interface 'def' implementation is done using lambda expression here.
		 */
		def fff123 = () -> System.out.println("lambda exp1");System.out.println("lambda exp2");
		fff123.m1();	//This will print the implementation present in lambda expression
		
		/*
		 * The interface 'def' implementation is done using class B.
		 */
		B obj = new B();
		obj.m1();	//This will print the implementation present in class 'B'
	}

}


interface def {
	void m1();
}

class B  implements def{
	
	public void m1() {
		System.out.println("Printing the message from implementation in class B");
	}
}
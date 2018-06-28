package com.yatish.tutorial.Lambda;

public class J14_this_Reference_In_Lambda {

	String label = "outside scope variable";
	
	public void m1() {
		/*
		 * In Lambda expression. 'this' will refer to the enclosing outer scope object. In this case, this will refer to the current 'J14_this_Reference_In_Lambda' object. we are accessing 'label'
		 * property of 'J14_this_Reference_In_Lambda' object using 'this'
		 * 
		 * NOTE: this is generic to java not only for lambda, if you use 'this' inside a static method, then java compiler will throw an error as the static method is not specific to an object so 
		 * 		'this' in static method is invalid.
		 */
		M mmm123 = () -> {System.out.println(this.label);};
		mmm123.m();
	}
	
	public static void main(String[] args) {
		J14_this_Reference_In_Lambda obj = new J14_this_Reference_In_Lambda();
		obj.m1();
	}

}

interface M {
	void m();
}
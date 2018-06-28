package com.yatish.tutorial.Lambda;

public class J7_Lambda_Parameter_Return_Type {

	/*
	 * the lambda expression parameter and the return type should match with the method present in the interface which we are using for variable type.
	 */
	public static void main(String[] args) {
		/*
		 * We are using interface 'E' as the variable type. in interface 'E', the method 'm1()' is returning a String but the lambda expression is not returning a string. Hence there is
		 * an error.
		 * 
		 */
		E eee123 = () -> System.out.println("lambda exp1");System.out.println("lambda exp2");
		eee123.m1();

		/*
		 * We are using interface 'F' as the variable type. in interface 'F' the method, expects a string parameter. But in the lambda expression in below code we are not specifying any
		 * parameter in '()'. hence java 8 compiler is showing error. it should have been '(String s)'
		 */
		F fff123 = () -> "";System.out.println("ddd");
		fff123.m2();
		
		
		/*
		 * We know that for the correct lambda expression for above one for interface 'F' is as follows,
		 * F fff123 = (String s) -> "";System.out.println("ddd");
		 * 
		 * But lambda expressions can be still more reduced. the above correct lambda expression can be reduced by replacing '(String s)' with 's' can also be written as the following 
		 * code.
		 * NOTE: if the return type of the Functional interface method is void. then this shortcut doesnt work we have to specify '()' mandatorily.
		 */
		F f123 = s -> "";System.out.println("ddd");
		f123.m2("yatish");
		
	}

}

interface E {
	String m1();
}

interface F {
	String m2(String s);
}



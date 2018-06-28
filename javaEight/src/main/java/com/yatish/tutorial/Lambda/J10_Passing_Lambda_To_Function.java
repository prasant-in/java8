package com.yatish.tutorial.Lambda;

public class J10_Passing_Lambda_To_Function {

	public static void main(String[] args) {
		
		/*
		 * We can pass lambda expressions as an argument to a function. The parameter of the function should be the Functional interface of the lambda expression. 
		 * 
		 * In following case, we are sending the lambda expression 's -> System.out.println(s)' as argument to the function 'ExecuteLambdaExpression(J jjj123)'.
		 */
		ExecuteLambdaExpression(s -> System.out.println(s));
	}
	
	/*
	 * We are accepting the Lambda expression as argument for this method. then execute the lambda expression using the interface variable.
	 */
	public static void ExecuteLambdaExpression(J jjj123) {
		jjj123.m1("the expression: bro");
	}

}

interface J {
	void m1(String s);
}

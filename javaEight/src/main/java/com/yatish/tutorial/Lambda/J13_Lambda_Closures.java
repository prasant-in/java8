package com.yatish.tutorial.Lambda;

public class J13_Lambda_Closures {

	public static void main(String[] args) {
		
		String label = "outside scope variable";
		
		/*
		 * We are accessing the variable 'label' which is present in the enclosing outer scope of the lambda expression. But if we try to modify the value of the 'label' within lambda expression, then
		 * java 8 compiler will thrown an error saying "you cannot modify a final variable". By default even though we have not defined 'label' as final, implicitly that field will be considered as
		 * final.
		 * 
		 *
		 */
		L lll123 = () -> {System.out.println(label);};
		lll123.m();
		
		/*
		 * since we used the 'label' variable within lambda expression. java compiler will consider it as final. hence consider if we try to change its value here, like 'label="abcd"'. Java 8 compiler
		 * will get to know that this variable is not final so only developer is changing it and then throw an error in lambda expression line saying you have used a non-final variable.
		 */
	}

}

interface L {
	void m();
}
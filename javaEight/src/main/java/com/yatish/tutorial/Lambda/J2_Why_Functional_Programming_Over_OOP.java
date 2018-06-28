package com.yatish.tutorial.Lambda;

public class J2_Why_Functional_Programming_Over_OOP {

	public static void main(String[] args) {
		
		/*
		 * As we are seeing here, just to print a string we are doing so much circus by creation an object and all. remember programming in C language. we can write this in just one line.
		 * so in this case functional programming is better than OOP right. so in some scenarios functional programming is better than OOP.
		 * 
		 * Conclusion : Based on the scenarios only we can to decide functional programming is better or OOP. both have their own advantages and disadvantages, we need to decide which is
		 * suitable based on what we want to do.
		 * 
		 */
		A obj = new A();
		obj.PrintHelloMessage("Hello");

	}

}

class A {
	public void PrintHelloMessage(String str) {
		System.out.println(str);
	}
}

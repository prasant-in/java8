package com.yatish.tutorial.Lambda;

public class J8_Type_Inference {

	public static void main(String[] args) {
		
		/*
		 * As we can see in the lambda expression, instead of '(String s)', we have just written '(s)'. Java is intelligent enough to think that it is of String type even though developer
		 * doesn't specify it. anyways interface 'I' can have only one method, java knows that in interface that method argument type is String so, it will use that to find the type of 
		 * 's' parameter
		 */
		I iii123 = (s) -> System.out.println("lmabda expression type inference, argument - " + s);
		iii123.m1("yatish");
	}

}

interface I {
	void m1(String s);
}

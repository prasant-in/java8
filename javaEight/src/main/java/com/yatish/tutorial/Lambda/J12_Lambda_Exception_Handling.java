package com.yatish.tutorial.Lambda;

public class J12_Lambda_Exception_Handling {

	public static void main(String[] args) {
		
		/*
		 * we can use exception handling within the lambda expressions as shown in below code.
		 */
		K kkk123 = () -> {
			try {
				int a = 2/0;
			} catch(Exception e) {
				System.out.println("Exception occured");
			}
		};
		
		kkk123.m();
	}

}

interface K {
	void m();
}
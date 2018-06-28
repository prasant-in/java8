package com.yatish.tutorial.Lambda;

public class J6_Lambda_Return_Value {

	public static void main(String[] args) {
		
		/*
		 * In below code, we are seeing a error from java 8 compiler because, in the interface 'H' we have specified a parameter to the method 'm2()' but in the lambda expression we have 
		 * specified just '()' instead of '(String s)'
		 * 
		 * the right way is as follows,
		 * 		H hhh123 = (String s) -> "yatish";System.out.println("lambda exp1");
		 */
		H hhh123 = () -> "yatish";System.out.println("lambda exp1");
		hhh123.m2("yatish");
		
		/*
		 * If we want to use 'return' statement to return a value, then you have to use non-inline(multiple-line) way of lambda expression. otherwise java 8 compiler gives some syntax error
		 * 
		 * the right way is as follows,
		 * 		G eee456 = () -> {
		 * 			return "";
		 * 		};
		 */
		G eee456 = () -> return "";
		eee456.m1();
		
		/*
		 * In inline lambda expressions, if you want to return a value. then you just mention that value as as part of lambda expression statements.
		 * 
		 * In the below code, java 8 compiler is throwing an error because, in inline lambda, java consider the first statment as the return value. in this case the first statment is 
		 * 'System.out.println("lambda exp1");' which returns void. But interface G is expecting String in 'm1()'. hence it is throwing an exception.
		 * 
		 * the right way is as follows,
		 * 			G eee123 = () -> "yatish";System.out.println("lambda exp1");
		 * 
		 * In the above right way mentioned don't you think that we are specifying the return value "yatish" before the seconds statement "System.out.println("lambda exp1");". so it will
		 * return "yatish" and the seconds statement will not be executed?
		 * NO!!!!
		 * actually even though we specify the return value as the first statement. the subsequent statements will be executed.
		 */
		G eee123 = () -> System.out.println("lambda exp1");"yatish";
		eee123.m1();
		
		
	}
	

}

interface G {
	String m1();
}

interface H {
	String m2(String s);
}



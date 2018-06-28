package com.yatish.tutorial.Lambda;

public class J3_What_is_Lambda {

	/*
	 * Lambda expressions are nothing but a function, which are not bound to any class......
	 * 
	 * We can assign a lambda expression to a variable. i.e. a set of lines to a variable. we are not assigning a reference pointer of the set of lines to the variable, we are literally
	 * assigning complete set of lines to the variable. the variable is equal to those set of lines.
	 * 
	 * How to write a lambda expression?
	 * consider, you have a function as follows,
	 * 		public void printHello() {				--> (Lambda expresion)   '() -> System.out.println("Hello");'
	 * 			System.out.println("Hello");
	 * 		}
	 * Please find the steps to create/convert a lambda expression from a normal function as follows,
	 * 1) Remove the 'access specifier' from the function, so after that it will be as folows,
	 * 		void printHello() {
	 * 			System.out.println("Hello");
	 * 		}
	 * 2) Remove the 'return type' from the function as well. because java 8 compiler is intelligent enough find what is the return type based on the value we return. so after that it will
	 * 	  be as follows,
	 * 		printHello() {
	 * 			System.out.println("Hello");
	 * 		}
	 * 3) Change the place of the function name to before '=' as shown below,
	 * 		printHello = () {
	 * 			System.out.println("Hello");
	 * 		}
	 * 4) Now add '->' after '()' and before function body. so after that it will be as follows,
	 * 		printHello = () -> {
	 * 			System.out.println("Hello");
	 * 		}
	 * 5) Now add ';' at the last of the body. i.e. after '}'. so after that is will be as follows,
	 * 		printHello = () -> {
	 * 			System.out.println("Hello");
	 * 		};			--> That's it. here is your final lambda expression!!!!!!!
	 * 
	 * 
	 * I see that previously we saw '() -> System.out.println("Hello");' as the lambda expression in in above answer we see that it is with flower braces? how is this possible?
	 * Actually both are same lambda expressions only. we do have 2 categorizations among them.
	 * 1) inline lambda
	 * 2) non-inline lambda
	 * inline lambda
	 * -------------
	 * In inline lambda after '->', we write all the statements in the same line only. eg:
	 * eg: printHello = () -> System.out.println("Hello"); System.out.println("yatish");
	 * non-inline lambda expression(multipleline)
	 * ------------------------------------------
	 * In non-inline lambda, after '->' instead of writing all the function statements in same line, we write in following lines and put them all between '{}'.
	 * eg: printHello = () -> {
	 * 	System.out.println("Hello");
	 * 	System.out.println("yatish");
	 * };
	 * 
	 * NOTE: in-line lambda expression is good if the length of the line is not too long and is readable in a single line. non-inline(multipline) lambda is good when the number of statements
	 * in the lambda expression is too long and it will be too long to put in a inline lambda.
	 * 
	 * In above questions we saw that we are assigning the lambda expression to a variables. like in 'printHello = () -> System.out.println("Hello");' we are assigning it to 'printHello'
	 * variable. what is the type of that variable?
	 * Interesting. It is an interface variable.
	 * eg: as shown in this program, we have assigned the lamda expression to variable 'fff123' and the type of the variable is 'abc' which is an interface.
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		abc fff123 = () -> System.out.println("lambda exp1");System.out.println("lambda exp2");

		fff123.m1();
	}
	
}

/*
 * The interface which we want to use as a variable type for lambda expression should have only one abstract method in it.
 * 
 * So can i have the 'abc' interface as follows?
 * 			interface abc {
				void m1();
				void m2();
			}
	No!!! it has to have only one abstract method
		
 * 
 * So can i have the 'abc' interface as follows?
 * 			interface abc {
				void m1();
				String m2(String s);
			}
	No!!! it has to have only one abstract method. even if we have other method with other signatures(no. of parameters, type of parameters) also we cannot have more than one abstract method.
 */
interface abc {
	void m1();
}



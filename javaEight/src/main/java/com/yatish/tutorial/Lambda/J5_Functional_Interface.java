package com.yatish.tutorial.Lambda;

/*
 * What is a functional interface?
 * Functional interface is nothing but an interface with only one abstract method in it.
 * 
 * Java 8 could have introduced a new variable type to handle the lambda expression variables, why the hell did they choose interface for that?
 * While developing Java 8, they have to provide backward compatibility with java 7 as well. so if they introduce new varibale type, then they have to modify the libraries in java7 to 
 * support this new type. So it was better to support it by interface instead of adding new type.
 * 
 * So Functional Interface should have only one abstract method and nothing else in it?
 * No!!! It can have other methods as well like default methods and static methods but not abstract methods. In the below code, for functional Interace 'D' it is giving error because it has 2
 * abstract methods 'm1' and 'm2' if we make one method as default then java 8 compiler will not throw any error as follows,
			@FunctionalInterface
			interface D {
				void m1();
				default void m2() {};
			}
 */
public class J5_Functional_Interface {

	public static void main(String[] args) {
		
		C fff123 = () -> System.out.println("lambda exp1");System.out.println("lambda exp2");
		fff123.m1();
		
		D eee123 = () -> System.out.println("lambda exp1");System.out.println("lambda exp2");
		eee123.m1();
	}

}

/*
 * This is not a functional interface, there are 2 methods in it. in that case we cannot use it as a variable type for a lambda expression. In this case, java 8 compiler is showing error
 * wherever we try to use this as variable type. in this case as well we can see an error on first lambda expression in main method.
 * 
 * Consider you have more than 1000 lambda expressions using this interface as the variable type. if by mistake a developer adds one more method to a functional interface like as shown in 
 * interface 'C', there is no error shown in the interface. so developer will not know that this was functional interface so he shouldn't be adding more than one abstract methods. Is there
 * any way to let user know that he is adding one more abstract method to a functional interface?
 * Yes!!!
 * Java 8 provides an annotation '@FunctionalInterface' annotation. developer has to use this annotation on the functional interface so that, whenever developer adds an abstract method to
 * the interface, there itself in the interface it shown an error and notify the developer.
 * eg: see the interface 'D'. in the interface itself there is an error shown.
 * 
 */
interface C {
	void m1();
	void m2();
}


@FunctionalInterface
interface D {
	void m1();
	void m2();
}


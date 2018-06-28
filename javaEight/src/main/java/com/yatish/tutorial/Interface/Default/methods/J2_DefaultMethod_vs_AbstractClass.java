package com.yatish.tutorial.Interface.Default.methods;

public class J2_DefaultMethod_vs_AbstractClass {

	/*
	 * Differences between Abstract class and default method are as follows,
	 * 1) Abstract class can have constructor but interface with default method cannot have constructor.
	 * 
	 * So only one difference?
	 * Yes!!! unfortunately.
	 * Functionality wise, there is not much difference. Based on the scenario, we need to think which suits better.
	 * eg1: In java8, 'forEach' Has been supported for collections. a 'forEach' method has been added to the 'Iterable interface' as follows,
	 * 		public interface Iterable<T> {
				public default void forEach(Consumer<? super T> consumer) {
    			for (T t : this) {
        		consumer.accept(t);
    		}
    	  If we don't use 'default' method and do the conventional way of interface the code will be as follows,
    	  	public interface Iterable<T> {
    			public void forEach(Consumer<? super T> consumer);	--> in this way, we have to add the definition of this method in all the classes which are implementing it.
    																	there are lot of classes implementing this interface. modifying all of them doesnt make sense. so usind default 
    																	method is better. 
			}
		 In this example, java 7 had collections as interface, they cannot change it from interface to abstract class for just this functionality. so 'default method' is the cleaner way,
		 hence in this scenario default methods were better than abstract class.
		 
		eg2: While in contrast, default method can be implemented only in the terms of invoking other interface methods, with no reference to a particular implementation's state.

		NOTE: java 'Streams' are also implemented the same way as that of 'forEach' in java 8. 

	 */

}

abstract class C {
	
	abstract public void method1();
	
	public void method2() {
		method1();
	}
}


interface D {
	public void method1();
	default public void method2() {
		method2();
	}
}

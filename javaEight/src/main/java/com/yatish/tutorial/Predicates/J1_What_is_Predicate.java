package com.yatish.tutorial.Predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class J1_What_is_Predicate {

	public static void main(String[] args) {
		
		Collection<String> collection = new ArrayList(Arrays.asList("yatish","gagan","ashok","ramya","jeshwanth"));
		
		/*
		 * What are Predicates?
		 * In general Predicates are nothing but the functions which will return a boolean value. 
		 * 
		 * Predicates were introduced in Java 8?
		 * No!!
		 * It was there before only. But in java 8 predicates can handle lambda expressions.
		 * 
		 * What is a predicate in java 8?
		 * Predicate is nothing but default functional interface provided in 'java.util.function.*' package. I has one abstract method 'test()' as follows,
		 * 		@FunctionalInterface
		 * 		public interface Predicate<T> {
		 * 			boolean test(T t);
		 * 		}
		 * 
		 * 
		 * Where are these predicates used?
		 * The java stream filter method accepts predicate like as follows,
		 * 	 collection.stream().filter(Predicate)  --> Here 'filter' will accept the argument as predicate.
		 * Since predicate is a functional interface. we can directly pass the lambda expression as argument here.
		 * 		
		 */
		collection.stream().filter(a -> a.length()>2);
		
		
		

	}

}

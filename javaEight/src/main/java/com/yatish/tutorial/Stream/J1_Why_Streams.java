package com.yatish.tutorial.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class J1_Why_Streams {

	public static void main(String[] args) {
		/*
		 * Consider, in a collection of String you have to filter out only strings starting with length greater than 2 and then you have to sort them and then print those. In conventional java way,
		 * we have to do as follows,
		 * 1) Iterate over all the collections and store the strings whose lengths are greater than 2 in a seperate collection.
		 * 2) Iterate over the seperate collection with the string lengths greater than 2 and sort them and store in one more seperate collection.
		 * 3) Iterate over the sorted collection and print them.
		 * We are iterating over the collections each time to perform a single operation. once for filtering the strings with length greater than 2 and then once again to sort them and then once again
		 * to print them. We are not able to perform all these 3 operations by just iterating the collection once. Is there any way we can do it?
		 * Yes!!!! Java8 Streams.
		 * Streams enables us to perform various operations on a collection in just one iteration.
		 * 
		 * Real Time example
		 * -----------------
		 * Consider, there is a 10 cars which needs repairing and painting. there is one repair guy and one paint guy.
		 * Collection way --> The repair guy will first repair all 10 cars and then paint guy will paint all the 10 cars. hence 2 iterations done over 10 cars to get both repair and paint done.
		 * Stream way --> Once repair guy is done with repairing of 1st car and goes to repair 2nd car. the paint guy starts painting 1st car. hence 1 iteration done over 10 cars.
		 */	
		Collection<String> collection = new ArrayList(Arrays.asList("yatish","gagan","jeshwanth","ramya","ashok"));
		
		collection.stream().filter(a -> a.length()>2).sorted().forEach(a -> System.out.println(a));

	}

}

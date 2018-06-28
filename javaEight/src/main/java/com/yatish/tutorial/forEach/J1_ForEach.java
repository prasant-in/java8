package com.yatish.tutorial.forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class J1_ForEach {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("yatish","ramya");
		Collection<String> collection = new ArrayList<String>(list);
		/*
		 * We know various ways to iterate over a collection but in java, there is one more way introduced by adding a default method called '.forEach()'.
		 * 
		 * what is so special about '.forEach()'?
		 * In other iterating ways, we control how the should happen like sequentially or reverse order. in these ways, the iteration is done sequentially one after the other, we cannot achieve
		 * parallel processing using these. I am not saying that '.forEach()' will do parallel processing, but it will support parallel processing in 'java streams'.
		 * 
		 * In '.forEach()', developer do not have control over iteration. user cannot say like do sequential or reverse order or parallel etc. JVM will decide whether to iterate it sequentially or
		 * parallel or reverse order etc at run time.
		 *
		 */
		
		/*
		 * In below code, we are saying java 8 to iterate over the 'collection' and execute whatever is there within '()', in this case, we have lambda expression 'a -> System.out.println(a)', so
		 * The lambda expression will be executed for each element while iterating.
		 * lambda expression is specifying that it accepts a parameter. each element while iterating will be sent as a argument to parameter 'a' of the lambda expression. hence that argument will be
		 * processed by the lambda expression.
		 * In this example, "yatish" will be sent as argument to 'a' parameter, then 'System.out.println(a)' is printing "yatish". then same will be done for "ramya".
		 *  
		 */
		collection.forEach(a -> System.out.println(a));
		
		
	}

}

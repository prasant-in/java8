package com.yatish.tutorial.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class J2_What_are_Streams {

	/*
	 * What are Streams?
	 * Streams are nothing but a sequence of elements supporting sequential and parallel aggregation. (this is official definition, don't worry too much if you don't understand this definition)
	 * 
	 */
	public static void main(String[] args) {
		
		Collection<String> collection = new ArrayList(Arrays.asList("yatish","gagan","ashok","ramya","jeshwanth"));
		
		/*
		 * We create a stream from a collection only. stream is not a stand-alone entity to create like 'new Stream()'.
		 * As shown in the below code, java8 provides a method called '.stream()' to get the stream of a collection.
		 */
		Stream<String> streamObj = collection.stream();
		
		
		System.out.println("-----------------Result of sequential Stream -----------------");
		/*
		 * How can we perform multiple operation in streams in single iteration?
		 * As shown in the below code, we are using '.filter(<Lambda_of_filter_logic>)' method on stream to filter out all the string in stream with length greater than 2 and then we are calling
		 * '.sorted()' method on the it to sort the filtered stream and then using '.forEach()' we are printing the stream elements. Hence instead of iterating over the collection for 3 times, and 
		 * writing so may lines of codes. this is far more better.
		 * 
		 * NOTE: instead of first assigning a stream to 'streamObj' and then use it to perform operations. we can directly write it in one line as well as shown below,
		 * 			collection.stream().filter(a -> a.length()>2).sorted().forEach(a -> System.out.println(a));
		 */
		streamObj.filter(a -> a.length()>2).sorted().forEach(a -> System.out.println(a));
		
		
		System.out.println("-----------------Result of Parallel Stream -----------------");
		/*
		 * So the '.stream()' method helps in processing the stream in parallel?
		 * No!!!!! if you want the parallel processing to happen on multiple cores/processors. then you have to explicitly call '.parallelStream()' on the collection as shown in below code.
		 * 
		 * NOTE: if you use parallelStream, then the stream elements will be split up based on number of cores like if there are 3 cores, then 'yatish' and 'gagan' will be sent to 1st core, 'ashok'
		 * 			and 'ramya' will be sent to seconds core and 'jeshwanth' will be sent to the 3rd core. in each core operations will be performed. during sorting 1st core will give sorted order 
		 * 			'gagan' and 'yatish'. 2nd core will give sorted order 'ashok' and 'ramya'. The final output of all the cores will be aggregated and sent to next operation '.forEach()'. there will
		 * 			be no sorting done on the final strings collected by all cores hence the result printed by '.forEach()' will be as follows,
		 * 			gagan
		 * 			yatish
		 * 			ashok
		 * 			ramya
		 * 			jeshwanth	--> wrong sorting. hence if in case of sorting take care not to go for 'parallelStream'
		 */
		collection.parallelStream().filter(a -> a.length()>2).sorted().forEach(a -> System.out.println(a));

	}

}

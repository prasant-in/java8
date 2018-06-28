package com.yatish.tutorial.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class J3_Lazy_Loading {
	
	/*
	 * What is Lazy Loading?
	 * We know lazy loading is spark right. The transformations will not be executed until the action is called on the data. It is the same way in java 8 also but here we do transformations/actions
	 * on streams, whereas in spark we directly do on the RDD data.
	 * 
	 * So only lazy loading is making it efficeint, nothing else?
	 * Actually java 8 stream APIs are very efficient like, in simple terms artificial intelligent. in this case, we are calling 'findFirst()' action on stream, when this action is called,
	 * it will say to the transformation that it needs only the first element of result to 'filter'. the transformation will fetch "y" and it doesn't qualify the predicate
	 * condition so it will goto next element "gagan" and this will qualify the filter condition. Now it will not goto the next elements. it will just send "gagan" to the action 'findFirst()'
	 * Consider,
	 * 			if the action was 'streamObj.sorted().findFirst();' instead of 'streamObj.findFirst();'  then, 'findFirst()' will ask the 'sorted()' that it only want the 1st element in the sorted
	 * result. 'sorted()' will ask 'filter()' that it needs all the filtered elements for sorting not just 1st element. Then 'filter' will iterate over all the elments and return the strings with
	 * length greater than 2 to 'sorted()', then it will be sorted and then first element in sorted will be sent to 'findFirst()' action.
	 * Consider,
	 * 			if the action was 'streamObj.map(a -> a + "Suffix").findFirst();' instead of 'streamObj.findFirst();' then, 'findFirst()' will ask the 'map' function to return the 1st element 
	 * after performing the 'map' operation, the map will say it doesn't need all the filtered elements and to return only 1st filtered element. 'filter' will fetch "y" and then it doesn't qualify
	 * the predicate condition so it will goto next element "gagan" and this will qualify the filter condition. Now it will not goto the next elements. it will just send "gagan" to 'map', then it 
	 * will suffix "gagan" with "Suffix" and then return to the action 'findFirst()'. 
	 * 
	 *
	 */

	public static void main(String[] args) {
		
		Collection<String> collection = new ArrayList(Arrays.asList("y","gagan","ashok","ramya","jeshwanth"));
		Stream<String> streamObj = collection.stream().filter(a -> a.length() > 2);
		
		/*
		 * Unless we call the action on 'StreamObj' the 'filter' transformation will be not be performed.
		 */
		streamObj.findFirst();
		
		
	}

	}


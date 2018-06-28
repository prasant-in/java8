package com.yatish.tutorial.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class J4_Transformations {

	public static void main(String[] args) {
		
		Collection<String> collection = new ArrayList(Arrays.asList("yatish","gagan","ashok","ramya","jeshwanth"));
		collection.stream().map(a -> a + "Suffix");
		
	}

}

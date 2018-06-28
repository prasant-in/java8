package com.yatish.tutorial.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class J5_Actions {

	public static void main(String[] args) {
		
		Collection<String> collection = new ArrayList(Arrays.asList("yatish","gagan","ashok","ramya","jeshwanth"));
		List<String> list = new ArrayList();
		
		list = collection.stream().map(a -> a + "Suffix").collect(Collectors.toList());

	}

}

package com.store.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {
public static void main(String[] args) {
	List<Integer> primeNumbers=Arrays.asList(2,3,5,7);
	
	List<Integer> oddNumbers=Arrays.asList(2,3,5,7);
	
	List<Integer> evenNumbers=Arrays.asList(2,4,6,8);
	
	List<List<Integer>> listOfList=Arrays.asList(primeNumbers,oddNumbers,evenNumbers);
	System.out.println(listOfList);
	
	//List<Integer> flatList=
			listOfList.stream().flatMap(list->list.stream())
			.forEach(e->System.out.print(e+" "));
			//.collect(Collectors.toList());
	
	//System.out.println(flatList);
}
}

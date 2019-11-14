package com.store.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		List<Integer> primeNumbers=Arrays.asList(2,3,5,7,11);
		primeNumbers.replaceAll(e->e*3);
		primeNumbers.forEach(e->System.out.print(e+" "));
		//primeNumbers.stream().map(e->e*3).forEach(e->System.out.print(e+" "));
		
		List<String> list=Arrays.asList("ram","is","a");
		//list=list.stream().map(String::toUpperCase).collect(Collectors.toList());
		list.replaceAll(String::toUpperCase);
		
		list.stream().map(String::length).forEach(System.out::println);
		
		System.out.println(list);

	}

}

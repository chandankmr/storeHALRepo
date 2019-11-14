package com.store.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnyMatchDemo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,3,5,4,7,9);
		boolean matched=list.stream().anyMatch(e->e%2==0);
		//System.out.println(matched);
		
		List<String> names=Arrays.asList("Rajendar","Kumar","SIngh");
		matched=names.stream().anyMatch(str->Character.isUpperCase(str.charAt(1)));
		
//		names.stream().filter(str->Character.isUpperCase(str.charAt(1)))
//		.forEach(System.out::println);
		names.stream().filter(str->str.endsWith("r")||str.endsWith("R")).forEach(System.out::println);

	}

}

package com.store.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindAnyDemo {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("Chandan","is","a");
		
		Optional<String> optionalAny=list.stream().filter(s->s.endsWith("b")).findAny();
		Optional<String> optionalFirst=list.stream().filter(s->s.endsWith("b")).findFirst();
		if(optionalAny.isPresent()) {
		System.out.println(optionalAny.get());
		}
		
		if(optionalFirst.isPresent()) {
		System.out.println(optionalFirst.get());
		}
		
		IntStream stream=IntStream.of(5,6,34).parallel();
		OptionalInt optionalInt=stream.findAny();
		
		stream=IntStream.of(5,6,34).parallel();
		
		OptionalInt optionalF=stream.findFirst();
		
		if(optionalInt.isPresent()) {
			System.out.println(optionalInt.getAsInt());
		}
		
		if(optionalF.isPresent()) {
			System.out.println(optionalInt.getAsInt());
		}
		
		

	}

}

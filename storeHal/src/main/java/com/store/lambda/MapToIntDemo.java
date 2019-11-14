package com.store.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MapToIntDemo {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("1","45","33","256");
		List<String> list1=Arrays.asList("66.23","45.67","33.34","15");
		//list.stream().flatMapToInt(str->IntStream.of(Integer.parseInt(str))).forEach(System.out::println);
		
		//list.stream().flatMap(str->Stream.of(str.length())).forEach(System.out::println);
		
//		list1.stream()
//		.flatMapToLong(str->LongStream.of(Long.parseLong(str)))
//		.forEach(System.out::println); //NumberFormatException
		
		//list.stream().flatMapToInt(str->IntStream.of(str.length())).forEach(System.out::println);
		
//		list1.stream().flatMapToDouble(str->DoubleStream.of(Double.parseDouble(str))).forEach(System.out::println);
//		
//		list1.stream().mapToDouble(str->Double.parseDouble(str))
//		.filter(num->(num*num)*2==450)
//		.forEach(System.out::println);
		
//		list.stream().mapToLong(str->Long.parseLong(str)).filter(num->Math.sqrt(num)/2==8)
//		.forEach(System.out::println);
//
//		list.stream().mapToLong(str->Long.bitCount(str.length()))
//		.forEach(System.out::println);

    //   DoubleStream.of(23.56,54.34,98.56).mapToLong(num->(long)num).forEach(System.out::println);
     //  DoubleStream.of(12,56,43).mapToLong(num->(long)num).forEach(System.out::println);
       int val=IntStream.of(23,34,56).sum();
       //System.out.println(val);
       OptionalInt val1=IntStream.of(23,34,56)
    		   .reduce(Integer::sum);
    		   
    		    int intValue=IntStream.of(23,34,56)
    		    		 .reduce(0,(a,b)->a+b);
       System.out.println(intValue);
       
       List<Integer> intList=Arrays.asList(2,3,5);
       Optional<Integer> optional= intList.stream().reduce(Integer::sum);
       System.out.println(optional.get());
       
       Integer sum=intList.stream().collect(Collectors.summingInt(Integer::intValue));
       System.out.println(sum);
       
	}
	

}

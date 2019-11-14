package com.store.lambda;

import java.util.stream.Stream;

public class StreamOfDemo {

	public static void main(String[] args) {
		Stream<Integer> intStream=Stream.of(5,6,89);
		intStream.forEach(e->System.out.println(e));
		System.out.println(intStream.toString());

	}

}

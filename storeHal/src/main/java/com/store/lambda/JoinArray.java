package com.store.lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JoinArray {

	public static void main(String[] args) {
		String[] s1 = new String[]{"a", "b", "c"};
        String[] s2 = new String[]{"d", "e", "f"};
        String[] s3 = new String[]{"g", "h", "i"};
        
       Object[] result= joinArrayLambda(s1,s2,s3);
       System.out.println(Arrays.toString(result));
       
       // Creating a List of Strings 
       //List<String> list = Arrays.asList("5.6", "7.4", "4", 
         //                                "1", "2.3"); 
 
       // Using Stream flatMap(Function mapper) 
      // list.stream().flatMap(num -> Stream.of(num)). 
                      //  forEach(System.out::println);
	}
	
	static String[] joinArray(String[]...arrays) {
		
		int length=0;
		for(String[] array: arrays) {
			length+=array.length;
		}
		
		String[] result=new String[length];
		//System.arraycopy(src, srcPos, dest, destPos, length);	
		int offset=0;
		
		for(String[] array: arrays) {
        System.arraycopy(array, 0, result, offset, array.length);
        offset+= array.length;
		}
		return result;
		
	}



static <T> T[] joinArrayGeneric(T[]...arrays) {
	
	int length=0;
	for(T[] array: arrays) {
		length+=array.length;
	}
	
	@SuppressWarnings("unchecked")
	T[] result=(T[]) Array.newInstance(arrays[0].getClass().getComponentType(), length);
	//System.arraycopy(src, srcPos, dest, destPos, length);	
	int offset=0;
	
	for(T[] array: arrays) {
    System.arraycopy(array, 0, result, offset, array.length);
    offset+= array.length;
	}
	return result;
	
}

static Object[] joinArrayLambda(String[]... arrays) {
	Object[] result= Stream.of(arrays).flatMap(Arrays::stream).toArray();
	String[] strarray=new String[result.length];
	System.arraycopy(result, 0, strarray, 0, result.length);
	//List<String> strList=Arrays.asList(strarray);
	
	Arrays.asList(strarray).stream().flatMap(element-> Stream.of(element.charAt(0))).forEach(System.out::println);
	return Stream.of(arrays).flatMap(Arrays::stream).toArray();
	//return Stream.of(arrays).flatMap(Stream::of).toArray();
	
}

}

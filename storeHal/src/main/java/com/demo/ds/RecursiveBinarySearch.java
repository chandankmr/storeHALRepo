package com.demo.ds;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		int[] array= {12,56,58,90,200};
		binarySearch(array,55);

	}
	public static void binarySearch(int[] array,int search) {
		int index=binarySearch(array,search,0,array.length-1);
		if(index==-1) {
			System.out.println("not found");
		}
		else {
			System.out.println(array[index]+ " found at index "+(index));
		}
			
	}
	
	public static int binarySearch(int[] array,int search,int low,int high){
		if (low>high) {
			return -1;
		}
		
		int mid=(low+high)/2;
		
		if(search==array[mid]) {
			return mid;
		}else if(search>array[mid]) {
			return binarySearch(array,search,mid+1,high);	
		}
		else {
			return binarySearch(array,search,low,mid-1);	
		}
	}

}

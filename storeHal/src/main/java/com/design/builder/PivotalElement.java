package com.design.builder;

import java.util.Arrays;
import java.util.List;

public class PivotalElement {

	public static void main(String[] args) {
		//standard case
		//List<Integer> al=Arrays.asList(1,2,3,4,6);
		//List<Integer> al=Arrays.asList(1,2,3,3);
		
		List<Integer> al=Arrays.asList(2,1,2);
		
		int pivotal=0;
		
		for(int i=0;i<al.size();i++) {
			
			int leftSum=al.get(i);
			int rightSum=al.get(i);
			
			for(int j=0;j<i;j++) {
				leftSum=leftSum+al.get(j);	
			}
			
			for(int k=i+1;k<al.size();k++) {
				rightSum=rightSum+al.get(k);	
			}
			
			if(leftSum==rightSum) {
				pivotal=i;
				break;
			}
		}
		
		System.out.println(pivotal);

	}

}

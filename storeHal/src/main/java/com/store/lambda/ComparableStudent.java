package com.store.lambda;

import java.util.Set;
import java.util.TreeSet;

public class ComparableStudent implements Comparable<ComparableStudent>  {
	
	private int rollNo;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public static void main(String[] args) {
		ComparableStudent s1=new ComparableStudent();
		s1.setRollNo(15);
		
		ComparableStudent s2=new ComparableStudent();
		s2.setRollNo(16);
		
		Set<ComparableStudent> students=new TreeSet<>();
		students.add(s1);
		students.add(s2);
		
		System.out.println(students);

	}
	
	public String toString() {
		return "Roll No="+this.getRollNo();
	}

@Override
public int compareTo(ComparableStudent o) {
if(o.getRollNo()>this.getRollNo()) {
	return 1;
}else if(o.getRollNo()<this.getRollNo()) {
	return -1;
}
		return 0;
}

}

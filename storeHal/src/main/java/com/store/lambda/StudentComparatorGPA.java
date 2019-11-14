package com.store.lambda;

import java.util.Comparator;

public class StudentComparatorGPA implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o2.getGpa()>o1.getGpa()) {
			return 1;
		}else if(o1.getGpa()>o2.getGpa()){
			return -1;
		}
     return 0;
	}

}

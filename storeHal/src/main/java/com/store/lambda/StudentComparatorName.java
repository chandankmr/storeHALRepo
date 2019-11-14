package com.store.lambda;

import java.util.Comparator;

public class StudentComparatorName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
     return o2.getName().compareTo(o1.getName());
	}

}

package com.store.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
        students.add(new Student("Kandarp",52,87.3));
        students.add(new Student("Pramod",35,95.8));
        students.add(new Student("Aadarsh",45,95.8));
        
        StudentComparatorName comp1=new StudentComparatorName();
        StudentComparatorGPA comp2=new StudentComparatorGPA();
        
      //  Collections.sort(students,comp1);
        
//        Collections.sort(students,
//       		(s1,s2)->s2.getName().compareTo(s1.getName()));
        
        System.out.println("Comp1 Comparator");
        
//        students.sort(
//        		(s1,s2)->s2.getGpa()>s1.getGpa()?1:(s2.getGpa()<s1.getGpa()?-1:0)
//                      );
        
        Comparator<Student> gpaComparator=(s1,s2)->s2.getGpa()>s1.getGpa()?1:(s2.getGpa()<s1.getGpa()?-1:0);
        
        students.sort(gpaComparator.reversed());
        
        
        for(Student student:students) {
            System.out.println(student);
        }
        
        System.out.println("Comp2 Comparator");
        Collections.sort(students,comp2);
        
        for(Student student:students) {
            System.out.println(student);
        }
	}

}

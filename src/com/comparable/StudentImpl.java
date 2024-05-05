package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.Comparator.Student;

public class StudentImpl {
	public static void main(String[] args) {
		List<Student> ts=new ArrayList<Student>();
		ts.add(new Student("charan", 89));
		ts.add(new Student("nithin", 23));
		ts.add(new Student("mahesh", 12));
		ts.add(new Student("gopichand", 8));
		ts.add(new Student("arjun", 56));
		ts.add(new Student("sai", 1));
		Collections.sort(ts,(a,b)->a.getName().compareTo(b.getName()));
		for(Student s:ts)
		System.out.println(s);
	}

}

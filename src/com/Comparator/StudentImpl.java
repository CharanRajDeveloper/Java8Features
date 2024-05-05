package com.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class StudentImpl {
	public static void main(String[] args) {
		Comparator<Student> comp = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				//return o1.getId() - o2.getId();
				return o1.getName().compareTo(o2.getName());
			}

		};
		
		
		
		  TreeMap<Student, Integer> student = new TreeMap<Student, Integer>(comp);
		  student.put(new Student("charan", 89), 10); 
		  student.put(new Student("nithin",23), 22); 
		  student.put(new Student("mahesh", 12), 34); 
		  student.put(new Student("gopichand", 8), 56); 
		  student.put(new Student("arjun", 56), 45);
		  student.put(new Student("sai", 1), 34); // System.out.println(student); for
		  for(Map.Entry<Student, Integer> s : student.entrySet())
		  System.out.println(s.getKey() + ":" + s.getValue());
		 
		System.out.println("*******LIST*************");
		Comparator<Student> id=new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o2.getId()-o1.getId();
			}
			
		};
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student("charan", 89));
		al.add(new Student("nithin", 23));
		al.add(new Student("mahesh", 12));
		al.add(new Student("gopichand", 8));
		al.add(new Student("arjun", 56));
		al.add(new Student("sai", 1));
		Collections.sort(al,id);
		for(Student s:al)
		System.out.println(s);
	}

}

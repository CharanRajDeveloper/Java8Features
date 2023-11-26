package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class StudentImpl {
	public static int findhighest(List<Student> ls) {
		int age = 0;
		for (int i = 0; i < ls.size(); i++) {
			if (ls.get(i).getAge() > age) {
				age = ls.get(i).getAge();
			}
		}
		return age;
	}
	
	public static List<Student> transfer(List<Student> ls){
		return ls;
	}

	public static void main(String[] args) {
		List<Student> ls = new LinkedList<Student>();
		ls.add(new Student(145, "charan"));
		ls.add(new Student(123, "charan1"));
		ls.add(new Student(121, "charan5"));
		ls.add(new Student(1, "charan6"));
		ls.add(new Student(120, "charan6"));
		System.out.println("Highest Age is:"+findhighest(ls));
		System.out.println(ls);
		Set<List<Student>> s = new HashSet<>();
		s.add(ls);
		System.out.println("Set Values");
		System.out.println(s);
		System.out.println("Using Comparable");
		Collections.sort(ls);
		System.out.println(ls);
		List<Integer> l=new ArrayList<Integer>();
		l.add(12);
		l.add(1);
		Collections.sort(l);
		System.out.println(l);

	}

}

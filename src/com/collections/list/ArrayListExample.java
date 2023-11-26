package com.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
   public static void main(String[] args) {
	List<String> al=new ArrayList<String>(Arrays.asList("charan","raj","MS","Unilog"));
	//Iterating elements via Iterator
	System.out.println("Iterating elements via Iterator");
	Iterator i=al.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	System.out.println("**********************************");
	al.get(3);
	System.out.println("Iterating elements via For-Each loop");
	//Iterating elements via For-Each loop
	for(String i1:al) {
		System.out.println(i1);
	}
}
}

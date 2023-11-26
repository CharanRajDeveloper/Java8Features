package com.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListExample {
   public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>(Arrays.asList("charan","raj","MS","Unilog"));
	//Iterating elements via Iterator
	System.out.println("Iterating elements via Iterator");
	Iterator i=al.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	System.out.println("**********************************");
	System.out.println("Iterating elements via For-Each loop");
	//Iterating elements via For-Each loop
	for(String i1:al) {
		System.out.println(i1);
	}
}
}

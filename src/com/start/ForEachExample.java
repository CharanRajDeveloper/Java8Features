package com.start;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
	public static void main(String[] args) {
		List<String> qualification = new ArrayList<String>();
		qualification.add("SSLC");
		qualification.add("Intermediate");
		qualification.add("BCA");
		qualification.add("Msc");
		System.out.println("------------------Iterating by passing Method reference--------------------");
		qualification.forEach(System.out::println);
		System.out.println("----------------Using Normal Method-----------------");
		qualification.forEach(charan->System.out.println(charan));
		System.out.println("-------------Using forEachOrdered-------------------------");
		qualification.stream().forEachOrdered(raj->System.out.println(raj));
	}

}

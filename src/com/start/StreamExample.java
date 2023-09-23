package com.start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		// Removing duplicates using stream
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 2, 2, 5));
		System.out.println("Before Removing duplicates:" + al);
		List<Integer> dv = al.stream().distinct().collect(Collectors.toList());
		System.out.println("After removing duplicates:" + dv);
		Set<Integer> dv1 = al.stream().distinct().collect(Collectors.toSet());
		System.out.println("After removing duplicates using set:" + dv1);
		// End of Removing duplicates using stream

	}
}

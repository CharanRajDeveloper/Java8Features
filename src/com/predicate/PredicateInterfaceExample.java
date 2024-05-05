package com.predicate;

import java.util.function.Predicate;

public class PredicateInterfaceExample {

	public static boolean check(int n) {
		if (n > 18) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Predicate<Integer> predicate=PredicateInterfaceExample::check;
		System.out.println(predicate.test(110));

	}

}

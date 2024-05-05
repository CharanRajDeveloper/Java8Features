package com.predicate;

import java.util.function.Predicate;

public class PredicateExample2 {
	public static void main(String[] args) {
		Predicate<Integer> pr = (a) -> {
			if (a > 19)
				return true;
			else
				return false;
		};
		System.out.println(pr.test(11));
	}

}

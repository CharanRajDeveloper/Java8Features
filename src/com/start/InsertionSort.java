package com.start;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int a[] = { 38, 47, 24, 32, 89, 1, 23, 11 };
		System.out.println("Before Sorting:" + Arrays.toString(a));
		int move;
		int innerMove;
		int compare;
		for (move = 1; move < a.length; move++) {
			compare = a[move];
			for (innerMove = move - 1; innerMove >= 0 && compare < a[innerMove]; innerMove--) {
				a[innerMove + 1] = a[innerMove];
			}
			a[innerMove + 1] = compare;
		}
		System.out.println("After Sorting:" + Arrays.toString(a));
	}

}

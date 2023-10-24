package com.start;

import java.util.Arrays;

public class SelectionSort {
	static int loc, min;

	public static int min(int a[], int i) {
		min = a[i];
		loc = i;
		int m = 0;
		for (m = i + 1; m < a.length; m++) {
			if (min > a[m]) {
				min = a[m];
				loc = m;
			}
		}
		return loc;
	}

	public static void main(String[] args) {
		int a[] = { 12, 3, 45, 67, 0, 9, 2 };
		System.out.println("Before Swapping:" + Arrays.toString(a));
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			loc = min(a, i);
			temp = a[i];
			a[i] = a[loc];
			a[loc] = temp;
		}
		System.out.println("After Swapping: " + Arrays.toString(a));
	}

}

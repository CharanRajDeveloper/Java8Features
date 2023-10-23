package com.start;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int a[]= {28,20,30,15,05};
		System.out.println("Before Sorting:"+Arrays.toString(a));
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("After Sorting:"+Arrays.toString(a));
	}

}

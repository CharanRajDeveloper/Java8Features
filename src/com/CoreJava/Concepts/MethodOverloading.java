package com.CoreJava.Concepts;

public class MethodOverloading {
	public static void run(int a,int b) {   //two parameters
		System.out.println("First Method");
	}
	public static void run(int a,int b,double c) {  // three parameters
		System.out.println("Second Method");
	}
	public static void main(String[] args) {
	    run(1,2);	
	    run(1,2,3.4f);
	}

}

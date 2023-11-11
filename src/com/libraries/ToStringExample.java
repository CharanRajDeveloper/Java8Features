package com.libraries;

public class ToStringExample {
	public static void main(String[] args) {
		Unilog u1=new Unilog(10);
		Unilog u2=new Unilog(10);
		System.out.println(u1);  
		System.out.println(u1.toString());  //toString Example.
		System.out.println(u1==u2);
		System.out.println(u1.equals(u2));  //Equals Example...
		System.out.println(u1.hashCode());  //HashCode Example
	}

}

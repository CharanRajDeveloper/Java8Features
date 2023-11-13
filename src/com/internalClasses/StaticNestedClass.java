package com.internalClasses;

public class StaticNestedClass {
	static int data=1000;
	 static class Inner{
		static void display() {
			 System.out.println("Inner::"+data);
		 }
		 void display1() {
			 System.out.println("Inner::"+data);
		 }
	 }
	 public static void main(String[] args) {
		 //StaticNestedClass snc=new StaticNestedClass();
		 StaticNestedClass.Inner si=new StaticNestedClass.Inner();
		 si.display1();
		 StaticNestedClass.Inner.display();
	}

}

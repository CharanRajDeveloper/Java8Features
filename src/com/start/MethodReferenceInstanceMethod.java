package com.start;

public class MethodReferenceInstanceMethod {
	public void instanceReference(int i) {
		System.out.println("Referring to an instance method and employee id is:"+i);
	}
	public static void main(String[] args) {
		int i=12;
      Employee e=new MethodReferenceInstanceMethod()::instanceReference;
      e.displayId(i);
	}
}

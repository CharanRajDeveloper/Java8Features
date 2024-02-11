package com.start.interviewPrep.MethodRef;

interface First {
	default void fun() {
		System.out.println("Default Body");
	}
}

@FunctionalInterface
interface Second extends First {
	void fun1();
}

public class FunctionalInterfaceExample implements First, Second {

	public static void main(String[] args) {
		new FunctionalInterfaceExample().fun1();
	}

	@Override
	public void fun1() {
		System.out.println("Functional Interface fun1");

	}

}

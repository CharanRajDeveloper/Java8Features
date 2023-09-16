package com.start;

@FunctionalInterface
interface sayable {
	void say(String msg); // abstract method
}

@FunctionalInterface
interface Doable {
	// Invalid '@FunctionalInterface' annotation; Doable is not a functional
	// interface
	// void doIt();
	default void defaultfunction() {
		System.out.println("Default Function");
	}

	void doit();
}

public class FunctionalInterfaceExample implements sayable, Doable {
	public static void main(String[] args) {
		FunctionalInterfaceExample fi=new FunctionalInterfaceExample();
		fi.say("sayable interface");
		fi.defaultfunction();
		fi.doit();
	}

	@Override
	public void say(String msg) {
		System.out.println("sayable Functional interface: "+msg);

	}

	@Override
	public void doit() {
		System.out.println("Doable Functional interface");

	}

}

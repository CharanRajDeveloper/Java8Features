package com.start;

@FunctionalInterface
interface sayable {
	void say(String msg); // abstract method
}

@FunctionalInterface
interface Doable  {
	// Invalid '@FunctionalInterface' annotation; Doable is not a functional
	// interface
	// void doIt();
	default void defaultfunction() {
		System.out.println("Default Function");
	}
	void doit();
}

public class FunctionalInterfaceExample {

}

package com.start;

@FunctionalInterface
public interface Employee {
	void displayId(int id);
	default void run() {
		System.out.println("Default Method...");
	}

}

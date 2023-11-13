package com.internalClasses;

public class NestedInterface {
	interface fun {
		void run();
	}
	public static void main(String[] args) {
		fun f = new fun() {
			@Override
			public void run() {
				System.out.println("Nested Interface..");
			}
		};
		f.run();
	}
}

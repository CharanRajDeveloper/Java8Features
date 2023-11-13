package com.internalClasses;

public class AnonymousInnerClassusingInterfaceImpl {
	public static void main(String[] args) {
		AnonymousInnerClassusingInterface aii = new AnonymousInnerClassusingInterface() {
			@Override
			public void softwareDeveloper() {
				System.out.println("Software Developer job is to develop a Software...");

			}
		};
		aii.softwareDeveloper();
	}

}

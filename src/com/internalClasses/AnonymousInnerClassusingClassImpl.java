package com.internalClasses;

public class AnonymousInnerClassusingClassImpl {
	public static void main(String[] args) {
		AnonymousInnerClassusingClass aic = new AnonymousInnerClassusingClass() {
			@Override
			void Programmers() {
				System.out.println("Program job is to code");
			}
		};
		aic.Programmers();
	}

}

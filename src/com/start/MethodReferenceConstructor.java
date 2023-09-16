package com.start;


public class MethodReferenceConstructor {
	public static void main(String[] args) {
		ConstructorReference cr=ConstructorRef::new;
		cr.display("fun");
	
	}
}

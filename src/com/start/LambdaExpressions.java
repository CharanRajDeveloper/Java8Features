package com.start;

public class LambdaExpressions {
	public static void main(String[] args) {
		/*Lambda expression provides implementation of functional interface.
		An interface which has only one abstract method is called functional interface. 
		Java provides an annotation @FunctionalInterface, 
		which is used to declare an interface as functional interface.*/
		Student s=(name)->{
			System.out.println("Welcome to Lambda Expression "+name);
		};
		s.displayStudentDetails("charan");
	}

}

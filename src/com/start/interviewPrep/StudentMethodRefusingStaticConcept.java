package com.start.interviewPrep;

public class StudentMethodRefusingStaticConcept {
	public static void studentJob() {
		System.out.println("Student Job is to 'Study'");
	}

	public static void main(String[] args) {
		Student student = StudentMethodRefusingStaticConcept::studentJob;
		student.job();
	}

}

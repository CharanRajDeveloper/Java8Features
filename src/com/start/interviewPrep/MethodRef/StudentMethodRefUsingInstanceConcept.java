package com.start.interviewPrep.MethodRef;

import com.start.interviewPrep.Student;

public class StudentMethodRefUsingInstanceConcept {
	public void student() {
		System.out.println("Being a Student,'Discipline' is First...");
	}
	public static void main(String[] args) {
		//StudentMethodRefUsingInstanceConcept object=new StudentMethodRefUsingInstanceConcept();
		Student stud=new StudentMethodRefUsingInstanceConcept()::student;
		stud.job();
	}

}

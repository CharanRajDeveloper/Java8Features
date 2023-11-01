package com.CoreJava.Concepts.MethodOverriding;

public class Employee extends Company {
	final static int a = 10;

	public String companyName() {
		return "Employee of Unilog";
	}

	public void subClsMethod() {
		System.out.println("Sub class Method");
	}

	public static void main(String[] args) {
		Company c = new Employee(); // upcasting will be done implicitly but not downcasting
	System.out.println(c.companyName());
	Employee e=(Employee) c;  //Downcasting..
	e.subClsMethod();
	System.out.println(e.companyName());
}
}

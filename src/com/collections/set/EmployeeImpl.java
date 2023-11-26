package com.collections.set;

import java.util.TreeSet;

public class EmployeeImpl {
	public static void main(String[] args) {
		EmployeeSortbyAge ea=new EmployeeSortbyAge();
		TreeSet<Employee> ts=new TreeSet<>(ea);
		ts.add(new Employee(1,"one"));
		ts.add(new Employee(12,"two"));
		ts.add(new Employee(15,"three"));
		ts.add(new Employee(11,"four"));
		ts.add(new Employee(17,"six"));
		System.out.println(ts);
	}

}

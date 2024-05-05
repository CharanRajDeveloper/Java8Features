package com.Comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeImpl {
	public static void main(String[] args) {
		Comparator<Employee> comparator=new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.getSalary()-o1.getSalary();
			}
			
		};
		TreeSet<Employee> emp=new TreeSet<Employee>(comparator);
		emp.add(new Employee("raj1",2000));
		emp.add(new Employee("raj3",4000));
		emp.add(new Employee("raj5",5000));
		emp.add(new Employee("raj4",6000));
		emp.add(new Employee("raj2",3000));
		for(Employee e:emp) {
			System.out.println(e);
		}
	}

}

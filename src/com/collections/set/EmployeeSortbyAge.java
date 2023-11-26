package com.collections.set;

import java.util.Comparator;

public class EmployeeSortbyAge implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.age-o1.age;
	}

}

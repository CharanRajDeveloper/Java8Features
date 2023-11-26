package com.collections.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class CarImpl {
	public static void main(String[] args) {
		TreeSet<Car> ts=new TreeSet<>();
		ts.add(new Car(12));
		ts.add(new Car(121));
		ts.add(new Car(124));
		ts.add(new Car(1));
		ts.add(new Car(92));
		System.out.println(ts);
		System.out.println("To List");
		ArrayList<Car> c=new ArrayList<>();
		for(Car c1:ts) {
			c.add(c1);
		}
		Collections.sort(c,new SortCarbyCost());
		System.out.println(c);
	}

}

package com.collections.set;

import java.util.Comparator;

public class SortCarbyCost implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		return o1.getCost()-o2.getCost();
	}

}

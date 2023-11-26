package com.collections.set;

public class Car implements Comparable<Car> {
	private int cost;

	public Car(int cost) {
		super();
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public int compareTo(Car o) {
		return this.cost-o.cost;
	}
	public String toString() {
		return ""+this.cost;
	}

}

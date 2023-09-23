package com.start;

public class Product {
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public String toString() {
		  return this.id+":"+this.name+":"+this.price;
	  }
}

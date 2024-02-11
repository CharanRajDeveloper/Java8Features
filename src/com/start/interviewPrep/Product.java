package com.start.interviewPrep;

public class Product {
	int id;
	String item;
	float price;

	public Product(int id, String item, float price) {
		super();
		this.id = id;
		this.item = item;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}

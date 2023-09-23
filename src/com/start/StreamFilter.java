package com.start;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
	public static void main(String[] args) {
		ArrayList<Product> productsList = new ArrayList<>();
		productsList.add(new Product(1, "HP Laptop", 25000));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		System.out.println(productsList);
		List<Float> price = productsList.stream()
				.filter(p -> p.price > 30000 && p.price < 100000) // filtering price
				.map(p -> p.price) // fetching price
				.collect(Collectors.toList()); // collecting as list 
		System.out.println("Price:" + price);
	}
}

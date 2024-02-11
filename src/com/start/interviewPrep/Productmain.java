package com.start.interviewPrep;

import java.util.ArrayList;
import java.util.List;

public class Productmain {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1,"laptop",2400f));
		list.add(new Product(4,"TV",2470f));
		list.add(new Product(5,"Dell",2490f));
		list.add(new Product(9,"HP",2500f));
		list.add(new Product(2,"Lenovo",2510f));
		list.forEach((e)->System.out.println(e.id+"::"+e.item+"::"+e.price));
		Employee e=(n,d)->{
			System.out.println("Name:"+n+" Designation:"+d);
		};
		e.display("charan","Java Developer");
	}

}

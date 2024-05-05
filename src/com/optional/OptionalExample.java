package com.optional;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		String str[]=new String[10];
		str[5]="charan raj";
		Optional<String> value=Optional.ofNullable(str[5]);
		if(value.isPresent()) {
			 String lowcase=str[5].toLowerCase();
			System.out.println(lowcase);
		}else {
			System.out.println("Value is not Present");
		}
		
	}

}

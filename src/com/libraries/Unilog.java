package com.libraries;

public class Unilog {
	int age;
	Unilog(int age){
		this.age=age;
	}
   public String toString() {
	   return "Software Developer";
   }
   
   public boolean equals(Object obj) {
	Unilog u=(Unilog) obj;   
	return this.age==u.age;
   }
   
   public int hashCode() {
	   return 1;
   }
}

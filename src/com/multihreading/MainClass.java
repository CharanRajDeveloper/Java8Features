package com.multihreading;

public class MainClass {
	public static void main(String[] args) {
		Tom t=new Tom();
		t.setName("Kannada");
		t.start();
		System.out.println(t.getName());
		Jerry j=new Jerry();
		Thread th=new Thread(j,"Charan");
		th.start();
		System.out.println(th.getName());
	}

}

package com.internalClasses;

public class LocalInnerClass {
	// LocalInnerClass is a class which is declared inside a method...
	private int data = 200;
	public void display() {
		int localdata = 100;
		class Local {
			void msg() {
				System.out.println("Data:" + localdata + ":::" + data);
			}
		}
		Local l = new Local();
		l.msg();
	}

	public static void main(String[] args) {
		LocalInnerClass lic = new LocalInnerClass();
		lic.display();
	}

}

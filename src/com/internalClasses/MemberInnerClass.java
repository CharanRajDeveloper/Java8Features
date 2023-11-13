package com.internalClasses;

public class MemberInnerClass {
//	MemberInnerClass is a class which is declared inside the class but outside the method...
	private int data=100;
	class InnerClass{
		public void msg() {
			System.out.println("Outer Class data is:"+data);
		}
	}
	public static void main(String[] args) {
		MemberInnerClass mic=new MemberInnerClass();
		MemberInnerClass.InnerClass ic=mic.new InnerClass();
		ic.msg();
	}

}

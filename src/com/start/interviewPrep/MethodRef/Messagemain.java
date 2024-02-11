package com.start.interviewPrep.MethodRef;

public class Messagemain {
	public static void main(String[] args) {
		Messageable msgble=Message::new;
		msgble.messageFun("Hello,this is Fun Programming");
	}

}

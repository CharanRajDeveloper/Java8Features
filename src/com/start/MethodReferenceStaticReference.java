package com.start;

public class MethodReferenceStaticReference {
	public static void saySomething(String name){  
        System.out.println("Hello, this is static method."+name);  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Student sayable = MethodReferenceStaticReference::saySomething;  
        // Calling interface method  
        sayable.displayStudentDetails("charan"); 
    }  
}  

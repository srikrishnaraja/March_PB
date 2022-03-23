package com.pojo;

public class Pojo_B {

	public static void main(String[] args) {
		
		Pojo_A a = new Pojo_A();
		
		int age = a.getA();
		
		System.out.println(age);
		
		System.out.println("after setter");
		
		a.setA(25);
		
		System.out.println(a.getA());
		
		
	}
	
	
	
	
	
}

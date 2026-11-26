package com.model;

public class Calculator {
	
	public Calculator() {
		System.out.println("Constructor");
	}
	
	public void addition()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	public void multiply() {
		
		int a=10;
		int b=5;
		
		System.out.println("Multiplication of "+a +" and "+b+" : "+a*b);
		
	}
	
	public void div()
	{
		int a = 500;
		int b = 5;
		int c = a / b;
		
		System.out.println("Division of " + " "+a + "  and  " + b +" "+ "is :  " + c);
	}

}

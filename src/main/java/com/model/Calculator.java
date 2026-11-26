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
		
<<<<<<< HEAD
=======
	}
	
	public void div()
	{
		int a = 500;
		int b = 5;
		int c = a / b;
		
		System.out.println("Division of " + " "+a + "  and  " + b +" "+ "is :  " + c);
>>>>>>> 54973bc3cdc9c73685741030b1ff4d96afb42bc0
	}
	
	public void subtraction()

	{
		int a=50;
		int b=20;
		System.out.println("Subtraction is:"+(a-b));
	}
}

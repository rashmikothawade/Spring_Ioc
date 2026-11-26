package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.SpringConfig;
import com.model.Calculator;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ap=new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Calculator c=ap.getBean("cal",Calculator.class);
<<<<<<< HEAD

		
		c.subtraction();

		c.addition();
		c.multiply();

=======
<<<<<<< HEAD
		c.div();
=======
		c.addition();
		c.multiply();
>>>>>>> 9a896ddbbc6ab36c49c91aba9a717c0a37dffe12
>>>>>>> 54973bc3cdc9c73685741030b1ff4d96afb42bc0
	}

}

package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
		Product p = (Product) context.getBean("product");
		
		p.setId("111");
		p.setName("Mobile");
		p.setPrice(50000);
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		
		
		System.out.println("Successfully created");
		
	}

}

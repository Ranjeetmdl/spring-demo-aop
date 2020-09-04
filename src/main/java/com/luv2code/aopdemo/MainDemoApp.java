package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		// read the java config class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
		
		//call the businesss method
		theAccountDAO.addAccount();
		
		//let's call the it again
		System.out.println("\nlet's call the it again");
		theAccountDAO.addAccount();
		
		//close the context
		context.close();

	}

}

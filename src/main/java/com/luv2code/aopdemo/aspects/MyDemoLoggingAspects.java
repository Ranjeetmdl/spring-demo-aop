package com.luv2code.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspects {
	//this is where we will be add all our related advices for logging
	
	//let's start with an @Before advice
	@Before("execution(public void addAccount())")
	public void beforeAddAccountAdvice(){
		System.out.println("\n====>Executing @Before advice on addAccont()");
	}
	

}

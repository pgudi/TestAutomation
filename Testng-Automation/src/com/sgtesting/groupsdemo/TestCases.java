package com.sgtesting.groupsdemo;

import org.testng.annotations.Test;

public class TestCases {
	
	@Test(groups= {"smoke"})
	public void method1()
	{
		System.out.println("It is method1 test statement");
	}

	@Test(groups= {"regression"})
	public void method2()
	{
		System.out.println("It is method2 test statement");
	}
	
	@Test(groups= {"smoke"})
	public void method3()
	{
		System.out.println("It is method3 test statement");
	}
	
	@Test(groups= {"regression"})
	public void method4()
	{
		System.out.println("It is method4 test statement");
	}
	
	@Test(groups= {"smoke"})
	public void method5()
	{
		System.out.println("It is method5 test statement");
	}
	
	@Test(groups= {"regression"})
	public void method6()
	{
		System.out.println("It is method6 test statement");
	}
}

package com.sgtesting.tests.products;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Products {
	
	@Test
	public void createProduct()
	{
		System.out.println("The Product demoProduct1 has created Successfully");
	}
	
	@Test
	public void modifyProduct()
	{
		System.out.println("The Product demoProduct1 has modified Successfully");
	}
	
	@Test
	public void deleteProduct()
	{
		System.out.println("The Product demoProduct1 has deleted Successfully");
	}
	
	@BeforeClass
	public void intialize()
	{
		System.out.println("Launch Browser,Navigate URL and Login into the Application");
	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("Logout from the Application and close the Browser");
		System.out.println("++++++++++++++++++++++");
	}

}

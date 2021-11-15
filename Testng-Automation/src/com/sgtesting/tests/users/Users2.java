package com.sgtesting.tests.users;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Users2 {
	
	@Test(priority=1)
	public void createUser()
	{
		System.out.println("The User DemoUser1 has created Successfully");
	}
	

	@Test(priority=2)
	public void modifyUser()
	{
		System.out.println("The User DemoUser1 has modified Successfully");
	}
	

	@Test(priority=3)
	public void deleteUser()
	{
		System.out.println("The User DemoUser1 has deleted Successfully");
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

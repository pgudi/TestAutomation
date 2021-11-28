package com.sgtesting.tests.users;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Users {
	
	@Test
	public void createUser()
	{
		System.out.println("The User demoUser1 has created Successfully");
	}
	
	@Test(dependsOnMethods= {"createUser"})
	public void modifyUser()
	{
		System.out.println("The User demoUser1 has modified Successfully");
	}
	
	@Test(dependsOnMethods= {"modifyUser"})
	public void deleteUser()
	{
		System.out.println("The User demoUser1 has deleted Successfully");
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

package com.sgtesting.tests.users;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Users {
	@Parameters(value="username")
	@Test
	public void createUser(String username)
	{
		System.out.println("The User "+username+" has created Successfully");
	}
	
	@Parameters(value="username")
	@Test
	public void modifyUser(String username)
	{
		System.out.println("The User "+username+" has modified Successfully");
	}
	
	@Parameters(value="username")
	@Test
	public void deleteUser(String username)
	{
		System.out.println("The User "+username+" has deleted Successfully");
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

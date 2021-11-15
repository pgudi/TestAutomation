package com.sgtesting.hardassertions;

import org.testng.Assert;
import org.testng.annotations.Test;
// assertEquals verifies the content
public class AssertEqulsDemo {
	
	@Test
	public void assertEqulsDemo()
	{
		try
		{
			String s1="JavaScript";
			String s2="JavaScript";
			Assert.assertEquals(s1, s2);
			System.out.println("The Assert Steps has passed for assertEquls !!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void assertNotEqulsDemo()
	{
		try
		{
			String s1="JavaScript";
			String s2="JavaScript1";
			Assert.assertNotEquals(s1, s2);
			System.out.println("The Assert Steps has passed for assertNotEquls !!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

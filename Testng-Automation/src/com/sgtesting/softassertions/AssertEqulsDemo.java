package com.sgtesting.softassertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
// assertEquals verifies the content
public class AssertEqulsDemo {
	SoftAssert soft=new SoftAssert();
	@Test
	public void assertEqulsDemo()
	{
		try
		{
			String s1="JavaScript";
			String s2="JavaScript";
			soft.assertEquals(s1, s2);
			System.out.println("The Assert Steps has passed for assertEquls !!!");
			soft.assertAll();
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
			soft.assertNotEquals(s1, s2);
			System.out.println("The Assert Steps has passed for assertNotEquls !!!");
			soft.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

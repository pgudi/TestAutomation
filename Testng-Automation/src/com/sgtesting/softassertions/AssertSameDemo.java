package com.sgtesting.softassertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
// assertSame verifies the reference
public class AssertSameDemo {
	SoftAssert soft=new SoftAssert();
	@Test
	public void assertSameDemo()
	{
		try
		{
			String s1="JavaScript";
			String s2="JavaScript";
			soft.assertSame(s1, s2);
			System.out.println("The Assert Steps has passed for assertSame !!!");
			soft.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void assertNotSameDemo()
	{
		try
		{
			String s1="JavaScript";
			String s2="JAVASCRIPT";
			soft.assertNotSame(s1, s2);
			System.out.println("The Assert Steps has passed for assertNotSame !!!");
			soft.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

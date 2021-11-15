package com.sgtesting.hardassertions;

import org.testng.Assert;
import org.testng.annotations.Test;
// assertSame verifies the reference
public class AssertSameDemo {
	
	@Test
	public void assertSameDemo()
	{
		try
		{
			String s1="JavaScript";
			String s2="JavaScript";
			Assert.assertSame(s1, s2);
			System.out.println("The Assert Steps has passed for assertSame !!!");
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
			Assert.assertNotSame(s1, s2);
			System.out.println("The Assert Steps has passed for assertNotSame !!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

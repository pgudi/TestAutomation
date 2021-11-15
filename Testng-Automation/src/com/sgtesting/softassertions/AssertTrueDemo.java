package com.sgtesting.softassertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTrueDemo {
	SoftAssert soft=new SoftAssert();
	@Test
	public void assertTrueDemo()
	{
		try
		{
			int x,y;
			x=45;y=75;
			soft.assertTrue(y>=x);
			System.out.println("The Assert Steps has passed for assertTrue !!!");
			soft.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void assertFalseDemo()
	{
		try
		{
			int x,y;
			x=45;y=75;
			soft.assertFalse(y<=x);
			System.out.println("The Assert Steps has passed for assertFalse !!!");
			soft.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

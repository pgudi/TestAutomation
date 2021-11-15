package com.sgtesting.hardassertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueDemo {
	
	@Test
	public void assertTrueDemo()
	{
		try
		{
			int x,y;
			x=45;y=75;
			Assert.assertTrue(y>=x);
			System.out.println("The Assert Steps has passed for assertTrue !!!");
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
			Assert.assertFalse(y<=x);
			System.out.println("The Assert Steps has passed for assertFalse !!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

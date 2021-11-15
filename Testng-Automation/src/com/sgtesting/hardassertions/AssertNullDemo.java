package com.sgtesting.hardassertions;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullDemo {
	
	@Test
	public void assertNullDemo()
	{
		try
		{
			File f1=null;
			Assert.assertNull(f1);
			System.out.println("The Assert Steps has passed for assertNull !!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void assertNotNullDemo()
	{
		try
		{
			File f1=null;
			f1=new File("C:\\Windows");
			Assert.assertNotNull(f1);
			System.out.println("The Assert Steps has passed for assertNotNull !!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

package com.sgtesting.softassertions;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertNullDemo {
	SoftAssert soft=new SoftAssert();
	@Test
	public void assertNullDemo()
	{
		try
		{
			File f1=null;
			soft.assertNull(f1);
			System.out.println("The Assert Steps has passed for assertNull !!!");
			soft.assertAll();
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
			soft.assertNotNull(f1);
			System.out.println("The Assert Steps has passed for assertNotNull !!!");
			soft.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

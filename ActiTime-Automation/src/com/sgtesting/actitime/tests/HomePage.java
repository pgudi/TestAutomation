package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage{
	
	
	/**
	 * Testcase ID:
	 * Module Name:
	 * Created By:
	 * Reviewed By:
	 * Modified By:
	 * Return Value:
	 * Parameters:
	 * Modified Date:
	 * Purpose:
	 * Description:
	 */
	public static void minimizeFlyOutWindow(WebDriver oBrowser)
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}

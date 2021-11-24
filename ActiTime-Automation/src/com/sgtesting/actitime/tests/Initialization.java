package com.sgtesting.actitime.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialization {
	public static WebDriver oBrowser=null;
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
	public static WebDriver launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
		return oBrowser;
	}
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
	public static void navigate(WebDriver oBrowser)
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
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
	public static void closeApplication(WebDriver oBrowser)
	{
		
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	

}

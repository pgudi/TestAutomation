package com.sgtesting.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopupBrowsersDemo {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		popupBrowser();
	}
	
	static void launchBrowser()
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
	}

	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void popupBrowser()
	{
		WebElement oLink=null;
		try
		{
			oLink=oBrowser.findElement(By.linkText("actiTIME Inc."));
			
			System.out.println("Before Click on the link # of Popups :"+getPopupCount());
			
			oLink.click();
			System.out.println("After Click on the link # of Popups :"+getPopupCount());
			if(getPopupCount()>=1)
			{
				handlePopups();
			}
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static int getPopupCount()
	{
		int count=0;
		count=oBrowser.getWindowHandles().size()-1;
		return count;
	}
	
	static void handlePopups()
	{
		try
		{
			String parentBrowser=oBrowser.getWindowHandle();
			System.out.println("Parent Browser :"+parentBrowser);
			Thread.sleep(4000);
			Object popups[]=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<popups.length;i++)
			{
				String childBrowser=popups[i].toString();
				System.out.println("Child Browsers:"+childBrowser);
				Thread.sleep(4000);
				oBrowser.switchTo().window(childBrowser);
				Thread.sleep(2000);
				oBrowser.findElement(By.linkText("Start Using actiTIME")).click();
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}

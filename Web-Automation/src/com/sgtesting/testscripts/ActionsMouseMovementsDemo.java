package com.sgtesting.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseMovementsDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		mouseMovements();
	}
	
	static void launchBrowser()
	{
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("--start-maximized");
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver(options);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("https://www.axisbank.com/");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void mouseMovements()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div/span[text()='X']")).click();
			Thread.sleep(2000);
			Actions oMouse=new Actions(oBrowser);
			WebElement oEle=oBrowser.findElement(By.xpath("//a[text()='Explore Products']"));
			oMouse.moveToElement(oEle).build().perform();
			Thread.sleep(2000);
			WebElement olink=oBrowser.findElement(By.linkText("Cards"));
			oMouse.moveToElement(olink).build().perform();
			Thread.sleep(2000);
			oMouse.click(oBrowser.findElement(By.linkText("Credit Cards"))).build().perform();
			Thread.sleep(2000);
			WebElement oLogin=oBrowser.findElement(By.xpath("//div[contains(text(),' Login')]"));
			oMouse.contextClick(oLogin).build().perform();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}

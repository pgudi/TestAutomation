package com.sgtesting.testscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScriptExecutorDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		displayTitle();
		displayURL();
		displayLinksCount();
	//	enterTextInTextField1();
	//	enterTextInTextField2();
	//	clickOnButton1();
	//	clickOnButton2();
	//	clickOnCheckBox1();
	//	clickOnCheckBox2();
	//	clickOnRadioButton1();
	//	clickOnRadioButton2();
		selectItemFromDropDown();

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
			oBrowser.get("file:///F:/HTML/Sample.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void displayTitle()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			String title=(String) js.executeScript("var kk=document.title;return kk;");
			System.out.println("Title :"+title);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void displayURL()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			String url=(String) js.executeScript("var kk=document.URL;return kk;");
			System.out.println("URL :"+url);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void displayLinksCount()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			long linksCount=(long) js.executeScript("var kk=document.getElementsByTagName('A');return kk.length");
			System.out.println("# of Links are :"+linksCount);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void enterTextInTextField1()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			js.executeScript("document.getElementById('uid1user1name1').value='DemoUser1';");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void enterTextInTextField2()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.id("pwd1pass1word1"));
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			js.executeScript("arguments[0].value='DemoUser1';",oEle);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void clickOnButton1()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			js.executeScript("document.getElementById('btn1submit1button1').click();");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void clickOnButton2()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.id("btn1submit1button1"));
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			js.executeScript("arguments[0].click();",oEle);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void clickOnCheckBox1()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			js.executeScript("document.getElementById('chk1windows').click();");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void clickOnCheckBox2()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.id("chk2linux"));
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			js.executeScript("arguments[0].click();",oEle);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void clickOnRadioButton1()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			js.executeScript("document.getElementById('rad1chrome').click();");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void clickOnRadioButton2()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.id("rad2firefox"));
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			js.executeScript("arguments[0].click();",oEle);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void selectItemFromDropDown()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			String script="var items=document.getElementById('tools');";
			script+="for(var i=0;i<items.length;i++)";
			script+="{";
			script+="if(items.options[i].text='Selenium WebDriver')";
			script+="{";
			script+="options[i].selected='1';";
			script+="}";
			script+="}";
			js.executeScript(script);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
}

package com.sgtesting.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FirefoxProfilesProgramticDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
	
	}
	static void launchBrowser()
	{
		try
		{
			FirefoxProfile ffprofile=new FirefoxProfile();
			ffprofile.setPreference("browser.startup.homepage", "http://reporter4public.com");
			FirefoxOptions options=new FirefoxOptions();
			options.setProfile(ffprofile);
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", path+"\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver(options);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

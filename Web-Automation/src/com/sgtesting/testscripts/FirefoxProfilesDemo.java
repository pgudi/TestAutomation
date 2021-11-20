package com.sgtesting.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class FirefoxProfilesDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
	
	}
	static void launchBrowser()
	{
		try
		{
			ProfilesIni profiles=new ProfilesIni();
			FirefoxProfile ffprofile=profiles.getProfile("sgtest");
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

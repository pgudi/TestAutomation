package com.sgtesting.testscripts;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class XPathDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteXPathDemo();
	//	relativeXPathUsingTagNameAlone();
	//	relativeXPathUsingTagNameWithIndex();
	//	relativeXPathUsingTagNameWithAttributeNameAndValue();
	//	relativeXPathUsingAttributeNameAndValueCombination();
	//	relativeXPathUsingAttributeValueAlone();
	//	relativeXPathUsingMultipleAttributeNameAndValue();
	//	relativeXPathUsingMultipleAttributeNameAndValueUsingAndOperator();
	//	relativeXPathUsingMultipleAttributeNameAndValueUsingOROperator();
	//	relativeXPathUsingPartialMatchingOfAttributeValue();
	//	relativeXPathUsingTagNameWithAttributeName();
	//	relativeXPathUsingTagNameWithAttributeName_displayLinkNames();
	//	relativeXPathUsingTagNameWithAttributeName_clickOnParticularLink();
	//	relativeXPathUsingTagNameWithAttributeName_PartialText();
	//	relativeXPathUsingTagNameWithAttributeName_StaleElement();
	//	relativeXPathUsingTextContent();
	//	relativeXPathUsingTextContentAlone();
		relativeXPathUsingPartialMatchingOfTextContent();
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
	
	static void absoluteXPathDemo()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 1: Identify Element based on <tagName> alone
	 * Syntax:
	 * //<tagName>
	 */
	static void relativeXPathUsingTagNameAlone()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser12");
	}
	
	/**
	 * Case 2: Identify Element based on <tagName> with index
	 * Syntax:
	 * //<tagName>[index]
	 */
	static void relativeXPathUsingTagNameWithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("DemoUser12");
	}
	
	/**
	 * Case 3: Identify Element based on <tagName> 
	 *  with attributename and attribute value combination
	 * Syntax:
	 * //<tagName>[@attributename='attributevalue']
	 */
	static void relativeXPathUsingTagNameWithAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
	}
	
	/**
	 * Case 4: Identify Element based on irrespective of any tag 
	 *  with attributename and attribute value combination
	 * Syntax:
	 * //*[@attributename='attributevalue']
	 */
	static void relativeXPathUsingAttributeNameAndValueCombination()
	{
		oBrowser.findElement(By.xpath("//*[@name='submit1btn1']")).click();
	}
	
	/**
	 * Case 5: Identify Element based on irrespective of any tag 
	 *  and irrespective of attribute name only using attribute value 
	 * Syntax:
	 * //*[@*='attributevalue']
	 */
	static void relativeXPathUsingAttributeValueAlone()
	{
		oBrowser.findElement(By.xpath("//*[@*='submit1btn1']")).click();
	}
	
	/**
	 * Case 6: Identify Element based on Multiple
	 *   attributename and attribute value combination
	 * Syntax:
	 * //<tagName>[@attributename='attributevalue'][@attributename='attributevalue']
	 */
	static void relativeXPathUsingMultipleAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit'][@type='button']")).click();
	}
	
	/**
	 * Case 7: Identify Element based on Multiple
	 *   attributename and attribute value combination using And operator
	 * Syntax:
	 * //<tagName>[@attributename='attributevalue' and @attributename='attributevalue']
	 */
	static void relativeXPathUsingMultipleAttributeNameAndValueUsingAndOperator()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit' and @type='button']")).click();
	}
	
	/**
	 * Case 8: Identify Element based on Multiple
	 *   attributename and attribute value combination using or operator
	 * Syntax:
	 * //<tagName>[@attributename='attributevalue' or @attributename='attributevalue']
	 */
	static void relativeXPathUsingMultipleAttributeNameAndValueUsingOROperator()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit' or @class='submit1btn1']")).click();
	}
	
	/**
	 * Case 9: Identify Element based on 
	 *  Partial matching of attribute value 
	 *  starts-with(@attributename,'partial attributevalue');
	 *  ends-with(@attributename,'partial attributevalue');
	 *  contains(@attributename,'partial attributevalue');
	 * Syntax:
	 * //<tagName>[starts-with(@attributename,'partial attributevalue')]
	 * //<tagName>[ends-with(@attributename,'partial attributevalue')]
	 * //<tagName>[contains(@attributename,'partial attributevalue')]
	 */
	static void relativeXPathUsingPartialMatchingOfAttributeValue()
	{
	//	oBrowser.findElement(By.xpath("//input[starts-with(@id,'btn1')]")).click();
		oBrowser.findElement(By.xpath("//input[contains(@id,'submit')]")).click();
	}
	
	/**
	 * Case 10: Identify Element based on 
	 *  <tagName> with attributename combination
	 * Syntax:
	 * //<tagName>[@attributename]
	 */
	static void relativeXPathUsingTagNameWithAttributeName()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		System.out.println("# of Links :"+olinks.size());
	}
	
	static void relativeXPathUsingTagNameWithAttributeName_displayLinkNames()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			System.out.println(content);
		}
	}
	
	static void relativeXPathUsingTagNameWithAttributeName_clickOnParticularLink()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		olinks.get(2).click();
	}
	
	static void relativeXPathUsingTagNameWithAttributeName_PartialText()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			if(content.endsWith("Tool"))
			{
				link.click();
				break;
			}
		}
	}
	// org.openqa.selenium.StaleElementReferenceException: stale element reference: 
	//element is not attached to the page document
	static void relativeXPathUsingTagNameWithAttributeName_StaleElement()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			if(content.startsWith("Selenium"))
			{
				link.click();
			}
		}
	}
	
	/**
	 * Case 11: Identify Element based on text Content 
	 *  
	 * Syntax:
	 * //<tagName>[text()='text content']
	 */
	static void relativeXPathUsingTextContent()
	{
		oBrowser.findElement(By.xpath("//a[text()='Eclipse']")).click();
	}
	
	/**
	 * Case 12: Irrespective of tagName Identify Element based on text Content 
	 *  
	 * Syntax:
	 * //*[text()='text content']
	 */
	static void relativeXPathUsingTextContentAlone()
	{
		oBrowser.findElement(By.xpath("//*[text()='Eclipse']")).click();
	}
	
	/**
	 * Case 13: Identify Element based on 
	 *  Partial matching of text content 
	 *  starts-with(text(),'partial text content');
	 *  ends-with(text(),'partial text content');
	 *  contains(text(),'partial text content');
	 * Syntax:
	 * //<tagName>[starts-with(text(),'partial text content')]
	 * //<tagName>[ends-with(text(),'partial text content')]
	 * //<tagName>[contains(text(),'partial text content')]
	 */
	static void relativeXPathUsingPartialMatchingOfTextContent()
	{
	//	oBrowser.findElement(By.xpath("//a[starts-with(text(),'POI')]")).click();
		oBrowser.findElement(By.xpath("//a[contains(text(),'Build')]")).click();
	}

}

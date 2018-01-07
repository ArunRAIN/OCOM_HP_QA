package com.ocomhp.qa.pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class SegmentDivingCB25v2Page extends PageObject
{

	@FindBy(xpath="//div[@class='cb25w2 cwidth']/div//span")
    private List<WebElementFacade> CTAbutton;
	
	public void scroll_down_page()
	{
		WebElement ele = getDriver().findElement(By.xpath("//h3[text()='Choose Your Area of Interest']"));
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
	}
	
	public void hover_on_links()
	{
		scroll_down_page();
		
		waitABit(3000);
		
		int count = CTAbutton.size();
		for(int i=0;i<count;i++)
		{
			WebElementFacade ele = CTAbutton.get(i);
			
			waitABit(3000);
			
			Actions a =new Actions(getDriver());
			a.moveToElement(ele).perform();
			
		}
	}
	
	public void is_link_underlined()
	{
		String result = getDriver().findElement(By.xpath("(//div[@class='cb25w2 cwidth']/div//span)[8]")).getCssValue("text-decoration");
		System.out.println(result+"hi");
				
		if(result.contains("underline"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	
	
	}
	
	public void click_on_segmentlink()
	{
        scroll_down_page();
		
		waitABit(3000);
		
		WebElement ele = getDriver().findElement(By.xpath("(//div[@class='cb25w2 cwidth']/div//span)[2]"));
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].click();", ele);
	}
	
	public void is_navigate_segment_page() throws IOException
	{
		waitABit(6000);
		
		 URL url = new URL(getDriver().getCurrentUrl());
	       HttpURLConnection connection = (HttpURLConnection)url.openConnection();
	       connection.setRequestMethod("GET");
	       connection.connect();

	       int code = connection.getResponseCode();
	       System.out.println(code);
	       if((code==404)||(code==400))
			{
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
	}
	
}

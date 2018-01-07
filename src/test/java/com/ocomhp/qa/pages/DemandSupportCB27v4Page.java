package com.ocomhp.qa.pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DemandSupportCB27v4Page extends PageObject
{
	@FindBy(xpath="//div[@class='cb27 cb27v4']")
    private WebElementFacade CTAbutton;
	
	
	public void scroll_down()
	{
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);",CTAbutton);
	}
	
	
	public void hover_on_ctabutton()
	{
		scroll_down();
		
		waitABit(4000);
		
		WebElement ele = getDriver().findElement(By.xpath("//div[@class='cb27 cb27v4']//a[@class='icn-arrowthn']"));
		Actions a =new Actions(getDriver());
		a.moveToElement(ele).perform();
	}
	
	   public void is_turn_white_color()
	   {
		  waitABit(4000);
		  WebElement ele1= getDriver().findElement(By.xpath("//div[@class='cb27 cb27v4']//a[@class='icn-arrowthn']"));
		  String ele = ele1.getCssValue("background-color");
		  System.out.println(ele);
		  if(ele.equals("rgba(255, 255, 255, 1)"))
		  {
			  Assert.assertTrue(true);
		  }
		  else if(ele.equals("rgb(255, 255, 255)"))
		  {
			  Assert.assertTrue(true);
		  }
		  else
		  {
			  Assert.assertTrue(false);
		  }
		  
	   }
	   
	   
	   public void click_on_CTA()
	   {
		   scroll_down();
		   
		    waitABit(3000);
		    
		    WebElement ele = getDriver().findElement(By.xpath("//div[@class='cb27 cb27v4']//a[@class='icn-arrowthn']"));
			JavascriptExecutor js = (JavascriptExecutor)getDriver();
			js.executeScript("arguments[0].click();", ele);
	   }
	   
	   public void is_navigate_events_page() throws IOException
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

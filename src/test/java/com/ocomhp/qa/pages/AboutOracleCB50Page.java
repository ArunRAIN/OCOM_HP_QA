package com.ocomhp.qa.pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class AboutOracleCB50Page extends PageObject
{
	@FindBy(xpath="//h2[text()='More About Oracle']")
    private WebElementFacade aboutoraclescrolldown;
	
	
	public void navigate_About_Oracle()
	{
		waitABit(3000);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);",aboutoraclescrolldown);
	}
	
	public void is_4_feature_areas_display()
	{
		List<WebElement> ele = getDriver().findElements(By.xpath("//div[@class='cb50w1 cwidth']//li"));
		if(ele.size()==4)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	public void is_feature_area_display()
	{
		navigate_About_Oracle();
	}
	
	public void navigate_back(String url)
	{
		waitABit(3000);
		getDriver().get(url);
	}
	
	public void click_feature_area() throws IOException
	{
		List<WebElement> ele = getDriver().findElements(By.xpath("//div[@class='cb50w1 cwidth']//li"));
		System.err.println(ele +"hi");
		 String url = getDriver().getCurrentUrl();
		for(int i=0;i<ele.size();i++)
		{
			int j = i+1;
			waitABit(4000);
			
			WebElement ele3 = getDriver().findElement(By.xpath("(//div[@class='cb50w1 cwidth']//li/a)["+j+"]"));
			JavascriptExecutor js = (JavascriptExecutor)getDriver();
			js.executeScript("arguments[0].click();", ele3);
			
			is_expected_page();
			
		   
			navigate_back(url);
			
		}
		
	}
	
	public void is_expected_page() throws IOException
	{
		
		
		waitABit(5000);
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

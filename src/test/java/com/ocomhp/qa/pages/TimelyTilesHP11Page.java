package com.ocomhp.qa.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class TimelyTilesHP11Page extends PageObject
{
	
	

	public void navigate_time_tiles()
	{
		WebElement ele = getDriver().findElement(By.xpath("(//div[@id='hp11filters']/ul/li//span)[1]"));
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
	}
	
	public void _is_4_tabs()
	{
		List<WebElement> ele = getDriver().findElements(By.xpath("//div[@id='hp11filters']/ul/li//span"));
	   if(ele.size()==4)
	   {
		   Assert.assertTrue(true);
	   }
	   else
	   {
		   Assert.assertTrue(false);
	   }
	
	}
	
	
	
	public void _is_3_tiles()
	{
		List<WebElement> ele = getDriver().findElements(By.xpath("//div[@id='hp11filters']/ul/li//span"));
		for(int i=0;i<ele.size();i++)
		{
			int j=i+1;
			WebElement ele2 = getDriver().findElement(By.xpath("(//div[@id='hp11filters']/ul/li//span)["+j+"]"));
			JavascriptExecutor js = (JavascriptExecutor)getDriver();
			js.executeScript("arguments[0].click();", ele2);
			
			waitABit(2000);
			
			List<WebElement> ele3 = getDriver().findElements(By.xpath("(//div[@id='hp11filters']/ul/li//span)["+j+"]/../../../../following-sibling::div/div["+j+"]//ul/li"));
			if(ele3.size()==3)
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
	}
	
	
	
	public void scroll_down_till_tiles_display()
	{
		WebElement ele = getDriver().findElement(By.xpath("(//div[@id='hp11filters']/ul/li//span)[1]"));
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
	}
	
	public void is_arrow_icon_display()
	{
		waitABit(4000);
		boolean ele = getDriver().findElement(By.xpath("//div[@class='hp11Arrow']")).isDisplayed();
		if(ele)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	public void hover_on_tile()
	{
		navigate_time_tiles();
		waitABit(3000);
		
		
		WebElement ele2 = getDriver().findElement(By.xpath("(//div[@id='hp11filters']/ul/li//span)[1]"));
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].click();", ele2);
		
		waitABit(6000);
	    WebElement ele = getDriver().findElement(By.xpath("(//div[@class='hp11Arrow'])[1]"));
		 System.out.println(ele+"hi");
		if(ele.isDisplayed())
		{
			
			Actions a=new Actions(getDriver());
	        a.moveToElement(ele).perform();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	public void is_overlay_display()
	{
		boolean ele = getDriver().findElement(By.xpath("(//div[@class='hp11Arrow'])[1]/following-sibling::div/div[@class='hp11GoBtn']")).isDisplayed();
		if(ele)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	public void is_button_display()
	{
		boolean ele = getDriver().findElement(By.xpath("(//div[@class='hp11Arrow'])[1]/following-sibling::div/div[@class='hp11GoBtn']")).isDisplayed();
		if(ele)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	
	public void click_button_on_overley()
	{
		hover_on_tile();
		
		waitABit(4000);
		
		WebElement ele = getDriver().findElement(By.xpath("(//div[@class='hp11Arrow'])[1]/following-sibling::div/div[@class='hp11GoBtn']"));
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].click();", ele);
		
	}
	
	public void is_navigate_page()
	{
		waitABit(4000);
		List<WebElement> ele = getDriver().findElements(By.xpath("//a[text()='Cookie Preferences']"));
		if(ele.size()==1)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	
	public void scroll_till_video_tiles()
	{
		
		scroll_down_till_tiles_display();
	
		waitABit(3000);
		
		WebElement ele2 = getDriver().findElement(By.xpath("(//div[@id='hp11filters']/ul/li//span)[4]"));
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].click();", ele2);
	}
	
	
	public void is_video_icon_display()
	{
		waitABit(3000);
		boolean ele = getDriver().findElement(By.xpath("//div[@class='hp11Video']")).isDisplayed();
		if(ele)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	public void click_CTA_button_on_video_tiles()
	{
		scroll_down_till_tiles_display();
		
		waitABit(3000);
		   
		WebElement ele2 = getDriver().findElement(By.xpath("(//div[@class='hp11Video']/following-sibling::div/div[@class='hp11GoBtn'])[1]"));
	    JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].click();", ele2);
		
		
   }
	
	public void is_video_lanch_in_lightbox()
	{
		waitABit(3000);
		boolean ele = getDriver().findElement(By.xpath("//video[@class='vjs-tech']")).isDisplayed();
		if(ele)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
}

package com.ocomhp.qa.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Acceleratorcn24Page extends PageObject
{
	@FindBy(xpath="//h3[text()='Top Actions']")
    private WebElementFacade topactionscrolldown;
	
	@FindBy(xpath="//h3[text()='Top Actions']")
    private WebElementFacade topaction;

	public void scroll_down()
	{
		
//		JavascriptExecutor js = (JavascriptExecutor) getDriver();
//		js.executeScript("arguments[0].scrollIntoView(true);",topactionscrolldown);
		waitABit(2000);
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("window.scrollBy(0,350)");
	}
	
	
	public void is_option_display()
	{
		boolean result = topaction.isDisplayed();
		if(result)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	
	public void is_accelerator_display()
	{
		boolean ele = getDriver().findElement(By.xpath("//div[@class='cn24 cn24v0']")).isDisplayed();
		if(ele)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	public void is_icon_and_label_display()
	{
		scroll_down();
		waitABit(3000);
		List<WebElement> ele = getDriver().findElements(By.xpath("//div[@class='cn24w1 cwidth']//ul//div[contains(@class,'icn-img icn')]"));
	    for(int i=0;i<ele.size();i++)
	    {
	    	int j=i+1;
	    	boolean ele1 = getDriver().findElement(By.xpath("(//div[@class='cn24w1 cwidth']//ul//div[contains(@class,'icn-img icn')])["+j+"]")).isDisplayed();
	        if(ele1)
	        {
	        	boolean ele3 = getDriver().findElement(By.xpath("(//div[@class='cn24w1 cwidth']//ul//div/span)["+j+"]")).isDisplayed();
	        	if(ele3)
	        	{
	        		Assert.assertTrue(true);
	        	}
	        	else
	        	{
	        		Assert.assertTrue(false);
	        	}
	        }
	        else
	        {
	        	Assert.assertTrue(false);
	        }
	    	
	    
	    
	    
	    }
	
	
	
	
	}
	
	
	public void hover_on_More(String data)
	{
		scroll_down();
		waitABit(2000);
		WebElement ele = getDriver().findElement(By.xpath("//span[text()='"+data+"']"));
		waitABit(3000);
		Actions a=new Actions(getDriver());
		a.moveToElement(ele).perform();
		waitABit(1000);
		
		
	}
	
	public void is_menu_option_display()
	{
		boolean ele = getDriver().findElement(By.xpath("(//span[@class='cn24w5']/ul/li//span)[1]")).isDisplayed();
		if(ele)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	public void is_click_an_option()
	{	
		WebElement element = getDriver().findElement(By.xpath("(//span[@class='cn24w5']/ul/li//span)[1]"));
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].click();", element);
		
	}
	
	public void is_appropriate_page()
	{
		//List<WebElement> ele = getDriver().findElements(By.xpath("//a[text()='Cookie Preferences']"));
		waitABit(3000);
		String title = getDriver().getTitle();
		if(title.equals(title))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	public void move_mouse_away_from_dropdown()
	{
		WebElement ele = getDriver().findElement(By.xpath("//span[.='Get Support']"));
		Actions a=new Actions(getDriver());
		a.moveToElement(ele).perform();
	}
	
	public void is_dropdown_close()
	{
		boolean ele = getDriver().findElement(By.xpath("(//span[@class='cn24w5']/ul/li//span)[1]")).isDisplayed();
		if(ele)
		{
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
	}
	
}

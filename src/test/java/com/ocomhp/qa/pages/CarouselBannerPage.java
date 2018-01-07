package com.ocomhp.qa.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CarouselBannerPage extends PageObject
{
	@FindBy(xpath="//ul[@class='slick-dots']/li/button[@aria-pressed='true']")
    private List<WebElementFacade> currentdotred;

	@FindBy(xpath="(//ul[@class='slick-dots']//button)[1]")
    private List<WebElementFacade> slide1;
	
	public void loading_page()
	{
		
	}
	public void maximie_browser()
	{
		//waitABit(2000);
		getDriver().manage().window().maximize();
	}
	
	public void is_slide_display()
	{
		//waitABit(3000);
		int count = slide1.size();
		if(count==1)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	
	public void is_dot_red()
	{
		int count = currentdotred.size();
		if(count==1)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	public void click_left_nav_arrows()
	{
		waitABit(3000);
		WebElement element = getDriver().findElement(By.xpath("//button[@class='slick-prev slick-arrow']"));
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].click();", element);
		
	}
	
	
	public void is_slide_navigate_to_previous_story()
	{
		
		int count = currentdotred.size();
		if(count==1)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	
	public void click_right_nav_arrows()
	{
		waitABit(3000);
		WebElement element = getDriver().findElement(By.xpath("//button[@class='slick-next slick-arrow']"));
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].click();", element);
		
	}
	
	
	public void is_slide_navigate_to_next_story()
	{
		
		int count = currentdotred.size();
		if(count==1)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
			
			
		}
	}
	
	public void expected_slide_display_3_or_more_than_3()
	{
		List<WebElement> count = getDriver().findElements(By.xpath("//ul[@class='slick-dots']//button"));
		
		if(count.size()>=3)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	
	
	
	
	public void navigate_page()
    {
	    waitABit(4000);
    	getDriver().navigate().to("https://www.oracle.com/index.html");
    }
  
   
	  public void is_expected_appropriate_page()
	   {
		  List<WebElement> ctacount = getDriver().findElements(By.xpath("//div[@class='slick-track']//a[@class='icn-arrowthn hp10btn']"));
		  
		  for(int i=0;i<ctacount.size();i++)
		  {
		   int j=i+1;
		   WebElement ele = getDriver().findElement(By.xpath("(//div[@class='slick-track']//a[@class='icn-arrowthn hp10btn'])["+j+"]"));
		   waitABit(3000);
		   JavascriptExecutor js = (JavascriptExecutor)getDriver();
	       js.executeScript("arguments[0].click();", ele);
	       
	       
	       is_expected_page();
	       
	       navigate_page();
		  }
		       
	   }
	  
	  public void is_expected_page()
	  {
		  waitABit(7000);
//		  //waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Cookie Preferences']")));
//		  int ele = getDriver().findElements(By.xpath("//a[contains(text(),'Terms of Use')]")).size();
//		    if(ele==1)
//			{        
//		    	Assert.assertTrue(true);
//			}
//			else
//			{
//				 Assert.assertTrue(false);
//			}
		  
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
   
  
	  public void hover_left_nav_arrows()
	   {
		   WebElement ele1 = getDriver().findElement(By.xpath("//button[@class='slick-prev slick-arrow']"));
		   waitABit(2000);
		   Actions a=new Actions(getDriver());
		   a.moveToElement(ele1).perform();
	   }
   public void is_turn_gray_color()
   {
	  waitABit(3000);
	  String ele = getDriver().findElement(By.xpath("//button[@class='slick-prev slick-arrow']")).getCssValue("background-color");
	  System.out.println(ele);
	  if(ele.equals("rgba(0, 0, 0, 0.2)"))
	  {
		  Assert.assertTrue(true);
	  }
	  else
	  {
		  Assert.assertTrue(false);
	  }
	  
   }
   
   public void hover_right_nav_arrows()
   {
	   WebElement ele1 = getDriver().findElement(By.xpath("//button[@class='slick-next slick-arrow']"));
	   waitABit(2000);
	   Actions a=new Actions(getDriver());
	   a.moveToElement(ele1).perform();
   }
   
   public void is_turn_Gray_color()
   {
	  waitABit(1000);
	  String ele = getDriver().findElement(By.xpath("//button[@class='slick-next slick-arrow']")).getCssValue("background-color");
	  System.out.println(ele);
	  if(ele.equals("rgba(0, 0, 0, 0.2)"))
	  {
		  Assert.assertTrue(true);
	  }
	  else
	  {
		  Assert.assertTrue(false);
	  }
	  
   }
   
   public void hover_on_CTA()
   {
//	   WebElement elewait = getDriver().findElement(By.xpath("(//div[@class='slick-track']//a[@class='icn-arrowthn hp10btn'])[1]"));
//	   waitFor(ExpectedConditions.visibilityOf(elewait));

	   
	   WebElement ele1 = getDriver().findElement(By.xpath("(//ul[@class='slick-dots']//button)[1]"));
	   JavascriptExecutor js = (JavascriptExecutor)getDriver();
       js.executeScript("arguments[0].click();", ele1);
       
       
       
		   WebElement ele = getDriver().findElement(By.xpath("(//div[@class='slick-track']//a[@class='icn-arrowthn hp10btn'])[1]"));
		   waitABit(3000);
		   Actions a=new Actions(getDriver());
				   a.moveToElement(ele).perform();
				   
				  // break;
	  
	  
	  
	   
	   
	  
   }
   
   
   public void is_turn_blue_color()
   {
	  waitABit(4000);
	  String ele = getDriver().findElement(By.xpath("(//div[@class='slick-track']//a[@class='icn-arrowthn hp10btn'])[1]")).getCssValue("background-color");
	  System.out.println(ele);
	  if(ele.equals("rgba(0, 117, 143, 1)"))
	  {
		  Assert.assertTrue(true);
	  }
	  else if(ele.equals("rgb(0, 117, 143)"))
	  {
		  Assert.assertTrue(true);
	  }
	  else
	  {
		  Assert.assertTrue(false);
	  }
	  
   }
   
   public void hover_on_dots()
   {
	       WebElement ele1 = getDriver().findElement(By.xpath("(//ul[@class='slick-dots']//button)[2]"));
	       JavascriptExecutor js = (JavascriptExecutor)getDriver();
	       js.executeScript("arguments[0].click();", ele1);
	       
	       
		   WebElement ele = getDriver().findElement(By.xpath("(//ul[@class='slick-dots']//button)[1]"));
		   waitABit(3000);
		   Actions a=new Actions(getDriver());
				   a.moveToElement(ele).perform();
				   
		 
	   
   }
   
   public void is_turn_white_color()
   {
	  waitABit(1000);
	  String ele = getDriver().findElement(By.xpath("(//ul[@class='slick-dots']//button)[1]")).getCssValue("background-color");
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
}

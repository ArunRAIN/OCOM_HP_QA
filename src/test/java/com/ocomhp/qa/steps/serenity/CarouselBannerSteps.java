package com.ocomhp.qa.steps.serenity;




import com.ocomhp.qa.pages.CarouselBannerPage;

import net.thucydides.core.annotations.Step;


public class CarouselBannerSteps 
{

	CarouselBannerPage CBpage;
	
	@Step
    public void is_the_home_page()
	{
		CBpage.open();
		
		
    }
	
	@Step
    public void maximie_browser()
	{
		CBpage.maximie_browser();
    }
	
	public void load_page()
	{
		CBpage.loading_page();
	}
	
    @Step
   	public void is_slide_display() 
   	{
       	CBpage.is_slide_display();
   	}
    
    @Step
   	public void is_dot_red() 
   	{
       	CBpage.is_dot_red();
   	}
    
    @Step
   	public void click_left_nav_arrows() 
   	{
       	CBpage.click_left_nav_arrows();
   	}
    
    @Step
   	public void is_slide_navigate_to_previous_story() 
   	{
       	CBpage.is_slide_navigate_to_previous_story();
   	}
    
    @Step
   	public void click_right_nav_arrows() 
   	{
       	CBpage.click_right_nav_arrows();
   	}

    @Step
   	public void is_slide_navigate_to_next_story() 
   	{
       	CBpage.is_slide_navigate_to_next_story();
   	}
    
    @Step
   	public void expected_slide_display_3_or_more_than_3() 
   	{
       	CBpage.expected_slide_display_3_or_more_than_3();
   	}
    
   
    @Step
   	public void is_expected_appropriate_page() 
   	{
       	CBpage.is_expected_appropriate_page();
       	
   	}
	
   
    @Step
   	public void hover_left_nav_arrows() 
   	{
       	CBpage.hover_left_nav_arrows();
       	
   	}
	
    @Step
   	public void is_turn_gray_color() 
   	{
       	CBpage.is_turn_gray_color();
       	
   	}
    
    @Step
   	public void hover_right_nav_arrows() 
   	{
       	CBpage.hover_right_nav_arrows();
       	
   	}
    
    @Step
   	public void is_turn_Gray_color() 
   	{
       	CBpage.is_turn_Gray_color();
       	
   	}
    
    @Step
   	public void hover_on_CTA() 
   	{
       	CBpage.hover_on_CTA();
       	
   	}
    
    @Step
   	public void is_turn_blue_color() 
   	{
       	CBpage.is_turn_blue_color();
       	
   	}
    
	public void hover_on_dots() 
   	{
       	CBpage.hover_on_dots();
       	
   	}
	public void is_turn_white_color() 
   	{
       	CBpage.is_turn_white_color();
       	
   	}
    
}

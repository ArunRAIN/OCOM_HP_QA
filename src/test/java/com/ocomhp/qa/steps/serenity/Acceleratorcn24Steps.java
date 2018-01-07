package com.ocomhp.qa.steps.serenity;

import java.awt.AWTException;

import com.ocomhp.qa.pages.Acceleratorcn24Page;

import net.thucydides.core.annotations.Step;


public class Acceleratorcn24Steps
{

	Acceleratorcn24Page Acpage;
	
	
	
	@Step
    public void is_scroll_down() throws AWTException
	{
		Acpage.scroll_down();
    }
	
	@Step
    public void is_topaction_links_display() 
	{
		Acpage.is_option_display();
    }
	
	@Step
    public void is_accelerator_display() 
	{
		Acpage.is_accelerator_display();
    }
	
	@Step
    public void is_icon_and_label_display() 
	{
		Acpage.is_icon_and_label_display();
    }
	
	@Step
    public void hover_on_More(String data) 
	{
		Acpage.hover_on_More(data);
    }
	
	
	@Step
    public void is_menu_option_display() 
	{
		Acpage.is_menu_option_display();
    }
	

	@Step
    public void is_click_an_option() 
	{
		Acpage.is_click_an_option();
    }
	

	@Step
    public void is_appropriate_page() 
	{
		Acpage.is_appropriate_page();
    }

	@Step
    public void move_mouse_away_from_dropdown() 
	{
		Acpage.move_mouse_away_from_dropdown();
    }
	
	@Step
    public void is_dropdown_close() 
	{
		Acpage.is_dropdown_close();
    }
	
}

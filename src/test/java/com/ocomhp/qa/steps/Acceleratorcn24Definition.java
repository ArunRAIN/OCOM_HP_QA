package com.ocomhp.qa.steps;

import java.awt.AWTException;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.ocomhp.qa.steps.serenity.Acceleratorcn24Steps;

import net.thucydides.core.annotations.Steps;


public class Acceleratorcn24Definition
{
	@Steps
	Acceleratorcn24Steps ACStep;
	
	

	@When("User scrolls down")
    public void Userscrollsdown() throws AWTException 
	{
		ACStep.is_scroll_down();
	}
	
	@Then("User must see top actions links")
	public void Usermustseetopactionslinks()
	{
		ACStep.is_topaction_links_display();
	}
	
	@When("User view accelerator")
	public void Userviewaccelerator()
	{
		ACStep.is_accelerator_display();
	}
	
	@Then("each top actions must have an icon and label below it")
	public void eachtopactionsmusthaveaniconandlabelbelowit()
	{
		ACStep.is_icon_and_label_display();
	}
	
	@When("User hovers over '$data' menu")
	public void UserhoversoverMoremenu(String data)
	{
		ACStep.hover_on_More(data);
	}
	
	@Then("menu dropdown panel must open showing options")
	public void menudropdownpanelmustopenshowingoptions()
	{
		ACStep.is_menu_option_display();
	}
	
	@Then("User clicks option on menu")
	public void Userclicksoptiononmenu()
	{
		ACStep.is_click_an_option();
	}
	
	@Then("User checks must navigate to appropriate page")
	public void Userchecksmustnavigatetoappropriatepage()
	{
		ACStep.is_appropriate_page();
	}
	
	@Then("User points the mouse away from the dropdown")
	public void Userpointsthemouseawayfromthedropdown()
	{
		ACStep.move_mouse_away_from_dropdown();
	}
	
	
	@Then("the dropdown panel must close")
	public void thedropdownpanelmustclose()
	{
		ACStep.is_dropdown_close();
	}
	
}

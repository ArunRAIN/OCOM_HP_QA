package com.ocomhp.qa.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.ocomhp.qa.steps.serenity.CarouselBannerSteps;

import net.thucydides.core.annotations.Steps;


public class CarouselBannerDefinition 
{
	@Steps
	CarouselBannerSteps CBStep;

	@Given("User on the home page")
    public void Useronthehomepage() 
	{
		 CBStep.is_the_home_page();
		 CBStep.maximie_browser();
		// CBStep.load_page();
	}
    
    @When("Story slide is in view")
	public void Storyslideisinview()
	{
    	CBStep.is_slide_display();
	}
    
    @Then("corresponding place dot turn red in color")
	public void correspondingplacedotturnredincolor()
	{
    	CBStep.is_dot_red();
	}

    
    @When("User clicks on the left nav arrows")
	public void Userclicksontheleftnavarrows()
	{
    	CBStep.click_left_nav_arrows();
	}
    
    @Then("slide navigates to previous story")
	public void slidenavigatestopreviousandnextstory()
	{
    	CBStep.is_slide_navigate_to_previous_story();
	}
    
    @When("User clicks on the right nav arrows")
	public void Userclicksontherightnavarrows()
	{
    	CBStep.click_right_nav_arrows();
	}
    
    @Then("slide navigates to next story")
	public void slidenavigatestonextstory()
	{
    	CBStep.is_slide_navigate_to_next_story();
	}
    
    @When("User see 3 or more than 3 story slides")
    public void User_see_3_or_more_than_3_story_slides()
    {
    	CBStep.expected_slide_display_3_or_more_than_3();
    }
    
    @Then("User clicks on CTA in each slide in the story slide must navigate to appropriate page")
	public void User_clicks_on_CTA_in_each_slide_in_the_story_slide_must_navigate_to_appropriate_page()
	{
    	CBStep.is_expected_appropriate_page();
	}
    
    @When("User hovers over left nav arrows")
    public void Userhoversoverleftnavarrows()
    {
    	CBStep.hover_left_nav_arrows();
    }
    
    @Then("User see the background of the arrow must turn gray")
    public void Userthebackgroundofthearrowmustturngray()
    {
    	CBStep.is_turn_gray_color();
    }
    
    @Then("User hovers over right nav arrows also")
    public void Userhoversoverrightnavarrowsalso()
    {
    	CBStep.hover_right_nav_arrows();
    }
    
    @Then("User see the background of the arrow must turn Gray")
    public void UserseethebackgroundofthearrowmustturnGray()
    {
    	CBStep.is_turn_Gray_color();;
    }
    
    @When("User hovers over CTA button")
    public void UserhoversoverCTAbutton()
    {
    	CBStep.hover_on_CTA();
    }
    
    @Then("User see the background of the button must turn blue in color")
    public void Userseethebackgroundofthebuttonmustturnblueincolor()
    {
    	CBStep.is_turn_blue_color();
    }
    
    @When("User hovers over place dots")
    public void Userhoversoverplacedots()
    {
    	CBStep.hover_on_dots();
    }
    
    
    @Then("place dot must turn white in color")
    public void placdotmustturnwhiteincolor()
    {
    	CBStep.is_turn_white_color();
    }
}

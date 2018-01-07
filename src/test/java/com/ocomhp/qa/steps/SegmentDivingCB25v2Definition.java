package com.ocomhp.qa.steps;

import java.io.IOException;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.ocomhp.qa.steps.serenity.SegmentDivingCB25v2Steps;

import net.thucydides.core.annotations.Steps;


public class SegmentDivingCB25v2Definition 
{
	@Steps
	SegmentDivingCB25v2Steps SDStep;

	
    
    @When("User hovers over the links")
	public void Userhoversoverthelinks()
	{
    	SDStep.hover_on_links();
	}
    
    @Then("the link must be underlined")
    public void thelinkmustbeunderlined()
    {
    	SDStep.is_link_underlined();
    }
    
    @When("User clicks on segment link")
    public void Userclicksonsegmentlink()
    {
    	SDStep.click_on_segmentlink();
    }
    
    @Then("User must navigate to the segment page")
    public void Usermustnavigatetothesegmentpage() throws IOException
    {
    	SDStep.is_navigate_segment_page();
    }

}

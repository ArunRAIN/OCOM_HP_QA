package com.ocomhp.qa.steps;

import java.io.IOException;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.steps.Parameters;

import com.ocomhp.qa.steps.serenity.AboutOracleCB50Steps;

import net.thucydides.core.annotations.Steps;


public class AboutOracleCB50Definition 
{
	@Steps
	AboutOracleCB50Steps AOStep;

	@When("User navigates to About Oracle")
    public void WhenUsernavigatestoAboutOracle()  
	{
		AOStep.navigate_About_Oracle();
	}

	@Then("User must see 4 featured areas")
	public void ThenUsermustsee4featuredareas()
	{
		AOStep.is_4_feature_areas_display();
	}
	
	@When("User see featured area")
	public void Userseefeaturedarea()
	{
		AOStep.is_feature_area_display();
	}
	
	@Then("User must navigate to the featured page")
	public void Usermustnavigatetothefeaturedpage() throws IOException
	{
		AOStep.is_expected_page();	  
	}
}

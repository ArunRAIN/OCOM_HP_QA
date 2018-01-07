package com.ocomhp.qa.steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.ocomhp.qa.steps.serenity.TimelyTilesHP11Steps;

import net.thucydides.core.annotations.Steps;


public class TimelyTilesHP11Definition 
{
	@Steps
	TimelyTilesHP11Steps tmStep;

	
	@When("User navigates to timely tiles")
	public void Usernavigatestotimelytiles()
	{
		tmStep.navigate_time_tiles();
	}
	
	@Then("User must see 4 tabs")
	public void Usermustsee4tabs()
	{
		tmStep.is_4_tabs();
	}
	
	@Then("on each tab user must see 3 tiles")
	public void oneachtabusermustsee3tiles()
	{
		tmStep._is_3_tiles();
	}
	
	@When("User can view next page tiles")
	public void Usercanviewnextpagetiles()
	{
		tmStep.next_page_tiles_display();
	}
	
	@Then("the tile must have arrow icon")
	public void Thenthetilemusthavearrowicon()
	{
		tmStep.is_arrow_icon_display();
	}
	
	
	@When("User hover on the Tiles which have arrow")
	public void UserhoverontheTileswhichhavearrow()
	{
		tmStep.hover_on_tile();
	}
	
	@Then("User see overlay appears on the tile")
	public void Userseeoverlayappearsonthetile()
	{
		tmStep.is_overlay_display();
	}
	
	@Then("on the overlay must have a button")
	public void ontheoverlaymusthaveabutton()
	{
		tmStep.is_button_display();
	}
	
	@When("User clicks on CTA button on the overlay")
	public void UserclicksonCTAbuttonontheoverlay()
	{
		tmStep.click_button_on_overley();
	}
	
	@Then("User see must navigate to new page")
	public void Userseemustnavigatetonewpage()
	{
		tmStep.is_navigate_page();	
	}
	
	
	@When("User can view video tiles")
	public void Usercanviewvideotiles()
	{
		tmStep.is_video_tiles_in_view();
	}
	
	@Then("the tile must have play icon")
	public void thetilemusthaveplayicon()
	{
		tmStep.is_video_icon_display();
	}
	
	@When("User clicks CTA button on video tiles")
	public void UserclicksCTAbuttononvideotiles()
	{
		tmStep.click_CTA_button_on_video_tiles();
	}
	
	@Then("the video must launch in a lightbox")
	public void thevideomustlaunchinalightbox()
	{
		tmStep.is_video_lanch_in_lightbox();
	}
}

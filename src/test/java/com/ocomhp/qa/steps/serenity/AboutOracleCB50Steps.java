package com.ocomhp.qa.steps.serenity;



import java.io.IOException;

import com.ocomhp.qa.pages.AboutOracleCB50Page;

import net.thucydides.core.annotations.Step;


public class AboutOracleCB50Steps 
{

	AboutOracleCB50Page AOpage;
	

	@Step
    public void navigate_About_Oracle()
	{
		AOpage.navigate_About_Oracle();
    }

	
	@Step
    public void is_4_feature_areas_display()
	{
		AOpage.is_4_feature_areas_display();
    }
	
	@Step
    public void is_feature_area_display()
	{
		AOpage.is_feature_area_display();
    }
	
	@Step
    public void is_expected_page() throws IOException
	{
		AOpage.click_feature_area();
    }
	
}

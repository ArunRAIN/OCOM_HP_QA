package com.ocomhp.qa.steps.serenity;





import com.ocomhp.qa.pages.TimelyTilesHP11Page;

import net.thucydides.core.annotations.Step;


public class TimelyTilesHP11Steps 
{
	TimelyTilesHP11Page TMpage;
	
	@Step
    public void navigate_time_tiles()
	{
		TMpage.navigate_time_tiles();
    }
	
	@Step
    public void is_4_tabs()
	{
		TMpage._is_4_tabs();
    }
	
	@Step
    public void _is_3_tiles()
	{
		TMpage._is_3_tiles();
    }
	
	
	@Step
    public void next_page_tiles_display()
	{
		TMpage.scroll_down_till_tiles_display();
    }
	
	@Step
    public void is_arrow_icon_display()
	{
		TMpage.is_arrow_icon_display();
    }
	
	
	
	@Step
    public void hover_on_tile()
	{
		TMpage.hover_on_tile();
    }
	
	@Step
    public void is_overlay_display()
	{
		TMpage.is_overlay_display();
    }
	
	@Step
    public void is_button_display()
	{
		TMpage.is_button_display();
    }
	
	@Step
    public void click_button_on_overley()
	{
		TMpage.click_button_on_overley();
    }
	
	@Step
    public void is_navigate_page()
	{
		TMpage.is_navigate_page();
    }
	
	@Step
    public void is_video_tiles_in_view()
	{
		TMpage.scroll_till_video_tiles();
    }
	@Step
    public void is_video_icon_display()
	{
		TMpage.is_video_icon_display();
    }
	
	@Step
    public void click_CTA_button_on_video_tiles()
	{
		TMpage.click_CTA_button_on_video_tiles();
    }
	
	
	
	@Step
    public void is_video_lanch_in_lightbox()
	{
		TMpage.is_video_lanch_in_lightbox();
    }
}

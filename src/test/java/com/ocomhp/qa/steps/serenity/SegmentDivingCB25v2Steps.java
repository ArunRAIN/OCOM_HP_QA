package com.ocomhp.qa.steps.serenity;



import java.io.IOException;

import com.ocomhp.qa.pages.SegmentDivingCB25v2Page;

import net.thucydides.core.annotations.Step;


public class SegmentDivingCB25v2Steps 
{
	SegmentDivingCB25v2Page SDpage;
	
	@Step
    public void hover_on_links()
	{
		SDpage.hover_on_links();
    }
	
	@Step
    public void is_link_underlined()
	{
		SDpage.is_link_underlined();
    }
	
	@Step
    public void click_on_segmentlink()
	{
		SDpage.click_on_segmentlink();
    }

	@Step
    public void is_navigate_segment_page() throws IOException
	{
		SDpage.is_navigate_segment_page();
    }

}

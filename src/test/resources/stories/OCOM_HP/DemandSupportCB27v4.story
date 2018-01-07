DemandSupportCB27v4

Narrative:					 
In order to navigate to an event page
As a user
I want to click on the CTA button

eta:@skip

Scenario: CTA Background color
Given User on the home page
When User hover on CTA button
Then User must see backgroundcolor change to white

Scenario: Navigate to event page
Given User on the home page
When User clicks on CTA button
Then User must navigate to the events page
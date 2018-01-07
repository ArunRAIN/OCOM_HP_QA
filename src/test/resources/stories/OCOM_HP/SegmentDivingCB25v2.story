SegmentDivingCB25v2

Narrative:
In order to view the selected item
As a user
I want to able to view text underlined on hoverover

eta:@skip

Scenario: Hoverover the hyperlinks
Given User on the home page
When User hovers over the links
Then the link must be underlined

Scenario: Navigate to segment page
Given User on the home page
When User clicks on segment link
Then User must navigate to the segment page

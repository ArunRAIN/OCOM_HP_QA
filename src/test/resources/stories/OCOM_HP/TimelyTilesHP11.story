TimelyTilesHP11

Narrative:
In order to communicate effectively to the business some functionality
As a development team
I want to use Behaviour-Driven Development

Meta:@skip


Scenario: TimelyTilesHP11 -CTA navigating to new page
Given User on the home page
When User clicks on CTA button on the overlay
Then User see must navigate to new page


Scenario: TimelyTilesHP11 -Carousel Banner - Navigate through stories using nav arrows
Given User on the home page
When User clicks on the left nav arrows
Then slide navigates to previous story
When User clicks on the right nav arrows
Then slide navigates to next story


Scenario: TimelyTilesHP11- Carousel Banner - Nav arrows - Hover over state
Given User on the home page
When User hovers over left nav arrows
Then User see the background of the arrow must turn gray
Then User hovers over right nav arrows also
Then User see the background of the arrow must turn Gray


Scenario: TimelyTilesHP11 - Carousel Banner - Place dots - Hover over state
Given User on the home page
When User hovers over place dots
Then place dot must turn white in color

Scenario: TimelyTilesHP11- Timely tiles tabs
Given User on the home page
When User navigates to timely tiles
Then User must see 4 tabs 
Then on each tab user must see 3 tiles

Scenario: TimelyTilesHP11 - Tiles with arrow icon
Given User on the home page
When User can view next page tiles
Then the tile must have arrow icon

Scenario: TimelyTilesHP11 - Tiles with arrow must have CTA button
Given User on the home page
When User hover on the Tiles which have arrow
Then User see overlay appears on the tile
Then on the overlay must have a button




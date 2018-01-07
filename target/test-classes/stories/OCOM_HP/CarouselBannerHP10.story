CarouselBannerHP10

Narrative:
In order to view stories
As a user
I want to view slides auto rotating

eta:@skip


Scenario: Carousel Banner - View each story slide
Given User on the home page
When User see 3 or more than 3 story slides 
Then User clicks on CTA in each slide in the story slide must navigate to appropriate page

Scenario: Carousel Banner - Stories auto rotate
Given User on the home page
When Story slide is in view
Then corresponding place dot turn red in color

Scenario: Carousel Banner - Navigate through stories using nav arrows
Given User on the home page
When User clicks on the left nav arrows
Then slide navigates to previous story
When User clicks on the right nav arrows
Then slide navigates to next story

Scenario: Carousel Banner - Nav arrows - Hover over state
Given User on the home page
When User hovers over left nav arrows
Then User see the background of the arrow must turn gray
Then User hovers over right nav arrows also
Then User see the background of the arrow must turn Gray

Scenario: Carousel Banner - Place dots - Hover over state
Given User on the home page
When User hovers over place dots
Then place dot must turn white in color


Scenario: Carousel Banner - CTA button - Hover over state
Given User on the home page
When User hovers over CTA button
Then User see the background of the button must turn blue in color
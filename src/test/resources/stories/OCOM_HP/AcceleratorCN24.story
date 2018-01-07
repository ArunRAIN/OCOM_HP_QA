AcceleratorCN24

Narrative:
In order to view popular OCOM page links
As a user
I want to see the “Top Action” links

eta:@skip

Scenario: Top Actions - Scroll down the page to view Top Actions
Given User on the home page
When User scrolls down
Then User must see top actions links

Scenario: Top Actions - links and icons
Given User on the home page
When User view accelerator
Then each top actions must have an icon and label below it

Scenario: Top Actions - “More” menu
Given User on the home page   
When User hovers over 'More' menu
Then menu dropdown panel must open showing options


Scenario: Top Actions – expanded “More” menu 
Given User on the home page  
When User hovers over 'More' menu
Then User clicks option on menu
Then User checks must navigate to appropriate page

Scenario: Top Actions – hover over state - “More” menu     
Given User on the home page  
When User hovers over 'More' menu
Then User points the mouse away from the dropdown
Then the dropdown panel must close
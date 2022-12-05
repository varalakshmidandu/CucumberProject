@Regression
Feature: Background color change

@Scenario1
Scenario:1 Sky Blue Background 
Given "Set SkyBlue Background" button exists 
When I click on the button As "Set SkyBlue Background"
Then the background color will change to sky blue
@Scenario2 
Scenario:2 White Background Change 
Given "Set White Background" button exists 
When I click on the button As "Set White Background"
Then the background color will change to white
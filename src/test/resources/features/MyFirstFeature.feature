
Feature: Login to the application

  Scenario: Login to the application successful
  
    Given Login page is displayed
    When user enters "<username>" username
    And user enters "<password>" password
    And user enters age and location
    |Age     |Location|
    |below 18|India   |
    |above 18|Canada  |
    And user clicks on login button
    Then user "<loginType>" successfully log in
    And homepage "<homepage>" be displayed

  Scenario Outline: Login to the application unsuccessful
  
    Given Login page is displayed
    When user enters "<username>" username
    And user enters "<password>" password
    And user clicks on login button
    Then user "<loginType>" successfully log in
    And homepage "<homepage>" be displayed
    
    
    Examples:
 |username | password | loginType |homepage|
 | valid   | valid    | should    | must   |
 | invalid | invalid  | shouldnot |mustnot |
				
				
				
				
# In a single execution, Scenario is executed only once whereas Scenario outline (For similar data trace) can be executed multiple times depending upon the data provided as Example
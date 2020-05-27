@Anisha
Feature: Facebook account creation

  Scenario Outline: Facebook account creation using email
    Given user has opened the url facebook.com
    When user enters firstname "<firstname>" and surname "<surname>" for account creation
    And user enters email "<email>",email_verify "<email_verify>" and password "<password>" for account creation
    And user enters dob_date "<dob_date>", dob_month "<dob_month>", dob_year "<dob_year>" and gender "<gender>" for account creation
    And user clicks on Sign Up
    And user enters security code
    Then Facebook account must be created with success message
  
  Scenario Outline: Facebook account creation using mobileno
    Given user has opened the url facebook.com
    When user enters firstname "<firstname>" and surname "<surname>" for account creation
    And user enters email "<email>",email_verify "<email_verify>" and password "<password>" for account creation
    And user enters dob_date "<dob_date>", dob_month "<dob_month>", dob_year "<dob_year>" and gender "<gender>" for account creation
    And user clicks on Sign Up
    And user enters security code
    Then Facebook account must be created with success message

    Examples: 
      | firstname | surname | email          | email_verify   | password  | dob_date | dob_month | dob_year | gender |
      | johnny    | james   |     7654378755 |                | anishapwd |        8 | Oct       |     1989 |      2 |
      | jady      | james   | test@gmail.com | test@gmail.com | anishapwd |        8 | Oct       |     1989 |      1 |

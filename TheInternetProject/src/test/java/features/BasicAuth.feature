Feature: To pass basic authentication
  
  Background: 
    Given the user navigates to homepage
    
    Scenario:
      And the user clicks on the "Basic Auth" link
      And the user should see "Sign in"
      And the user enters "admin" in prompt field
      And the user enters "admin" in prompt field
      And the user clicks on Sign in button
      Then the user can see "Congratulations! You must have the proper credentials." text



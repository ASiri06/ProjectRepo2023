Feature: To pass basic authentication
  
  Background: 
    Given the user navigates to homepage
    
    Scenario:
      And the user clicks on the "Basic Auth" link
      And the user enters "admin" in username field
      And the user enters "admin" in password field
      And the user clicks on Sign in button
      Then the user can see "Congratulations! You must have the proper credentials." text



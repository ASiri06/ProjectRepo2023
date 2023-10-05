Feature: To pass basic authentication
  
  Background: 
    Given the user navigates to homepage

    @SmokeTest
    Scenario: To sign in with valid credentials
      And the user clicks on the "Basic Auth" link
      And the user enters  "admin" in username field and enters "admin" in password field
      Then the user can see "Congratulations! You must have the proper credentials." text



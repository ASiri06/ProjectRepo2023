Feature: Verify dropdown options

  Background:
    Given the user navigates to the homepage
    And the user login with "standard_user" username and "secret_sauce" password
#    When the user enters "standard_user" in username field
#    And the user enters and "secret_sauce" in password field
#    And the user click on the login button

    Scenario Outline:
      When the user select "<option>" from the dropdown list
      Then the user should see the "<option>" option is selected in the dropdown list

      Examples:
      |option|
      | Name (A to Z)|
      | Name (Z to A)|
      | Price (low to high)|
      | Price (high to low)|
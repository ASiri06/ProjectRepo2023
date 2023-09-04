Feature: Verify form authentication for standard_user

 Background:
  Given the user navigates to the homepage

   @SmokeTest
  Scenario: 1 Verify login for standard user with valid credentials

    When the user enters "standard_user" in username field
    And the user enters and "secret_sauce" in password field
    And the user click on the login button
    Then the user should see text "Products"

  @SmokeTest
    Scenario: 2 Verify login for standard user with invalid password

      When the user enters "standard_user" in username field
      And the user enters and "secret-sauce" in password field
      And the user click on the login button
      Then the user should see text "Epic sadface: Username and password do not match any user in this service"


  @RegressionTest
      Scenario: 3 Verify login for standard user with invalid username
        When the user enters "standard-user" in username field
        And the user enters and "secret_sauce" in password field
        And the user click on the login button
        Then the user should see text "Epic sadface: Username and password do not match any user in this service"

        Scenario: 4 Verify login for standard user with missing password

          When the user enters "standard-user" in username field
          And the user enters and "" in password field
          And the user click on the login button
          Then the user should see text "Epic sadface: Password is required"

          Scenario: 5 Verify login for standard user with missing username
            When the user enters "" in username field
            And the user enters and "secret_sauce" in password field
            And the user click on the login button
            Then the user should see text "Epic sadface: Username is required"

  Scenario: 6 Verify login for standard user with missing username and password
    When the user enters "" in username field
    And the user enters and "" in password field
    And the user click on the login button
    Then the user should see text "Wrong credentials"

@SmokeTest
  Scenario Outline: 7.Verify form authentication with data driven

    When the user login with "<username>" username and "<password>" password
    Then the user see text "<expectedData>" on the page

    Examples:
      | username     | password     | expectedData |
      | standard_user| secret_sauce | Products  |
      | standard_user| secret-sauce | Epic sadface: Username and password do not match any user in this service  |
      | standard-user| secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | standard_user|              | Epic sadface: Password is required  |
      |              | secret_sauce | Epic sadface: Username is required |
      |              |              | Epic sadface: Username is required |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out. |
      | locked-out-user | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | locked_out_user | secret-sauce | Epic sadface: Username and password do not match any user in this service |
      | locked_out_user |              | Epic sadface: Password is required |
      |                 | secret_sauce | Epic sadface: Username is required |
      |                 |              | Epic sadface: Username is required |















Feature: Verify form authentication for standard_user

 Background:
  Given the user navigates to the homepage

  Scenario: 1 Verify login for standard user with valid credentials

    When the user enters "standard_user" in username field
    And the user enters and "secret_sauce" in password field
    And the user click on the login button
    Then the user should see text "Products"

    Scenario: 2 Verify login for standard user with invalid password

      When the user enters "standard_user" in username field
      And the user enters and "secret-sauce" in password field
      And the user click on the login button
      Then the user should see text "Epic sadface: Username and password do not match any user in this service"

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
    Then the user should see text "Epic sadface: Username is required"














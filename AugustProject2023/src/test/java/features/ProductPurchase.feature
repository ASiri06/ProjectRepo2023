Feature: Verify the product can be purchased by logged in user

  Background:
    Given the user navigates to the homepage
    And the user login with "standard_user" username and "secret_sauce" password

    @RegressionTest
    Scenario: 1 Purchasing product from PLP

      And the user click on “Add to cart” button
      And the user click on the cart icon
      And the user clicks on Checkout button
      And the user enters "Anna"  in name field
      And the user enters "Siri"  in surname field
      And the user enters "W37PL"  in zip postal code field
      And the user clicks on the continue button
      And the user clicks on the Finish button
      Then the user should see "Thank you for your order!" text

      @RegressionTest
      Scenario: 2.Purchasing product from PDP page

        When user clicks on Sauce Labs Back Pack link
        And the user click on “Add to cart” button
        And the user click on the cart icon
        And the user clicks on Checkout button
        And the user enters "Anna"  in name field
        And the user enters "Siri"  in surname field
        And the user enters "W37PL"  in zip postal code field
        And the user clicks on the continue button
        And the user clicks on the Finish button
        Then the user should see "Thank you for your order!" text



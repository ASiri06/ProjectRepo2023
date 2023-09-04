Feature: Verify that product can be added to the cart

  Background:
    Given the user navigates to the homepage
    And the user login with "standard_user" username and "secret_sauce" password

    Scenario: 1. Adding the Sauce Back Pack to cart using Add to cart button on Product Listing Page

      When the user click on “Add to cart” button

      And the user click on the cart icon
      Then the user should see "Sauce Labs Backpack" on the cart page

      Scenario: 2. Adding the Sauce Back Pack to cart using Add to cart button on Product Description Page

        When user clicks on Sauce Labs Back Pack link
        And the user click on “Add to cart” button
        And the user click on the cart icon
        Then the user should see "Sauce Labs Backpack" on the cart page

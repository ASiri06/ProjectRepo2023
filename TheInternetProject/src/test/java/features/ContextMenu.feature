Feature: Verify the context menu triggers alert

  Scenario: 1. To select the box and accept pop up alert

    Given the user navigates to homepage
    And the user clicks on the "Context Menu" link
    And the user can see "Context Menu" text
    And the user right click on the box
    And the user see "You selected a context menu" text in the alert
    Then the user accepts the alert
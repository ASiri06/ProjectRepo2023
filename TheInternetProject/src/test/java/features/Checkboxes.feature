Feature: To verify that checkboxes can be clicked
  
  Scenario: 1. To click the checkbox 1
    Given the user navigates to homepage
    And the user clicks on the "Checkboxes" link
    And the user clicks on the checkbox1
    Then the checkbox1 is selected

    Scenario: 2.To click on check box 2
      Given the user navigates to homepage
      And the user clicks on the "Checkboxes" link
      And the user clicks on the checkbox2
      Then the checkbox2 is not selected

Scenario: 3. To click on checkbox 2 twice
  Given the user navigates to homepage
  And the user clicks on the "Checkboxes" link
  And the user clicks on the checkbox2
  And the user clicks on the checkbox2
  Then the checkbox2 is selected

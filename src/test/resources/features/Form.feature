@fill_form
Feature: As a user I want to fill the vehicle form

  @fill_sample_form
  Scenario: Fill a form with all information, click next and make sure of confirmation
    Given the user go to the site
    And the user fill the Enter Vehicle Data form
    And the user fill the Enter Insurant Data form
    And the user fill the Enter Product Data form
    And the user fill the Select Price Option form
    And the user fill the Send Quote form
    Then the user validate the e-mail success in the screen

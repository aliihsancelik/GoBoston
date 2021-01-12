


@plan
Feature: Trip Planning

    Scenario: Check planning a trip functionality
      Given I am on "All-Inclusive" Page
      When I navigate to Plan your trip Page
      And I fill the user information and click the Get Your Guidebook button
      Then I should be able to download my guidebook

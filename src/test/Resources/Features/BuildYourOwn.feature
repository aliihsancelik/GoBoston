


  Feature: Build your own functionality

    @build
    Scenario: Check the Build your own functionality until payment page
      Given I am on "All-Inclusive" Page
      When I navigate to Build Your Own Page
      And I add first attraction to cart then click checkout
      And I choose the date "29" for the current month and continue to payment
      Then I should be on "payment method" page
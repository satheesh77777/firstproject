Feature: login
  Scenario: logging into page
    Given I navigate to webBrowser
    When  I navigate to facebook home page
   Then  I Click on Login or sign Up
  When I Enters Username and password
    Then I Click login button
    And I close the browser

    Scenario: logging in flipkart
      Given I navigate to webBrowser
      When I navigate to flipkart
      Then I Click on Login
      And I enters mobile number
      Then I Click Request otp





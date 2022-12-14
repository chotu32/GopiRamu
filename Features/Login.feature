Feature: MyBeepr Web-Login

  @test
  Scenario Outline: Verify login functionality of MyBeepr
    Given I navigate to "<url>"
    When I enter user "<userName>"
    And I enter pswd "<passoword>"
    And I click on Sign in button
    Then I navigate to dashboard page
    Then I close browser instance

    Examples: 
      | url | userName      | passoword     |
      | url | validUsername | validPassword |

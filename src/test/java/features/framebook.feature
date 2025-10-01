Feature: Framebook Selenium with TestNG

  Scenario: Handling Frames
    Given I am on Frames page
    When I switch inside frame
    Then I should read frame text

  Scenario: Handling Alerts
    Given I am on Alerts page
    When I click alert button
    Then I accept alert

  Scenario: Handling Mouse Popup
    Given I am on Mouse Popup page
    When I hover on menu
    Then I see popup
# Created by jtailor at 2023/05/24
Feature: This is a demo feature file
  This demo feature file is only opening a chrome browser instance.

  @test_1
  Scenario: Google search
    Given User opens a URL "https://www.google.co.za"
    When User enter "Selemium hq" in search window
    And User click the search button
    And User click the selenium link
    Then User validate page title is "Selenium"
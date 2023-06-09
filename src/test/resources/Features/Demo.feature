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

  @test_2
  Scenario Outline: Google search for multiple items
    Given User opens a URL "https://www.google.co.za"
    When User enter text "<searchText>" in search window
    And User click the search button
    And User click on "<searchText>" wikipedia link
    Then User validate the "<pageTitle>"
    Examples:
      | searchText   | pageTitle          |
      | Apple Fruit  | Apple - Wikipedia  |
      | Banana Fruit | Banana - Wikipedia |
      | Orange Fruit | Orange - Wikipedia |
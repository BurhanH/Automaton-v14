Feature: Search on DuckDuckGo
    
Scenario Outline: Search on DuckDuckGo by term
    Given home page of DuckDuckGo
    When user enters "<term>" word and clicks search button
    Then user gets results
    And the page title should start with "<term>"

    Examples:
    | term       | 
    | DuckDuckGo |
    | Java       |
    | Cucumber   |
    | Selenium   |
    | Maven      |

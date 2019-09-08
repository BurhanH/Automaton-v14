# Automaton-v14
Automation framework (UI) - an example. Based on Java, Junit, Cucumber, Selenium, PageFactory

[![GitHub](https://img.shields.io/github/license/mashape/apistatus.svg)](https://github.com/BurhanH/automaton-v14/blob/master/LICENSE)
[![Build Status](https://travis-ci.org/BurhanH/Automaton-v14.svg?branch=master)](https://travis-ci.org/BurhanH/Automaton-v14)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/916e426250074c64bbb7db8744542181)](https://www.codacy.com/manual/BurhanH/Automaton-v14?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=BurhanH/Automaton-v14&amp;utm_campaign=Badge_Grade)

## Quick review
This is almost fully functional testing framework based on Java programmming language, Cucumber, and Selenium.

Main points:
- Uses POM (Page Object Model), PageFactory, DriverFactoryUtil. 
- Automatically adds a screenshot into test report if there is falure in a scenario.
- Supports by default 2 most popular browsers, you may extend this behaviour via adding new driver into DriverFactoryUtil class.

## Requirements
JDK 12, Junit 4.12, Cucumber 4.2.6, <br>
Selenium 3.141.59, gekodriver 0.24.0, chromedriver 76.0.3809.126, <br>
Mozilla Firefox 69.0, Google Chrome 76.0.3809.132, <br>
Maven (software project management) <br>

## Project structure
```text
-- automaton-v14
   |-- .gitignore
   |-- .travis.yml
   |-- LICENSE
   |-- pom.xml
   |-- README.md
   `-- src
       `-- test
           `-- java
               `-- cucumberselenium
                  |-- RunCucumberTest.java
                  |-- Steps.java
                  |-- DriverFactoryUtil.java
               `-- pages
                  |-- Page.java
                  |-- DuckDuckGoPage.java
                  |-- DuckDuckGoResultPage.java
           `-- resources
               `-- cucumberselenium
                  |-- DuckDuckGoTest.feature
```

## How to prepare environment
1) Install Java
2) Install and configure IDE
3) Create a project folder
4) Clone or copy (download) the repository into the project folder
5) Install Firefox or/and Chrome web browser/s
6) Download, extract and move geckodriver/chromedriver into specific folder
7) Point proper path to drivers folder (step 5) in pom.xml file properties section (lines 17-18)

## How to run tests
1) Open a terminal session
2) Move to the project folder
3) Execute `mvn clean test` - will run tests for Firefox browser (by default)
3.1) Execute `mvn clean test -D browser=chrome` - will run tests for Chrome browser

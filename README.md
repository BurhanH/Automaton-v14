# Automaton-v14
Automation framework (UI) - an example. Based on Java, Junit, Cucumber, Selenium, PageFactory

[![GitHub](https://img.shields.io/github/license/mashape/apistatus.svg)](https://github.com/BurhanH/automaton-v14/blob/master/LICENSE)
[![Build Status](https://travis-ci.org/BurhanH/Automaton-v14.svg?branch=master)](https://travis-ci.org/BurhanH/Automaton-v14)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/916e426250074c64bbb7db8744542181)](https://www.codacy.com/manual/BurhanH/Automaton-v14?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=BurhanH/Automaton-v14&amp;utm_campaign=Badge_Grade)

## Quick review
This is an almost fully functional testing framework based on Java programming language, Cucumber, and Selenium.

Main points:

1) Uses POM (Page Object Model), PageFactory, DriverFactoryUtil.
2) Automatically adds a screenshot into a test report if there is a failure in a scenario.
3) Supports by default 2 most popular browsers, you may extend this behavior via adding new driver into DriverFactoryUtil class.
4) Automatically by default generates a test report in HTML format, you may extend or change this behavior in RunCucumberTest class. 

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

## How to prepare an environment
1) Install Java
2) Install and configure IDE
3) Create a project folder
4) Clone or copy (download) the repository into the project folder
5) Install Firefox or/and Chrome web browser/s
6) Download, extract and move geckodriver/chromedriver into a specific folder
7) Point proper path to drivers folder (step 6) in pom.xml file properties section (lines 17-18)

## How to run tests
1) Open a terminal session
2) Move to the project folder
3) Execute `mvn clean test` - will run tests for Firefox browser (by default)
4) Execute `mvn clean test -D browser=chrome` - will run tests for Chrome browser
5) Check a test report (by default a test report generates into src/target/SystemTestReport/html folder)

## How to add tests
1) Create a feature file in src/test/resources/cucumberselenium folder
2) Add content into the feature file (follow Gerkin syntax language)
3) Add step definitions into Steps.java class
4) Add pages (follow an example for DuckDuckGo)
5) Run tests

## How to debug / troubleshoot 

Under construction

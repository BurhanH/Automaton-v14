# Automaton-v14
Automation framework (UI) - an example. Based on Java, Junit, Cucumber, Selenium, PageFactory

[![GitHub](https://img.shields.io/github/license/mashape/apistatus.svg)](https://github.com/BurhanH/automaton-v14/blob/master/LICENSE)
[![Build Status](https://travis-ci.org/BurhanH/Automaton-v14.svg?branch=master)](https://travis-ci.org/BurhanH/Automaton-v14)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/916e426250074c64bbb7db8744542181)](https://www.codacy.com/manual/BurhanH/Automaton-v14?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=BurhanH/Automaton-v14&amp;utm_campaign=Badge_Grade)

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

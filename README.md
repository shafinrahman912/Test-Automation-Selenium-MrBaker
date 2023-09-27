# Test-Automation-Selenium-MrBaker
Various test cases have been automated for Mr. Baker's online store, a well-known bakery in Bangladesh, using Selenium and TestNg. 

## Getting Started
The below instructions will explain how to get the project up and running on a local machine for development and testing purposes.
## Introduction
Selenium and TestNg are used to automate the web application of Mr. Baker, a well-known bakery in Bangladesh. Various test cases are developed for automatic
 - Category selection from the home page, 
 - Data-driven test for the registration page.
 - Sign-up from the registration page, 
 - Log-in,
 - Product search and product selection, 
 - Add-to-cart action,
 - and other actions. 
 
 A bug screenshot is captured through the selenium 'TakesScreenshot' method when the test case fails.**'testng.xml'** which includes the **test-suit**, is run for executing all test cases.

## Contents

- [Introduction](#Introduction)
- [Prerequisites](#Prerequisites)
- [Installing](#Installing)
- [Dependencies](#Dependencies)
- [Running The Tests](#Running-The-Tests)
- [Video of Test Automation](#Video-of-Test-Automation)
- [Data Driven Test](#Data-driven-Test)
- [Automated Bug Screenshot](#Automated-Bug-Screenshot)
- [Report](#report)
- [Author](#test-metrics)
- [Acknowledgment](#Acknowledgment)

### Prerequisites

Required software to run the project.

```
- jdk 17 or above
- Apache Maven 3.8.x
- Eclipse or IntelliJ IDE ( recommended for development and debugging purposes).
- Selenium WebDriver
- TestNG
- Maven Repositories
```

### Installing

A step-by-step series of examples of how to get a development environment running

[jdk download and installation](https://www.oracle.com/java/technologies/downloads/)

```
- Download from - https://www.oracle.com/java/technologies/downloads/
- Install the installer
- Set system environment variable
- Check the version from cmd
```

[Apache Maven download and installation](https://maven.apache.org/download.cgi)

```
- Download from - https://maven.apache.org/download.cgi
- Install the installer
- Set system environment variable
- Check the version from cmd
```
[IDE download and installation](https://maven.apache.org/download.cgi)

```
- Download from - https://www.jetbrains.com/idea/download/?section=windows
- Install the installer
```
## Dependencies
- Required maven dependencies
```
- TestNG
- Selenium
- apache-poi-ooxml
- WebDriverManager
```
- Installation
```
- Go to the URL - https://mvnrepository.com/
- copy the aforementioned dependencies and paste on the project's pom.xml
```

## Running The Tests
```
- Run the 'testng.xml' file to run the Test-suit and all test cases. 
```
## Video of Test Automation
- Video of automated category selection from the home page, sign-up from the registration page, product search, product selection, add-to-cart etc. through Selenium and TestNG.

https://github.com/shafinrahman912/Test-Automation-Selenium-MrBaker/assets/83553368/4dd54720-33fd-427b-be8a-8ade9b772337


## Data Driven Test
- Data-driven test for the registration page.
- Test data is stored in a CSV file.
- The apache-poi-ooxml dependency is used for accessing and handling CSV data.
- External CSV data is used for testing.

## Automated Bug Screenshot
- When a test case fails, a bug screenshot is captured through the selenium 'TakesScreenshot' method in an automated way.


## Built With

- [Java](https://www.oracle.com/java/technologies/downloads/) - The language used
- [Maven](https://maven.apache.org/) - Dependency and Project Management
- [Selenium](https://www.selenium.dev/) - The Framework used to Automate
- [TestNG](https://testng.org/) - The Framework used to Test


## Versioning

[GitHub](http://github.com/) is used for versioning.

## Author

- **Shafin Rahman**

## Acknowledgment

- Ehsanul Alam Sabbir

  Sr. SQA Engineer L-III, Vivasoft Limited

- Role and Responsibilities: Guidance, Monitoring and Test supervision


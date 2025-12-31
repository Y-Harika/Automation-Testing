
# Tricentis Automation Testing Framework

##  Project Overview

This repository contains an automation testing framework designed to automate user journeys of a web application using BDD (Cucumber + Gherkin).
The tests are written in readable scenarios using **feature files**, making them understandable for both technical and non-technical stakeholders. 

##  Technologies Used

 Language : Java                      
 Automation: Selenium WebDriver        
 BDD: Cucumber                  
 Test Framework: TestNG                   
 Build Tool: Maven                     
 Design Pattern: Page Object Model (POM)   
 Reporting: Cucumber & TestNG Reports 
               



##    Project Structure 

```
Automation-Testing
│
├── src
│   ├── main/java
│   │   ├── base
│   │   │   └── BaseTest.java
│   │   ├── pages
│   │   │   └── *.java
│   │   └── utils
│   │       └── ExcelReader.java
│   │       └── Hooks.java
│   │
│   └── test/java
│       └── stepdefinitions
│           └── *.java
│       └── runners
│           └── TestRunner.java
│
├── features
│   └── *.feature
│
├── pom.xml
└── README.md
``` 



##  Key Features

✔ BDD style automation using **Cucumber**
✔ Modularity with **Page Object Model (POM)**
✔ Reusable utilities & test configuration
✔ Cross-browser execution support (configurable)
✔ Readable Gherkin syntax for test scenarios

##  Sample Feature (BDD)

Each test scenario is written with Given-When-Then syntax, for example:

```gherkin
Feature: User Login Validation

  Scenario: Successful login
    Given User is on the login page
    When User enters valid credentials
    Then User should be redirected to the dashboard
```

##  How to Run Tests

###  Prerequisites

1. Java JDK installed
2. Maven installed
3. A modern browser driver configured (ChromeDriver, GeckoDriver, etc.)

###  Execute Tests

1. Clone the repository:

```bash
git clone https://github.com/Y-Harika/Automation-Testing.git
```

2. Navigate to project root:

```bash
cd Automation-Testing
```

3. Run tests with Maven:

```bash
mvn clean test
```



##  Test Reports

* Cucumber generates detailed HTML reports for executed scenarios.
* TestNG also produces test output in the `test-output` folder.
  
## Conclusion

This project demonstrates the design and implementation of a BDD-based automation testing framework using Selenium WebDriver, Cucumber, Java, TestNG, and Maven. By following the Page Object Model (POM) and writing test scenarios in Gherkin syntax, the framework ensures improved readability, maintainability, and collaboration between technical and non-technical stakeholders.

The project reflects real-world QA automation practices such as reusable components, structured test execution, and scalable framework design. It strengthened my understanding of behavior-driven development, automation framework architecture, and end-to-end UI testing, making it highly relevant for QA Automation Engineer roles.
##  Best Practices Implemented

* Separation of test logic from page interactions
* Behavior Driven Development (BDD) using Cucumber
* Reusable Page Objects
* Data-driven support (Excel / properties config)

## Future Enhancements

* Add Extent Reports or Allure Reports
* Integrate with GitHub Actions CI/CD
* Cross-browser parallel test execution
* Add data-driven parameterization via test data files





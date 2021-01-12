# UI Testing Exercise 

#### Codes and Test Prepared by:
**Ali Ihsan Celik*

*Software QA Engineer*

aliihsancelik1@gmail.com

www.linkedin.com/in/aliihsancelik


**- Build Tool:** Maven

**- Test Framework:** Cucumber BBD (with Junit Assertions)

------------
##### Environment: 
`https://gocity.com/boston/en-us/products/all-inclusive`

------------
#### System Requirements: 
- Java 8 + JDK

------------
## Test RUN 

Note: To run the scenario, use `@plan` tag in the CukesRunner class/Cucumber Options
#### 1. Way:
 - Clone the projects
 - Import maven dependencies from POM
 - Go **src -> test > java > Runners > CukesRunner** and Run
 - To generate "HTML Maven Cucumber Report" ; 
    > Open Maven right side panel
    > Double Click Project's Lifecycle
    > Click "verify"
                                                  
#### 2. Way:
 - Run from command line invoke `mvn clean verify` 

------------

## Test Reports Locations
1- Cucumber HTML Plugin Reports
**target -> cucumber-html-reports > overview-steps.html** 
(Right Click and Open in any Browser )

2- When you run my project, Cucumber will create automatically online report link. You can click the link
with in the 24 hours and check the all test steps and status. 

------------
 
## Cucumber Test Feature Scenario:
####) Validate the user journey on the website for trip planning feature
 a- In this Scenario, it tests the basic trip planning steps
 
 b- To run this scenario, use the `@plan` tag in the CukesRunner class/Cucumber Options
 
 
------------

2021 January;
https://github.com/aliihsancelik

### End

------------




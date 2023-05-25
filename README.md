# BDD Framework Setup
This repo has no specific project but initial setup for BDD Cucumber framework with maven build, TestNG, Selenium webDriver, allure report generation, scenarios can run parallel
The repo is constructed in POM style - Page Object Model.

## Dependencies used with version:
Please refer to pom.xml file for this.

## To run scenarios in parallel mode
To run scenarios in parallel mode please change @DataProvider(parallel = true) in MyTestRunner.java file.

## To create allure report
Please go to your project directory and run "allure serve allure-results" command in terminal. If any step will fail during execution , it will attach the screenshot in the report.

#### The Example no 3 in @test_2 is failing on purpose, so we can see the failed scenario in allure report and attached screenshot for that. The reason for failing is: Page titles are not same expected [Orange (fruit) - Wikipedia] but found [Orange - Wikipedia]


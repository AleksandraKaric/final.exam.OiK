## Final Exam: Automated Test for Login Form
This repository contains the automated test I developed as a part of my final exam for the basics of automated testing. The test was written to validate the functionality of a login form, using the following tools and frameworks: Maven, Page Object Model (POM), Java, Selenium WebDriver, and JUnit.

# Project Overview
The primary goal of this project was to demonstrate my proficiency in writing automated tests for web applications, specifically focusing on a login form. This test suite includes various test scenarios to validate both successful and unsuccessful login attempts based on user input.

# Technologies Used
Java: Primary programming language used to write test scripts.
Selenium WebDriver: Tool used to automate web browser interactions.
JUnit: Framework for managing test cases and assertions.
Maven: Build automation tool for dependency management and project configuration.
Page Object Model (POM): Design pattern to improve code readability and maintainability.

# Project Structure
src/test/java: Contains the main code files for the Page Object Model classes and the test cases for the login functionality.
pom.xml: Maven configuration file to manage dependencies and plugins.

# Test Scenarios
The following scenarios are covered in the test suite:

Successful Login: Verifies login with valid credentials.
Invalid Username: Verifies error handling for an incorrect username.
Invalid Password: Verifies error handling for an incorrect password.
Empty Fields: Ensures appropriate feedback when username and/or password fields are left empty.

# Notes
This project represents a foundational exercise in automated testing. It highlights essential practices for test organization, reusable code patterns, and effective use of test frameworks.

# Selenium CI Automation Framework

This project is a Selenium-based automation framework built using Java, TestNG, and Maven.
It follows the Page Object Model (POM) design pattern and is integrated with GitHub Actions
for Continuous Integration (CI).

**Project Overview**
## 🧰 Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- GitHub Actions (CI/CD)
- Extent Reports
- Log4j

 ## 📂 Project Structure
src/
 ├── main/java/pages
 ├── test/java/tests
 ├── test/java/base
 ├── test/resources
 └── .github/workflows

## ▶️ How to Run Tests

### Prerequisites
- Java 11+
- Maven
- Chrome / Edge browser

### Run Tests
mvn clean test

## 🔄 CI/CD
This project uses GitHub Actions to automatically execute tests
on every push or pull request.

## 📊 Reporting
Extent reports are generated after execution and can be found in the reports folder.


 

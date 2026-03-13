# WordPress Automation Testing Framework

Automated end-to-end testing framework for the WordPress web application built using **Selenium WebDriver**, **TestNG**, **Cucumber BDD**, and **Page Object Model (POM)** design pattern.

---

## 🛠️ Tech Stack

| Tool | Purpose |
|------|---------|
| Java | Core programming language |
| Selenium WebDriver | Browser automation |
| TestNG | Test execution and reporting |
| Cucumber BDD | BDD feature files and step definitions |
| Maven | Build and dependency management |
| JIRA | Defect tracking and bug reporting |
| Page Object Model | Framework design pattern |

---

## 📁 Project Structure

```
src/
├── main/java/
│   └── com/test/wordpressCapstone/
│       └── App.java
└── test/java/
    ├── base/
    │   └── BaseClass.java        # WebDriver setup and teardown
    ├── pages/
    │   ├── HomePage.java         # Home page locators and actions
    │   ├── DownloadPage.java     # Download page locators and actions
    │   ├── CommunityPage.java    # Community page locators and actions
    │   └── PhotoDirectoryPage.java  # Photo directory locators and actions
    ├── stepdefinitions/
    │   └── WordpressSteps.java   # Cucumber step definitions
    ├── runner/
    │   └── TestRunner.java       # TestNG + Cucumber runner
    └── resources/features/
        └── wordpress.feature     # BDD feature file (Gherkin)
```

---

## ✅ Test Scenarios Covered

- Verify WordPress homepage title loads correctly
- Mouse over navigation menu and click Get WordPress
- Verify Get WordPress page heading text
- Navigate to Community → Photo Directory
- Search for photos and verify results are displayed

---

## 🚀 How to Run

### Prerequisites
- Java 8+
- Maven installed
- Chrome browser + ChromeDriver (matching version)

### Steps

```bash
# Clone the repository
git clone https://github.com/Vamsi-Kathi/WordPress-Automation-Testing-.git

# Navigate to project directory
cd WordPress-Automation-Testing-

# Run all tests
mvn test

# View TestNG report
open target/surefire-reports/index.html
```

---

## 📊 Test Reporting

Test execution reports are generated automatically using **Maven Surefire Plugin** and **TestNG** after each run inside:

```
target/surefire-reports/
├── index.html           # Full test report
├── emailable-report.html  # Shareable summary
└── testng-results.xml   # XML results
```

---

## 🎯 Framework Highlights

- **Page Object Model (POM)** — Separates test logic from UI locators for maintainability
- **BDD with Cucumber** — Test scenarios written in plain English (Gherkin) for readability
- **TestNG Integration** — Parallel execution support and detailed reporting
- **Defect Tracking** — Bugs logged and tracked via JIRA workflow

---

## 👨‍💻 Author

**Vamsi Kathi**
- GitHub: [github.com/Vamsi-Kathi](https://github.com/Vamsi-Kathi)
- LinkedIn: [linkedin.com/in/vamsi-kathi](https://www.linkedin.com/in/vamsi-kathi)

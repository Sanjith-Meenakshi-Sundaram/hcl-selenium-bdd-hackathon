# NoBroker Automation Framework

## Project Overview
This project automates the **NoBroker property search and contact owner flow** using **Selenium WebDriver with Java**. The automation framework is built using **BDD (Cucumber), TestNG, Page Object Model (POM), and Page Factory** to ensure scalability, maintainability, and reusability.

The objective of this automation is to validate the **end-to-end user flow** of searching rental properties and contacting the owner, including handling login popups and capturing screenshots.

The framework is designed so that **new scenarios can be easily added (40+ scenarios)** without changing the core framework.

---

# Technologies Used

| Tool | Purpose |
|-----|------|
| Java | Programming language |
| Selenium WebDriver | Browser automation |
| Cucumber (BDD) | Writing readable test scenarios |
| TestNG | Test runner |
| Page Object Model | Maintainable test structure |
| Page Factory | Efficient element initialization |
| Maven | Dependency management |
| Git & GitHub | Version control |
| Allure Report | Test reporting |

---

# Automation Framework Design

The framework follows a **Hybrid Test Automation Architecture** combining:

- **BDD (Behavior Driven Development)**
- **Page Object Model (POM)**
- **Page Factory**
- **Reusable Step Definitions**
- **Data Driven Testing**

### Framework Layers

1. **Feature Files**
   - Written in Gherkin language
   - Describe business scenarios

2. **Step Definitions**
   - Implement test logic for each step

3. **Page Classes**
   - Contain locators and reusable actions

4. **Utility Classes**
   - Driver management
   - Property reader
   - Excel reader
   - Screenshot utilities

5. **Test Runner**
   - Executes Cucumber tests using TestNG

---

# Handling Browser Notifications

NoBroker shows a browser notification popup:

```
www.nobroker.in wants to show notifications
```

This popup is disabled using **ChromeOptions**.

Example configuration:

```java
prefs.put("profile.default_content_setting_values.notifications", 2);
options.addArguments("--disable-notifications");
```

This prevents browser permission popups during automation.

---

# Running the Project

### Run using Maven

```
mvn clean test
```

### Run from Test Runner

Execute the **TestRunner.java** class.

---

# Reporting

The framework integrates **Allure Reporting**.

After execution, generate the report using:

```
allure serve
```

Reports include:

- Test execution status
- Step level details
- Attached screenshots
- Failure debugging information

---

# Key Framework Advantages

- Clean **Page Object Model structure**
- Reusable **Step Definitions**
- Supports **large test suites**
- Easy **parallel execution**
- Configurable through **config.properties**
- Scalable for **enterprise automation projects**

---

# Version Control Workflow

- GitHub repository used for collaboration
- Each team member works on a **separate branch**
- Pull Requests used for **code review**
- Final code merged into **main branch**

---

# Author

Automation Project developed as part of a **Hackathon-style QA Automation Assessment** using Selenium BDD Framework.
Team mates:
Meenakshi Sundaram D
Ajay K
Ranjeeth BK
Karthick K
Joyal Abraham 

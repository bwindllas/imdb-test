# 🎬 IMDb Automation Test Suite

This repository contains UI automated tests for [IMDb](https://www.imdb.com) using **Selenide** and **TestNG**, with **Allure reports** for detailed visual test reporting.

---

## 🧰 Tech Stack

- **Java 21**
- **Maven**
- **Selenide**
- **TestNG**
- **Allure Report**

---

## ✅ Prerequisites

Before running the tests, ensure the following tools are installed on your machine:

- [Java JDK 21+](https://adoptium.net/)
- [Maven](https://maven.apache.org/install.html)
- [Allure](https://docs.qameta.io/allure/#_installing_a_commandline)

Check if they're installed:

```bash
java -version
mvn -version
allure --version
```

---

## 🚀 How to Run the Tests

**Run the tests via Maven:**

```bash
mvn clean test
```

This will:
- Compile and run your test suite defined in `testng.xml`
- Generate Allure results in the `allure-results/` directory

---

## 📊 View Allure Report

After running the tests, you can open the report in a browser:

```bash
allure serve allure-results
```

> This command generates the report and opens it automatically in your default browser.
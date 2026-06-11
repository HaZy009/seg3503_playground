# SEG3503 Lab 03 - Code Coverage and Refactoring

## Student Information

- Name: Joel Normand
- Student Number: 300151667

---

## Objective

This laboratory focuses on:

- Executing code coverage tools using JaCoCo
- Applying white-box testing techniques
- Improving test coverage
- Refactoring code using small incremental changes
- Practicing Git and GitHub workflows

---

## Environment

### Java Version

```bash
java 24.0.2
```

---

## Projects

### Computation

Executed existing JUnit tests and generated a JaCoCo coverage report to analyze statement and branch coverage.

### Date

Executed existing tests, analyzed coverage using JaCoCo, added an additional JUnit test to improve coverage, and performed refactoring while ensuring all tests continued to pass.

---

## Running Tests

### Computation

```bash
javac --release 11 -encoding UTF-8 -cp "lib/junit-platform-console-standalone-1.7.1.jar;src" -d bin src/Computation.java test/ComputationTest.java

java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path bin --scan-class-path
```

### Date

```bash
javac --release 11 -encoding UTF-8 -cp "lib/junit-platform-console-standalone-1.7.1.jar;src" -d bin src/Date.java test/*.java

java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path bin --scan-class-path
```

---

## JaCoCo Coverage

```bash
java "-javaagent:lib/jacocoagent.jar=includes=Date*" -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path bin --scan-class-path

java -jar lib/jacococli.jar report jacoco.exec --classfiles bin --sourcefiles src --html report
```

---

## AI Usage Disclosure

ChatGPT was used as a learning aid to better understand JaCoCo, code coverage metrics, and refactoring techniques. All code modifications, testing activities, Git commits, and final submission work were completed by the student.
# SEG3503 Lab 02 - Software Testing

---

## Environment Verification

### Registration Application

The Registration application was launched successfully and verified through a web browser.

### ECS Application

The ECS project was compiled successfully and all provided tests executed without errors.

Initial ECS test results:

- 19 tests found
- 19 tests successful
- 0 tests failed

---

# Exercise 1 - NextDate Test Cases

The following test cases were executed to validate the `nextDate()` method.

| Test Case | Expected Result | Actual Result | Verdict |
|------------|------------|------------|------------|
| 1 | 1700-06-21 | 1700-06-21 | Success |
| 2 | 2005-04-16 | 2005-04-16 | Success |
| 3 | 1901-07-21 | 1901-07-21 | Success |
| 4 | 3456-03-28 | 3456-03-28 | Success |
| 5 | 1500-02-18 | 1500-02-18 | Success |
| 6 | 1700-06-30 | 1700-06-30 | Success |
| 7 | 1800-11-30 | 1800-11-30 | Success |
| 8 | 3453-01-30 | 3453-01-30 | Success |
| 9 | 444-03-01 | 444-03-01 | Success |
| 10 | 2005-05-01 | 2005-05-01 | Success |
| 11 | 3453-01-31 | 3453-01-31 | Success |
| 12 | 3456-03-31 | 3456-03-31 | Success |
| 13 | 1901-08-01 | 1901-08-01 | Success |
| 14 | 3453-02-01 | 3453-02-01 | Success |
| 15 | 3457-01-01 | 3457-01-01 | Success |
| 16 | IllegalArgumentException | IllegalArgumentException | Success |
| 17 | IllegalArgumentException | IllegalArgumentException | Success |
| 18 | IllegalArgumentException | IllegalArgumentException | Success |
| 19 | IllegalArgumentException | IllegalArgumentException | Success |
| 20 | IllegalArgumentException | IllegalArgumentException | Success |

### Results

All 20 test cases passed successfully.

Exercise 1 test results:

- 39 tests found
- 39 tests successful
- 0 tests failed

---

# Exercise 2 - JUnit Implementation

Three test classes were implemented:

- `DateTest.java`
- `DateNextDateOkTest.java`
- `DateNextDateExceptionTest.java`

### DateTest

Contains the 20 explicit test cases provided in the laboratory instructions.

### DateNextDateOkTest

Parameterized test containing the 15 valid date scenarios.

### DateNextDateExceptionTest

Parameterized test containing the 5 invalid date scenarios that must throw an `IllegalArgumentException`.

### Results

Final test execution:

- 58 tests found
- 58 tests successful
- 0 tests failed

---

# Conclusion

The Registration application and ECS project were successfully validated.

All required test cases were implemented and executed successfully.

Final result:

- 58 tests successful
- 0 tests failed

---

## AI Assistance Disclosure

ChatGPT was used as a learning and troubleshooting aid during the completion of this laboratory.

All code submitted was reviewed, understood, tested, and integrated by the author. The implementation, test execution, analysis of results, and final submission remain my own work.
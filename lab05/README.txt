## Initial Setup

Before making any modifications, both projects provided for the lab were tested to verify their initial state.

### Grades

- Successfully configured and launched using WSL (Elixir 1.14 / Erlang OTP 25).
- The web application starts correctly at `http://localhost:4000`.
- Clicking **Calculate** produces an expected `UndefinedFunctionError` because `Grades.Calculator` has not yet been implemented.

### Twitter

- The application compiles and runs successfully.
- EasyMock required adding the following JVM option to `bin/test` to be compatible with recent Java versions:

```text
--add-opens java.base/java.lang=ALL-UNNAMED

## Step 1 - Calculator Stub

A temporary `Grades.Calculator` module was added to verify that the application correctly calls the calculator functions.

The stub currently returns fixed values:

- Percentage: 95
- Letter grade: A+
- Numeric grade: 10

### Result

- The **Calculate** button no longer throws an exception.
- The application successfully displays the values returned by the stub implementation.

## Step 2 - Real Calculator Implementation

The temporary stub was replaced with a real implementation of `Grades.Calculator`.

The calculator now:

- Converts form input values from strings to numbers.
- Computes the average homework grade.
- Computes the average lab grade.
- Calculates the final percentage using the following weights:
  - Homework: 15%
  - Labs: 15%
  - Midterm: 30%
  - Final: 40%
- Converts the percentage into a letter grade.
- Converts the percentage into a numeric grade.

### Test Case

The values shown in the lab slides were used:

- Homework: 89, 92, 100, 48
- Labs: 100, 100, 25, 100, 100, 25
- Midterm: 73
- Final: 83

### Result

- Percentage: 78.6875
- Letter grade: B+
- Numeric grade: 7

The application now calculates and displays real grade values instead of fixed stub values.

## Step 3 - Twitter Mock Tests

Four missing test cases were implemented using EasyMock partial mocks for `loadTweet()`.

### Results before fixing `isMentionned()`

- `isMentionned_handleNull()` failed with a `NullPointerException`.
- `isMentionned_dontReturnSubstringMatches()` failed because `@meat` was incorrectly detected as `@me`.
- `actual_call()` was unstable because it depends on `Math.random()`.

### Fix

`isMentionned()` was updated to:

- return `false` when `loadTweet()` returns `null`;
- avoid substring matches such as `@me` inside `@meat`.

### Final test result

- 7 tests found
- 1 test skipped
- 6 tests successful
- 0 tests failed

The skipped test is `actual_call()` because it depends on random output from `loadTweet()`.

## AI Disclosure

Generative AI (ChatGPT) was used as a learning and guidance tool throughout this lab. It was used to help understand the requirements, troubleshoot environment issues, discuss implementation approaches, and review code.

All code was reviewed, tested, integrated, and validated by me before submission.
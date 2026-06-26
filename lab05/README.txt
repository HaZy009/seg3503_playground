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
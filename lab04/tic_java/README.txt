# SEG3503 - Lab 04 (TDD)

## Student
Joël Normand
300151667

## Project
Tic Tac Toe (Java)

---

# Commit Group 1

## RED

### Goal
Create the first failing test following the TDD methodology.

### Test Added
`shouldPlaceXOnEmptyCell()`

The test expects a player to place an "X" on an empty square using:

```java
board.play(0, 0);
```

### Result

Compilation failed because the `play(int, int)` method does not exist yet.

```
cannot find symbol
method play(int,int)
```

Status: RED ✅

## GREEN

### Code Added
A new `play(int row, int col)` method was added.

```java
public void play(int row, int col) {
    board[row][col] = "X";
}

Status: GREEN ✅

## REFACTOR

### Changes
No refactoring was required.

The implementation is already minimal and satisfies the current test without unnecessary complexity.

### Result

All tests still pass.

Status: REFACTOR ✅

# Commit Group 2

## RED

### Goal
Add turn switching after a player makes a move.

### Test Added
`shouldSwitchTurnAfterPlay()`

### Result
The test failed because `turn` still remains `"X"` after calling `play()`.

Status: RED ✅

## GREEN

### Code Added
The `play()` method now uses the current value of `turn` and switches it to `"O"` after a move.

### Result
The test now passes because after player X plays, the turn changes to O.

Status: GREEN ✅

## REFACTOR

### Changes
Improved the `play()` method so that the turn alternates between `"X"` and `"O"` instead of always setting it to `"O"`.

### Result
The existing tests still pass, and the code is now ready to support multiple turns.

Status: REFACTOR ✅

# Commit Group 3

## RED

### Goal
Prevent a player from overwriting an occupied cell.

### Test Added
`shouldNotOverwriteOccupiedCell()`

### Result
The test failed because the second move overwrote the existing value on the board.

Status: RED ✅

## GREEN

### Code Added
The `play()` method now checks whether the selected cell is empty before placing a mark.

### Result
The occupied cell is no longer overwritten and all JUnit tests pass.

Status: GREEN ✅

## REFACTOR

### Changes
The turn switching logic was moved into a separate private method named `switchTurn()`.

### Result
The code is easier to read and all JUnit tests still pass.

Status: REFACTOR ✅

# Commit Group 4

## RED

### Goal
Handle moves outside the board with a clearer exception.

### Test Added
`shouldThrowIllegalArgumentExceptionWhenMoveIsOutsideBoard()`

### Result
The test failed because the current code throws an array index exception instead of an `IllegalArgumentException`.

Status: RED ✅

## GREEN

### Code Added
The `play()` method now validates the row and column before accessing the board.

### Result
An `IllegalArgumentException` is thrown when the move is outside the board, and all JUnit tests pass.

Status: GREEN ✅

## REFACTOR

### Changes
No refactoring was required.

The validation logic is concise, readable, and does not introduce unnecessary duplication.

### Result
All tests still pass.

Status: REFACTOR ✅

# Commit Group 5

## RED

### Goal
Detect when a player wins on the first row.

### Test Added
`shouldDetectWinOnFirstRow()`

### Result
Compilation failed because the `hasWinner()` method does not exist yet.

Status: RED ✅

## GREEN

### Code Added
A `hasWinner()` method was added to detect a win on the first row.

### Result
The new winning row test passes and all JUnit tests pass.

Status: GREEN ✅
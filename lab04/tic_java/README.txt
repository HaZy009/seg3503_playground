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
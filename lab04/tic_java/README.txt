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
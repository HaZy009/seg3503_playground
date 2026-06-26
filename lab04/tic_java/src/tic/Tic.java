package tic;

public class Tic {

	// Game board
	String[][] board;

	// Board dimensions
	int rows;
	int cols;

	// Current player's turn
	String turn;

	// Creates a new empty Tic Tac Toe board
	public Tic(int row, int col) {
		board = new String[row][col];
		rows = row;
		cols = col;
		turn = "X";

		// Initialize every cell as empty
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				board[i][j] = "_";
			}
		}
	}

	// Places the current player's mark on the board
	public void play(int row, int col) {

		// Validate board boundaries
		if (row < 0 || row >= rows || col < 0 || col >= cols) {
			throw new IllegalArgumentException("Move is outside the board");
		}

		// Only allow moves on empty cells
		if (board[row][col].equals("_")) {
			board[row][col] = turn;
			switchTurn();
		}
	}

	// Switches the turn between X and O
	private void switchTurn() {
		if (turn.equals("X")) {
			turn = "O";
		} else {
			turn = "X";
		}
	}

	// Checks if X has completed the first row
	public boolean hasWinner() {
		return board[0][0].equals("X")
				&& board[0][1].equals("X")
				&& board[0][2].equals("X");
	}
}
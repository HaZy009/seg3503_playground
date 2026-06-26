package tic;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TicTest {

    @Test
    void shouldCreateEmpty3x3Board() {
        Tic board = new Tic(3, 3);

        assertEquals(3, board.rows);
        assertEquals(3, board.cols);
        assertEquals("X", board.turn);

        for (int i = 0; i < board.rows; i++) {
            for (int j = 0; j < board.cols; j++) {
                assertEquals("_", board.board[i][j]);
            }
        }
    }

    @Test
    void shouldPlaceXOnEmptyCell() {
        Tic board = new Tic(3, 3);

        board.play(0, 0);

        assertEquals("X", board.board[0][0]);
    }

    @Test
    void shouldSwitchTurnAfterPlay() {
        Tic board = new Tic(3, 3);

        board.play(0, 0);

        assertEquals("O", board.turn);
    }

    @Test
    void shouldNotOverwriteOccupiedCell() {
        Tic board = new Tic(3, 3);

        board.play(0, 0); // X
        board.play(0, 0); // O essaie de jouer au même endroit

        assertEquals("X", board.board[0][0]);
    }

    @Test
    void shouldAlternateTurns() {
        Tic board = new Tic(3, 3);

        board.play(0, 0); // X
        board.play(1, 1); // O

        assertEquals("X", board.turn);
        assertEquals("X", board.board[0][0]);
        assertEquals("O", board.board[1][1]);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenMoveIsOutsideBoard() {
        Tic board = new Tic(3, 3);

        assertThrows(IllegalArgumentException.class, () -> {
            board.play(3, 3);
        });
    }
}
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
}
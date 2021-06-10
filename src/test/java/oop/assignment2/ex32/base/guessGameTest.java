package oop.assignment2.ex32.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class guessGameTest {

    @Test
    void checkGuess_if_equal() {
        guessGame loop = new guessGame();
        int actual = loop.checkGuess(5,5);
            assertEquals(4,actual);
    }

    @Test
    void checkGuess_if_greater() {
        guessGame loop = new guessGame();
        int actual = loop.checkGuess(7,5);
        assertEquals(3,actual);
    }

    @Test
    void checkGuess_if_lesser() {
        guessGame loop = new guessGame();
        int actual = loop.checkGuess(4,5);
        assertEquals(2,actual);
    }
}
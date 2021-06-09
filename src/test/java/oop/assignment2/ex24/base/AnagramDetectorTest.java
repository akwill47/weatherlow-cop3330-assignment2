package oop.assignment2.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {
    /*
    what do you test?
    test edge cases - 0, 1, very large numbers, very small numbers
    test both true and false cases
    test common cases
    test uncommon cases
     */

    @Test
    void isAnagram_returns_the_right_answer() {
        //isAnagram("note","note") should return true
        //isAnagram("note","not") should return false

        //given
        AnagramDetector detector = new AnagramDetector();
        //when
        boolean actual = detector.isAnagram("note","note");
        //then
        assertTrue(actual);
    }
    @Test
    void isAnagram_returns_false_for_nonanagrams(){
        //given
        AnagramDetector detector = new AnagramDetector();
        //when
        boolean actual = detector.isAnagram("difo","god");
        //then;
        assertFalse(actual);
    }
}
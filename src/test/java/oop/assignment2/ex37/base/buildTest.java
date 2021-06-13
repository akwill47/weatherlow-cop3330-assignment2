package oop.assignment2.ex37.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class buildTest {

    @Test
    void password_normal() {
        build create = new build();
        int length = 8;
        String actual = create.password(length,2,2);

        assertEquals(length,actual.length());
    }
    @Test
    void password_not_normal() {
        build create = new build();
        int length = 100;
        String actual = create.password(length,24,25);

        assertEquals(length,actual.length());
    }
    @Test
    void password_min() {
        build create = new build();
        int length = 4;
        String actual = create.password(length,1,1);

        assertEquals(length,actual.length());
    }
    @Test
    void password_letter_length_correct() {
        build create = new build();
        int length = 8;
        int special = 2;
        int numbers = 2;
        int numLetters = special + numbers;
        String actual = create.password(length,special,numbers);

        if(numLetters <= length-special-numbers)
            assertEquals(length,actual.length());
    }
    /*@Test
    void password_letter_length_wrong() {
        build create = new build();
        int length = 5;
        int special = 2;
        int numbers = 2;
        int numLetters = special + numbers;
        boolean check;
        String actual = create.password(length,special,numbers);

        if(numLetters < length-special-numbers){
            check= false;
            assertFalse(check);
        }
        else assertEquals(length,actual.length());


    }*/
}
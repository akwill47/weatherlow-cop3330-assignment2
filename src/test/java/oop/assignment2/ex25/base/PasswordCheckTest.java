package oop.assignment2.ex25.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckTest {

    @Test
    void pass_with_letters_num() {
        PasswordCheck check = new PasswordCheck();
        int actual = check.validate("abc123");
        assertEquals(2,actual);
    }
    @Test
    void pass_with_letters_num_special_lessthan() {
        PasswordCheck check = new PasswordCheck();
        int actual = check.validate("abc123@");
        assertEquals(2,actual);
    }
    @Test
    void pass_with_letters_greaterthan() {
        PasswordCheck check = new PasswordCheck();
        int actual = check.validate("abcdefghlnpo");
        assertEquals(0,actual);
    }
    @Test
    void pass_with_numbers_greaterthan() {
        PasswordCheck check = new PasswordCheck();
        int actual = check.validate("12345678910");
        assertEquals(1,actual);
    }
    @Test
    void pass_with_letters_num_lessthan() {
        PasswordCheck check = new PasswordCheck();
        int actual = check.validate("abc123");
        assertEquals(2,actual);
    }
    @Test
    void pass_with_letters_num_special_greaterthan() {
        PasswordCheck check = new PasswordCheck();
        int actual = check.validate("abc123@hi!");
        assertEquals(4,actual);
    }
    @Test
    void pass_with_letters_num_greaterthan() {
        PasswordCheck check = new PasswordCheck();
        int actual = check.validate("abc123hello");
        assertEquals(3,actual);
    }
}
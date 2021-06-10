package oop.assignment2.ex27.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class validateFunctionsTest {

    @Test
    void validateName_true() {
        validateFunctions validate = new validateFunctions();
        int actual = validate.validateName("John");
        assertEquals(1,actual);
    }
    @Test
    void validateName_true_lessthan() {
        validateFunctions validate = new validateFunctions();
        int actual = validate.validateName("J");
        assertEquals(2,actual);
    }

    @Test
    void validateZip_true() {
        validateFunctions validate = new validateFunctions();
        int actual = validate.validateZip("12345");
        assertEquals(1,actual);
    }

    @Test
    void validateId_true() {
        validateFunctions validate = new validateFunctions();
        int actual = validate.validateId("TK-4213");
        assertEquals(1,actual);
    }

}
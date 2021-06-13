package oop.assignment2.ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class inputCatchTest {

    @Test
    void validate_letters() {
        inputCatch input = new inputCatch();
        int actual;
        try{
            actual = Integer.parseInt("abc");
            fail("Test unsuccessful, all are numbers");
        }catch(NumberFormatException e){
            System.out.print("Test Successful\n");
        }



    }

    @Test
    void validate_numbers() {
        inputCatch input = new inputCatch();
        int actual;
        try{
            actual = Integer.parseInt("123");
            System.out.print("Test Successful, all are numbers\n");
        }catch(NumberFormatException e){
            fail("Test failed, non-numeric data detected");
        }
    }
}
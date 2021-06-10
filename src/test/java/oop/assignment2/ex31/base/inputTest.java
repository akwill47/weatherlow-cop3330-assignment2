package oop.assignment2.ex31.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class inputTest {

    @Test
    void age_letters() {
        try{
           assertEquals(12,Integer.parseInt("12abc"));
        }catch (NumberFormatException e){
            System.out.print("input non-numeric values test is successful");
        }
    }

    @Test
    void resting() {
    }
}
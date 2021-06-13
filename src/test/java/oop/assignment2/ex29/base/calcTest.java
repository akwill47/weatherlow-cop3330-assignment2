package oop.assignment2.ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calcTest {

    @Test
    void calc_normal() {
        calc calculator = new calc();
        int actual = (int)calculator.calc(4);
        assertEquals(18,actual);
    }
    @Test
    void calc_normal_with_zero() {
        calc calculator = new calc();

        int actual;
        try{
            actual = (int)calculator.calc(0);
            assertEquals(0,actual);
        }catch(ArithmeticException e){
            System.out.print("Exception caught");
        }
    }
}
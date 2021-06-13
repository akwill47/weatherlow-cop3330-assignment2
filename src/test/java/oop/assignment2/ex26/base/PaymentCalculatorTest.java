package oop.assignment2.ex26.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
       PaymentCalculator calc = new PaymentCalculator();
       int actual = (int)calc.calculateMonthsUntilPaidOff(12.0/100/365,5000,100);
       assertEquals(70,actual);
    }

    @Test
    void calculateMonthsUntilPaidOff_zero_balance() {
        PaymentCalculator calc = new PaymentCalculator();
        int actual = (int)calc.calculateMonthsUntilPaidOff(12.0/100/365,0,100);
        assertEquals(0,actual);
    }

    @Test
    void calculateMonthsUntilPaidOff_zero_monthlypay() {
        PaymentCalculator calc = new PaymentCalculator();
        int actual = (int)calc.calculateMonthsUntilPaidOff(12.0/100/365,5000,0);
        assertEquals(0,actual);
    }
    @Test
    void calculateMonthsUntilPaidOff_zero_dailyrate() {
        PaymentCalculator calc = new PaymentCalculator();
        int actual = (int)calc.calculateMonthsUntilPaidOff(0,5000,100);
        assertEquals(50,actual);
    }



}
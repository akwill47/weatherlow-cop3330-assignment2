package oop.assignment2.ex36.base;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class calculateTest {

    @Test
    void average() {
        calculate calc = new calculate();
        ArrayList<Integer> testStats = new ArrayList<>();
        testStats.add(100);
        testStats.add(600);
        testStats.add(250);

    }

    @Test
    void max() {
        calculate calc = new calculate();
        ArrayList<Integer> testStats = new ArrayList<>();
        testStats.add(100);
        testStats.add(600);
        testStats.add(250);
        double actual = calc.max(testStats);
        assertEquals(600.0,actual);
    }

    @Test
    void min() {
        calculate calc = new calculate();
        ArrayList<Integer> testStats = new ArrayList<>();
        testStats.add(100);
        testStats.add(600);
        testStats.add(250);
        double actual = calc.min(testStats);
        assertEquals(100.0,actual);
    }

    @Test
    void std() {
        calculate calc = new calculate();
        DecimalFormat df = new DecimalFormat("0.00");
        ArrayList<Integer> testStats = new ArrayList<>();
        testStats.add(100);
        testStats.add(600);
        testStats.add(250);
        double avg = calc.average(testStats);
        double actual = calc.std(testStats,avg);
        //System.out.printf("%.1f",avg);
        assertEquals(df.format(209.50),df.format(actual));
    }
}
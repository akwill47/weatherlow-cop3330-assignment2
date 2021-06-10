package oop.assignment2.ex30.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class buildTableTest {

    @Test
    void math_random() {
        buildTable build = new buildTable();
        int[][] temp = build.math();
        assertEquals(100,temp[9][9]);
    }
    @Test
    void math_min() {
        buildTable build = new buildTable();
        int[][] temp = build.math();
        assertEquals(1,temp[0][0]);
    }
    @Test
    void math_max() {
        buildTable build = new buildTable();
        int[][] temp = build.math();
        assertEquals(144,temp[11][11]);
    }
    @Test
    void math_outofbounds() {
        buildTable build = new buildTable();
        int[][] temp = build.math();
        try{
            assertEquals(169,temp[12][12]);//12+1 is the digits
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.print("out of bounds catch test successful");
        }

    }
}
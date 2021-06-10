package oop.assignment2.ex28.base;

import org.junit.jupiter.api.Test;

import static java.lang.Integer.MAX_VALUE;
import static org.junit.jupiter.api.Assertions.*;

class calcTest {

    @Test
    void add_basic() {
        calc calc = new calc();
        int[] nums = new int[]{1, 2, 3, 4, 5};

        int actual = calc.add(nums);
        assertEquals(15,actual);
    }
    @Test
    void add_random_negatives() {
        calc calc = new calc();
        int[] nums = new int[]{999, -100, -693,-522, 5};

        int actual = calc.add(nums);
        assertEquals(-311,actual);
    }
}
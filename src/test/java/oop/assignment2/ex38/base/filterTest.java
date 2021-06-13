package oop.assignment2.ex38.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class filterTest {

    @Test
    void filterEvenNumbers() {
        filter check = new filter();
        String[] numList = new String[]{"1","2","3","4","5","6","7","8","9","10"};
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);expected.add(4);expected.add(6);expected.add(8);expected.add(10);

        ArrayList<Integer> actual = check.filterEvenNumbers(numList);
        for(int i=0;i<expected.size();i++){
            assertEquals(expected.get(i),actual.get(i));
        }
    }
    @Test
    void filterEvenNumbers_with_no_even_numbers() {
        filter check = new filter();
        String[] numList = new String[]{"1","3","5","7","9","11","13","15","17","19"};
        ArrayList<Integer> expected = new ArrayList<>();

        ArrayList<Integer> actual = check.filterEvenNumbers(numList);
        for(int i=0;i<expected.size();i++){
            assertEquals(expected.get(i),actual.get(i));
        }
    }
    @Test
    void filterEvenNumbers_with_zero() {
        filter check = new filter();
        String[] numList = new String[]{"0","1","2","3","5","6","8","10","17","19"};
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(0);expected.add(2);expected.add(6);expected.add(8);expected.add(10);

        ArrayList<Integer> actual = check.filterEvenNumbers(numList);
        for(int i=0;i<expected.size();i++){
            assertEquals(expected.get(i),actual.get(i));
        }
    }
}
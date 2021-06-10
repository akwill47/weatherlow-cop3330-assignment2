package oop.assignment2.ex31.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class buildTest {

    @Test
    void buildTable() {
        build table = new build();

        int[] actual =
        actual = table.buildTable(25,65);

        int[] expected = new int[]{138,145,151,158,165,171,178,185,191};
        for(int i=0;i<9;i++){
            assertEquals(expected[i],actual[i]);
        }
    }
}
package oop.assignment2.ex31.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class buildTest {

    @Test
    void buildTable() {
        build table = new build();

        int[] actual =
        actual = table.buildTable(22,65);

        int[] expected = new int[]{138,145,151,158,165,171,178,185,191};
        for(int i=0;i<9;i++){
            assertEquals(expected[i],actual[i]);
        }
    }
    @Test
    void buildTable_with_max_numbers() {
        build table = new build();

        int[] actual = table.buildTable(2147483647,2147483647);
        int[] expected = new int[]{-214748244,-429496597,-644244951,-858993305,-1073741658,-1288490012,-1503238366,-1717986720,-1932735073};

        for(int i=0;i<9;i++){
            assertEquals(expected[i],actual[i]);
        }
    }
}
package oop.assignment2.ex34.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class removeTest {

    @Test
    void removeName_4() {
        remove change = new remove();
        String[] empList = new String[]{"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        String[] expected = new String[]{"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen"};
        String[] actual = change.removeName(empList,4);
        for(int i =0;i<expected.length;i++){
            assertEquals(expected[i],actual[i]);
        }
    }
    @Test
    void removeName_1() {
        remove change = new remove();
        String[] empList = new String[]{"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        String[] expected = new String[]{"John Smith","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        String[] actual = change.removeName(empList,1);
        for(int i =0;i<expected.length;i++){
            assertEquals(expected[i],actual[i]);
        }
    }
}
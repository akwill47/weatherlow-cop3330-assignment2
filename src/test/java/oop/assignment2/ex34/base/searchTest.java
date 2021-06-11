package oop.assignment2.ex34.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class searchTest {

    @Test
    void find_first() {
        search find = new search();
        String[] empList = new String[]{"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        int actual = find.find(empList,"John Smith");
        assertEquals(0,actual);
    }
    @Test
    void find_last() {
        search find = new search();
        String[] empList = new String[]{"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        int actual = find.find(empList,"Jeremy Goodwin");
        assertEquals(4,actual);
    }
    @Test
    void find_not_on_list() {
        search find = new search();
        String[] empList = new String[]{"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        int actual = find.find(empList,"Difo god");
        assertEquals(-1,actual);
    }
}
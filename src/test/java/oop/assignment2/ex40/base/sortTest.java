package oop.assignment2.ex40.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class sortTest {

    @Test
    void adjust() {
        sort selectSort = new sort();
        ArrayList<HashMap<String,String>> testList = new ArrayList<>();
        HashMap<String,String> emp1 = new HashMap<>();
        emp1.put("lastname","b");
        emp1.put("firstname","b");
        testList.add(emp1);
        HashMap<String,String> emp2 = new HashMap<>();
        emp2.put("lastname","c");
        emp2.put("firstname","c");
        testList.add(emp2);
        HashMap<String,String> emp3 = new HashMap<>();
        emp3.put("lastname","a");
        emp3.put("firstname","a");
        testList.add(emp3);
        String[] expected= new String[]{"a","b","c"};
        String actual;
        HashMap<String,String> tempHash = new HashMap<>();
        testList = selectSort.adjust(testList,"c");
        for(int i =0;i<testList.size();i++){
            tempHash = testList.get(i);
            actual = tempHash.get("lastname");

            assertSame("c",actual);
        }
    }


    @Test
    void adjust_extreme() {
        sort selectSort = new sort();
        ArrayList<HashMap<String,String>> testList = new ArrayList<>();
        HashMap<String,String> emp1 = new HashMap<>();
        emp1.put("lastname","difo");
        emp1.put("firstname","back");
        testList.add(emp1);
        HashMap<String,String> emp2 = new HashMap<>();
        emp2.put("lastname","c");
        emp2.put("firstname","coke");
        testList.add(emp2);
        HashMap<String,String> emp3 = new HashMap<>();
        emp3.put("lastname","difo");
        emp3.put("firstname","god");
        testList.add(emp3);
        String[] expected= new String[]{"a","b","c"};
        String actual;
        HashMap<String,String> tempHash = new HashMap<>();
        testList = selectSort.adjust(testList,"difo");
        for(int i =0;i<testList.size();i++){
            tempHash = testList.get(i);
            actual = tempHash.get("lastname");

            assertSame("difo",actual);
        }
    }
}
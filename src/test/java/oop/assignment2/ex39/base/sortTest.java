package oop.assignment2.ex39.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class sortTest {

    @Test
    void adjust_normal() {
        sort selectSort = new sort();
        ArrayList<HashMap<String,String>> testList = new ArrayList<>();
        HashMap<String,String> emp1 = new HashMap<>();
        emp1.put("lastname","b");
        testList.add(emp1);
        HashMap<String,String> emp2 = new HashMap<>();
        emp2.put("lastname","c");
        testList.add(emp2);
        HashMap<String,String> emp3 = new HashMap<>();
        emp3.put("lastname","a");
        testList.add(emp3);
        String[] expected= new String[]{"a","b","c"};
        String actual;
        HashMap<String,String> tempHash = new HashMap<>();
        testList = selectSort.adjust(testList);
        for(int i =0;i<testList.size();i++){
           tempHash = testList.get(i);
           actual = tempHash.get("lastname");

           assertSame(expected[i],actual);
        }
    }

    @Test
    void adjust_normal_extreme() {
        sort selectSort = new sort();
        ArrayList<HashMap<String,String>> testList = new ArrayList<HashMap<String,String>>();
        HashMap<String,String> emp1 = new HashMap<>();
        emp1.put("lastname","b");
        testList.add(emp1);
        HashMap<String,String> emp2 = new HashMap<>();
        emp2.put("lastname","c");
        testList.add(emp2);
        HashMap<String,String> emp3 = new HashMap<>();
        emp3.put("lastname","ab");
        testList.add(emp3);
        HashMap<String,String> emp4 = new HashMap<>();
        emp4.put("lastname","z");
        testList.add(emp4);
        HashMap<String,String> emp5 = new HashMap<>();
        emp5.put("lastname","a");
        testList.add(emp5);
        HashMap<String,String> emp6 = new HashMap<>();
        emp6.put("lastname","g");
        testList.add(emp6);
        String[] expected= new String[]{"a","ab","b","c","g","z"};
        String actual;
        HashMap<String,String> tempHash = new HashMap<>();
        testList = selectSort.adjust(testList);
        for(int i =0;i<testList.size();i++){
            tempHash = testList.get(i);
            actual = tempHash.get("lastname");

            assertSame(expected[i],actual);
        }


    }
}
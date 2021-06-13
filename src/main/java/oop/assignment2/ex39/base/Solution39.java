package oop.assignment2.ex39.base;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution39 {
    public static void main(String[] args){
        build create = new build();
        sort selectionSort = new sort();
        print display = new print();

        ArrayList<HashMap<String,String>> empList = create.create();
        empList = selectionSort.adjust(empList);
        display.display(empList);
    }
}

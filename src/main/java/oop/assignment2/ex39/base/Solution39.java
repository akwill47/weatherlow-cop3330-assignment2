package oop.assignment2.ex39.base;
import java.util.ArrayList;
import java.util.HashMap;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 William Weatherlow
 */
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

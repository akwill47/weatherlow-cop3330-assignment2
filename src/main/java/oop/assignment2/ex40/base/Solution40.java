package oop.assignment2.ex40.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 William Weatherlow
 */
public class Solution40 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        build create = new build();
        sort search = new sort();
        print display = new print();
        System.out.print("Please enter a search string: ");
        String searchKey = in.nextLine();
        ArrayList<HashMap<String,String>> empList = create.create();
        empList=search.adjust(empList,searchKey);
        display.display(empList);

    }
}

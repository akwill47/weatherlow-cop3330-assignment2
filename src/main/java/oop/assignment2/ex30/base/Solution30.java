package oop.assignment2.ex30.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 William Weatherlow
 */
public class Solution30 {
    public static void main(String[] args){
        buildTable build = new buildTable();
        printTable print = new printTable();
        print.print(build.math());

    }
}

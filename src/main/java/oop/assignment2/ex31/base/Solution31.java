package oop.assignment2.ex31.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 William Weatherlow
 */
public class Solution31 {
    public static void main(String[] args){
        input in = new input();
        build make = new build();
        print display = new print();
        int age = in.age();
        int restRate = in.resting();
        display.printTable(make.buildTable(age,restRate),age,restRate);
    }
}

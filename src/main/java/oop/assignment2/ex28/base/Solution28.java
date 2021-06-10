package oop.assignment2.ex28.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class Solution28 {
    public static void main(String[] args){
        input get = new input();
        calc math = new calc();
        System.out.printf("The total is %d.",math.add(get.takeInput()));
    }
}

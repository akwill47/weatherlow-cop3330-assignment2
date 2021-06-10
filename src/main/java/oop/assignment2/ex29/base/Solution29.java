package oop.assignment2.ex29.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 William Weatherlow
 */
public class Solution29 {
    public static void main(String[] args){
        inputCatch call = new inputCatch();
        calc calculate = new calc();
        double years = calculate.calc(call.validate());
        System.out.printf("It will take %d years to double your investment",(int)years);

    }
}

package oop.assignment2.ex38.base;
import java.util.ArrayList;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 William Weatherlow
 */
public class Solution38 {
    public static void main(String[] args){
        input get = new input();
        filter parse = new filter();
        String[] rawInput = get.create();
        ArrayList<Integer> evenOutput = parse.filterEvenNumbers(rawInput);

        System.out.print("The even numbers are:" );
        for(int i =0;i< evenOutput.size();i++){
            System.out.printf(" %d",evenOutput.get(i));
            if(evenOutput.size()-1==i)
                System.out.print(".");
        }

    }
}

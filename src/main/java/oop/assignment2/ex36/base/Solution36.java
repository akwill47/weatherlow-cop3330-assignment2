package oop.assignment2.ex36.base;
import java.util.ArrayList;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 William Weatherlow
 */
public class Solution36 {
    public static void main(String[] args) {
        ArrayList<Integer> statsList = new ArrayList<>();
        build create = new build();
        calculate calc = new calculate();
        print print = new print();
        double std;
        double min;
        double max;
        double avg;

        statsList = create.create();
        avg = calc.average(statsList);
        min = calc.min(statsList);
        max = calc.max(statsList);

        std = calc.std(statsList,avg);

        print.display(statsList,max,min,std,avg);


    }
}

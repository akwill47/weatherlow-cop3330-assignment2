package oop.assignment2.ex36.base;

import java.util.ArrayList;

public class print {
    public void display(ArrayList<Integer> statsList,double max, double min, double std, double average){
        for(int i: statsList){
            System.out.print(i);
        }
        System.out.printf("The average is : %.1lf",average);
        System.out.printf("The minimum is : %d",min);
        System.out.printf("The maximum is : %d",max);
        System.out.printf("The standard deviation is : %.2lf",std);
    }
}

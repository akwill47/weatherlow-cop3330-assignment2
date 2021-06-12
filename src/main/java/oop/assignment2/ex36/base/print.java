package oop.assignment2.ex36.base;

import java.util.ArrayList;

public class print {
    public void display(ArrayList<Integer> statsList,double max, double min, double std, double average){
        System.out.print("Numbers:");
        for(int i=0;i<statsList.size();i++){
            System.out.printf(" %d",statsList.get(i));
            if(i<statsList.size()-1){
                System.out.print(",");
            }
        }
        System.out.printf("\nThe average is : %.1f",average);
        System.out.printf("\nThe minimum is : %d",(int)min);
        System.out.printf("\nThe maximum is : %d",(int)max);
        System.out.printf("\nThe standard deviation is : %.2f",std);
    }
}

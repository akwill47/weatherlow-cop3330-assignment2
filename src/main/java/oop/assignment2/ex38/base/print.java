package oop.assignment2.ex38.base;

import java.util.ArrayList;

public class print {
    public void display(ArrayList<Integer> output){
        System.out.print("The even numbers are:" );
        for(int i =0;i< output.size();i++){
            System.out.printf(" %d",output.get(i));
            if(output.size()-1==i)
                System.out.print(".");
        }
    }
}

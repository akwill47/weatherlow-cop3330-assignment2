package oop.assignment2.ex38.base;

import java.util.ArrayList;

public class filter {
    public ArrayList<Integer> filterEvenNumbers(String[] splitInput){
        ArrayList<Integer> evenInput = new ArrayList<Integer>();

        for(int i=0;i<splitInput.length;i++){
            if((Integer.parseInt(splitInput[i])%2)==0){
                evenInput.add(Integer.parseInt(splitInput[i]));
            }
        }

        return evenInput;
    }
}

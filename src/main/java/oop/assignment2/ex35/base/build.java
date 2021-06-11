package oop.assignment2.ex35.base;

import java.util.ArrayList;
import java.util.Scanner;

public class build {
    private static Scanner in = new Scanner(System.in);
    public ArrayList<String> make(){
        ArrayList<String> contestants = new ArrayList<String>();
        int count=0;
        while(true){
            System.out.print("Enter a name: ");
            String temp = in.nextLine();
            if(temp.length()==0)
                break;
            else
            contestants.add(temp);
        }
        return contestants;
    }
}

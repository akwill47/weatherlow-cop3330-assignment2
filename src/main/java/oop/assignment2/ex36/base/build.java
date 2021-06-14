package oop.assignment2.ex36.base;

import java.util.ArrayList;
import java.util.Scanner;

public class build {
    public static Scanner in = new Scanner(System.in);
    public ArrayList<Integer> create(){
        ArrayList<Integer> statsList = new ArrayList<>();
        String temp;
        while(true){

            try{
                System.out.print("Enter a number: ");
                temp = in.nextLine();
                if(temp.equals("done")){
                    break;
                }
                if(Integer.parseInt(temp)<=0){
                    break;
                }
                else
                statsList.add(Integer.parseInt(temp));
            }catch(NumberFormatException e){

            }

        }
        return statsList;
    }
}

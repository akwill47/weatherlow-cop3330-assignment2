package oop.assignment2.ex37.base;

import java.util.Scanner;

public class getInput {
    Scanner in = new Scanner(System.in);
    public int getInput(){
        int temp;
        while(true){
            try{
                temp = Integer.parseInt((in.nextLine()));
                break;
            }catch(NumberFormatException e){
                System.out.print("Please put in a valid number. Thank you!");
            }
        }
        return temp;
    }
}

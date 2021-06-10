package oop.assignment2.ex29.base;
import java.util.Scanner;
public class inputCatch {
    public static Scanner in = new Scanner(System.in);
    public int validate(){
        int rate;

        while(true){
            try{
                System.out.printf("What is the rate of return? ");
                rate = Integer.parseInt(in.nextLine());
                if(rate != 0){
                    break;
                }
                System.out.print("Sorry. That's not a valid input.\n");
            }catch(NumberFormatException e){
                System.out.print("Sorry. That's not a valid input.\n");
            }
        }
        return rate;
    }
}

package oop.assignment2.ex31.base;
import java.util.Scanner;
public class input {
    private static Scanner in = new Scanner(System.in);
    public int age(){
        int age;
        while(true){
            try{
                System.out.print("Please enter your age: ");
                age =Integer.parseInt(in.nextLine());
                break;

            }catch(NumberFormatException e){
                System.out.print("Please enter a valid age.");
            }
        }
        return age;
    }
    public int resting(){
        int resting;
        while(true){
            try{
                System.out.print("Please enter your resting heart rate: ");
                resting =Integer.parseInt(in.nextLine());
                break;

            }catch(NumberFormatException e){
                System.out.print("Please enter a valid resting heart rate.");
            }
        }
        return resting;
    }

}

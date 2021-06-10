package oop.assignment2.ex27.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 William Weatherlow
 */
public class Solution27 {
     private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){

        validateInput output = new validateInput();

        System.out.print("Enter the first name: ");
        String name1 = in.nextLine();
        System.out.print("Enter the last name: ");
        String name2 = in.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zip = in.nextLine();
        System.out.print("Enter the employee ID: ");
        String id = in.nextLine();


        String displayString = output.buildString(name1,name2,zip,id);
        System.out.print(displayString);
    }
}

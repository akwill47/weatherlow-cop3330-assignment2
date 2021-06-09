package oop.assignment2.ex25.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 William Weatherlow
 */
public class Solution25 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter your password: ");
        String pass = in.next();

        PasswordCheck check = new PasswordCheck();
        int strength = check.validate(pass);

        Output display = new Output();
        display.displayString(display.buildString(pass,strength));



    }

}

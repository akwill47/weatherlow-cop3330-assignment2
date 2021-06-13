package oop.assignment2.ex37.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 William Weatherlow
 */
public class Solution37 {
    public static void main(String[] args){
        build create = new build();
        getInput prompt = new getInput();
        print display = new print();
        System.out.print("Whats the minimum length? ");
        int length = prompt.getInput();
        System.out.print("How many special characters? ");
        int special = prompt.getInput();
        System.out.print("How many numbers? ");
        int nums = prompt.getInput();

        String password = create.password(length,special,nums);

        display.Pass(password);

    }
}

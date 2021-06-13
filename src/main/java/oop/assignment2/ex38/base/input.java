package oop.assignment2.ex38.base;

import java.util.ArrayList;
import java.util.Scanner;

public class input {
    Scanner in = new Scanner(System.in);
    public String[] create(){
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String rawInput = in.nextLine();
        String[] splitInput = rawInput.split(" ");


        return splitInput;
    }
}

package oop.assignment2.ex24.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 William Weatherlow
 */
public class solution24 {
    private static final Scanner in = new Scanner(System.in);
    private static String word1;
    private static String word2;

    public static void main(String[] args){

        //read in two strings
        readUserInput();
        AnagramDetector ad = new AnagramDetector();
        boolean result = ad.isAnagram(word1,word2);
        String output = generateOutput(result);
        System.out.println(output);
    }
    public static void readUserInput(){
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\n");
        System.out.print("Enter word 1: ");
        word1 = in.next();

        System.out.print("Enter word 2: ");
        word2 = in.next();

    }
    public static String generateOutput(boolean isAnagram){
        if(isAnagram){
            return "\"" + word1 +"\"" + " and " + "\"" + word2 + "\"" + " are anagrams.";
        }
        else{
            return "\"" + word1 +"\"" + " and " + "\"" + word2 + "\"" + " are not anagrams.";
        }
    }
}

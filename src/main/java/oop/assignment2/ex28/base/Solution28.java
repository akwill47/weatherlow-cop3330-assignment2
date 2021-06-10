package oop.assignment2.ex28.base;
import java.util.Scanner;
public class Solution28 {
    public static void main(String[] args){
        input get = new input();
        calc math = new calc();
        System.out.printf("The total is %d.",math.add(get.takeInput()));
    }
}

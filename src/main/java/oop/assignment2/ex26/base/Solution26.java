package oop.assignment2.ex26.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 William Weatherlow
 */
public class Solution26 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        Input in = new Input();
        PaymentCalculator Calc = new PaymentCalculator();

        double balance = in.balance();
        double dailyRate = in.apr();
        double monthlyPayment = in.monthly();

        double monthsReq = Calc.calculateMonthsUntilPaidOff(dailyRate,balance,monthlyPayment);
        System.out.printf("It will take you %lf months to pay off this card.",monthsReq);


    }
}

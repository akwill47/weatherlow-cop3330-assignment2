package oop.assignment2.ex26.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 William Weatherlow
 */
public class Solution26 {
    private static final Scanner in = new Scanner(System.in);
    public void main(String[] args){
        Input in = new Input();
        PaymentCalculator Calc = new PaymentCalculator();
        double dailyRate = in.apr();
        double balance = in.balance();
        double monthlyPayment = in.monthly();

        Double monthsReq = Calc.calculateMonthsUntilPaidOff(dailyRate,balance,monthlyPayment);


    }
}

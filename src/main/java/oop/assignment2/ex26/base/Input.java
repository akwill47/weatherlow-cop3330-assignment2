package oop.assignment2.ex26.base;

import java.util.Scanner;

public class Input {
    private static final Scanner in = new Scanner(System.in);
    public static double apr(){
        double apr = in.nextDouble();
        in.nextLine();
        double  daily = apr/365;
        return daily;
    }
    public double balance(){
        double bal = in.nextDouble();
        in.nextLine();
        return bal;
    }
    public double monthly(){
        double monthly = in.nextDouble();
        in.nextLine();
        return monthly;
    }

}

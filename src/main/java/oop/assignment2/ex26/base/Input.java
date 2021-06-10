package oop.assignment2.ex26.base;

import java.util.Scanner;

public class Input {
    private Scanner in = new Scanner(System.in);
    public  double apr(){
        System.out.print("What is the APR on the card (as a percent)? ");
        double apr = in.nextDouble();
        in.nextLine();
        double  daily = (apr/100.0)/365.0;
        return daily;
    }
    public double balance(){
        System.out.print("What is your balance? ");
        double bal = in.nextDouble();
        in.nextLine();
        return bal;
    }
    public double monthly(){
        System.out.print("What is the monthly payment you can make? ");
        double monthly = in.nextDouble();
        in.nextLine();
        return monthly;
    }

}

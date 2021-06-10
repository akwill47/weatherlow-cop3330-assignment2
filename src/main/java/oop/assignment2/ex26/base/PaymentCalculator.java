package oop.assignment2.ex26.base;

import java.lang.Math;

public class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(double dailyRate, double balance, double monthlyPay){
        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        System.out.println(dailyRate);
        System.out.println(balance);
        System.out.println(monthlyPay);

        double test1 = Math.log10(1+dailyRate);
        double test2 = Math.pow(1.0+dailyRate,30.0);

        double month = -(1/30) * (Math.log10(1+((balance/monthlyPay)*(1-(Math.pow((1+dailyRate),30))))))/(Math.log10((1+dailyRate)));
            System.out.println(test1);
            System.out.println(test2);
            System.out.println(month);

        return month;
    }
}

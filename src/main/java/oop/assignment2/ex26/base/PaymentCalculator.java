package oop.assignment2.ex26.base;

import static java.lang.Math.log;

public class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(double dailyRate, double balance, double monthlyPay){
        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        double month = -(1/30) * (log(1+balance/monthlyPay*(1-(Math.pow(1+dailyRate,30)))/log(1+dailyRate)));
            System.out.print(month);
        return month;
    }
}

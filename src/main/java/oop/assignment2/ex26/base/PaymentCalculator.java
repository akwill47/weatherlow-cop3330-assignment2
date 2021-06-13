package oop.assignment2.ex26.base;

import java.lang.Math;

public class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(double dailyRate, double balance, double monthlyPay){
        //-(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        if(dailyRate == 0){
            return balance/monthlyPay;
        }
        double month = -(1.0/30.0) * (Math.log10(1.0+(balance/monthlyPay)*(1-Math.pow(1+dailyRate,30)))/Math.log10(1.0+dailyRate));

        month = Math.ceil(month);

        return month;
    }
}

package oop.assignment2.ex29.base;

public class calc {
    public double calc(int rate){
        if(rate == 0)
            return 0;

       double years = 72/rate;

       return years;
    }
}

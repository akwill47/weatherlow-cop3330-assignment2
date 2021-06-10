package oop.assignment2.ex31.base;
import java.lang.Math;
public class build {
    public int[] buildTable(int age, int restRate){
        int[] heartRate = new int[10];
        int intensity=55;
        //TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
        for(int i=0;i<9;i++){
            heartRate[i] = (int)Math.round(((((220.0 - (double)age) - (double)restRate) * (double)intensity/100.0) + (double)restRate));
            intensity+=5;
        }
        return heartRate;
    }
}

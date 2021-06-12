package oop.assignment2.ex36.base;

import java.util.ArrayList;

public class calculate {
    public double average(ArrayList<Integer> statsList){
        double average=0;
        double sum=0;
        for(int i=0;i<statsList.size();i++){
            sum+=statsList.get(i);
        }
        average = sum/statsList.size();

        return average;
    }
    public double max(ArrayList<Integer> statsList){
        double max=statsList.get(0);
        for(int i=0;i<statsList.size();i++){
            if(max < statsList.get(i))
            max = statsList.get(i);
        }

        return max;
    }
    public double min(ArrayList<Integer> statsList) {
        double min = statsList.get(0);
        for (int i = 0; i < statsList.size(); i++) {
            if (min > statsList.get(i))
                min = statsList.get(i);
        }
        return min;
    }
    public double std(ArrayList<Integer> statsList,double mean) {
        double std=0;
        for (int i = 0; i < statsList.size(); i++) {
            std += Math.pow(statsList.get(i) - mean, 2);
        }
        std = Math.sqrt(std/statsList.size());
        return std;
    }
}

package oop.assignment2.ex31.base;

public class Solution31 {
    public static void main(String[] args){
        input in = new input();
        build make = new build();
        print display = new print();
        int age = in.age();
        int restRate = in.resting();
        display.printTable(make.buildTable(age,restRate),age,restRate);
    }
}

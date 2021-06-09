package oop.assignment2.ex27.base;

public class Solution27 {
    public static void main(String[] args){
        int[] k = new int[10];
        for(int i = 0; i < k.length; i++) {
            if(i % 2 == 0) {
                k[i] = 0;

                System.out.println(k[i]);
            }
        }
    }
}

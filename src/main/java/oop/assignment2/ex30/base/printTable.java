package oop.assignment2.ex30.base;

public class printTable {
    public void print(int[][] multiTable){
        for(int i=0;i<12;i++) {
            for(int j=0;j<12;j++){
              System.out.printf("%s",String.format("%5s", multiTable[i][j]));
            }
            System.out.print("\n");
        }
    }
}


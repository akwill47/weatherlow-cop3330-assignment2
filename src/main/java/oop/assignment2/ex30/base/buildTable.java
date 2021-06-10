package oop.assignment2.ex30.base;

public class buildTable {
    public int[][] math(){
        int[][] multiTable= new int[12][12];
        for(int i=0;i<12;i++) {
            for(int j=0;j<12;j++){
                multiTable[i][j]=(i+1)*(j+1);
            }
        }
        return multiTable;
    }

}

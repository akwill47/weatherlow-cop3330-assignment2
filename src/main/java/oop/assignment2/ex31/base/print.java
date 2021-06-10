package oop.assignment2.ex31.base;

public class print {
    public void printTable(int[] heartTable, int age, int restRate){
        int intensity=55;
        System.out.printf("Resting Pulse: %d        Age: %d\n",restRate,age);
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");
        for(int i=0;i<9;i++){
            System.out.printf("%d%%%-10s| %d bpm\n",intensity," ",heartTable[i]);
            intensity+=5;
        }
    }
}

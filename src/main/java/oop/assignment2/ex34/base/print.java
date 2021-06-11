package oop.assignment2.ex34.base;

public class print {
    public void printList(String[] empList){
        System.out.printf("\nThere are %d employees:\n",empList.length);
        for(int i =0;i<empList.length;i++){
            System.out.println(empList[i]);
        }
    }
}

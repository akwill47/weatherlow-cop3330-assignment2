package oop.assignment2.ex34.base;
import java.util.Scanner;
public class Solution34 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        print display = new print();
        remove adjust = new remove();
        search find = new search();
        String[] empList = new String[]{"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        System.out.printf("There are %d employees:\n",empList.length);
        for(int i =0;i<empList.length;i++){
            System.out.println(empList[i]);
        }
        System.out.print("\nEnter an employee to remove: ");
        String removeName = in.nextLine();

        int nameIndex = find.find(empList,removeName);
        empList = adjust.removeName(empList,nameIndex);
        display.printList(empList);

    }
}

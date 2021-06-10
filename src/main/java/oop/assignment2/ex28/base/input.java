package oop.assignment2.ex28.base;
import java.util.Scanner;
public class input {
    private static final Scanner in = new Scanner(System.in);
    int[] takeInput(){
        int[] nums = new int[5];
        for(int i =0;i<5;i++){
            System.out.print("Enter a number: ");
            nums[i]=in.nextInt();
            in.nextLine();
        }
        return nums;
    }
}

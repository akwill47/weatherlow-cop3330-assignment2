package oop.assignment2.ex40.base;

import java.util.ArrayList;
import java.util.HashMap;

public class print {

    public void display(ArrayList<HashMap<String, String>> empList) {
        HashMap<String, String> temp = new HashMap<>();

        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");

        String tempName;
        String tempPos;
        String tempDate;
        for (int i = 0; i < empList.size(); i++) {
            temp = empList.get(i);
            tempName = temp.get("firstname") + " " + temp.get("lastname");
            System.out.printf("%-20s", tempName);
            tempPos = "| " + temp.get("position");
            System.out.printf("%-20s", tempPos);
            tempDate = "| " + temp.get("startdate");
            System.out.printf("%-20s\n", tempDate);


        }
    }
}
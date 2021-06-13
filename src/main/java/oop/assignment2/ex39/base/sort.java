package oop.assignment2.ex39.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class sort {
    public ArrayList<HashMap<String,String>> adjust(ArrayList<HashMap<String,String>> empList){
        HashMap<String,String> temp = new HashMap<>();
        int i=0;
        int tempIndex=0;
        String tempString;
        for(i=0;i<empList.size();i++) {
            temp=empList.get(i);
            tempString= temp.get("firstname");
            for (int j = 0; j < empList.size(); j++) {

                temp = empList.get(j);
                if (temp.get("firstname").compareTo(tempString)<0){
                    tempIndex=j;
                }
            }
            Collections.swap(empList,i,tempIndex);
        }
        return empList;
    }
}

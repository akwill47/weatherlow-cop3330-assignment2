package oop.assignment2.ex39.base;

import java.util.ArrayList;
import java.util.HashMap;

public class sort {
    public ArrayList<HashMap<String,String>> adjust(ArrayList<HashMap<String,String>> empList){
        HashMap<String,String> temp;

        int tempIndex=0;
        String tempString;
        String tempString2;
        HashMap<String,String> tempHash;
        for(int i=1;i<empList.size();i++) {
            temp=empList.get(i-1);
            tempString= temp.get("lastname");
            for (int j = i; j < empList.size(); j++) {
                temp = empList.get(j);
                tempString2 = temp.get("lastname");
                if ((tempString2.compareTo(tempString))<0){
                    tempString = tempString2;
                    tempIndex=j;
                }
            }
            tempHash = empList.get(tempIndex);
            empList.set(tempIndex,empList.get(i-1));
            empList.set(i-1,tempHash);
        }
        return empList;
    }
}

package oop.assignment2.ex40.base;

import java.util.ArrayList;
import java.util.HashMap;

public class sort {
    public ArrayList<HashMap<String,String>> adjust(ArrayList<HashMap<String,String>> empList,String search) {
        HashMap<String, String> temp;
        ArrayList<HashMap<String, String>> tempList = new ArrayList<>();
        int tempIndex = 0;
        String tempString;
        String tempString2;
        String tempString3;
        String tempString4;
        HashMap<String,String> tempHash;
        HashMap<String,String> tempHashSort;
        int j;
        for (int i = 0; i < empList.size(); i++) {
            temp = empList.get(i);
            tempString = temp.get("firstname");
            tempString2 = temp.get("lastname");
            if (tempString.contains(search) || tempString2.contains(search)) {
                tempList.add(empList.get(i));
            }
        }
        for(int k=1;k<tempList.size();k++) {
            tempHash=empList.get(k-1);
            tempString4= tempHash.get("lastname");
            for (j = k; j < tempList.size(); j++) {
                tempHash = tempList.get(j);
                tempString3 = tempHash.get("lastname");
                if ((tempString3.compareTo(tempString4)) < 0) {
                    tempString4 = tempString3;
                    tempIndex = j;
                }
            }
            tempHashSort = tempList.get(tempIndex);
            tempList.set(tempIndex, tempList.get(k - 1));
            tempList.set(k - 1, tempHashSort);
        }


        return tempList;
    }
}
package oop.assignment2.ex34.base;

public class search {
    public int find(String[] empList, String removeName){
        int i;
        int nameIndex=-1;
        for(i=0;i<empList.length;i++){
            if(empList[i].equals(removeName)){
                nameIndex = i;
                break;
            }
        }
        return nameIndex;
    }
}

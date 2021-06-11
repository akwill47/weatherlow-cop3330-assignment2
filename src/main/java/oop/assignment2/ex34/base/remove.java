package oop.assignment2.ex34.base;

public class remove {
    public String[] removeName(String[] empList, int nameIndex){
        if(nameIndex == -1){
            System.out.print("You entered a name not on the list.\n");
            return empList;
        }

        String[] copy = new String[empList.length-1];
        int j=0;
       for (int i=0;i<empList.length;i++){
           if(i!=nameIndex){
               copy[j++] = empList[i];
           }
        }
       return copy;
    }
}

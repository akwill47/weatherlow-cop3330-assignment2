package oop.assignment2.ex40.base;

import java.util.ArrayList;
import java.util.HashMap;


public class build {
    public ArrayList<HashMap<String,String>> create(){
        ArrayList<HashMap<String,String>> empList = new ArrayList<HashMap<String,String>>();

        HashMap<String,String> emp1 = new HashMap<>();
        emp1.put("firstname","John");
        emp1.put("lastname","Johnson");
        emp1.put("position","Manager");
        emp1.put("startdate","2016-12-31");

        HashMap<String,String> emp2 = new HashMap<>();
        emp2.put("firstname","Tou");
        emp2.put("lastname","Xiong");
        emp2.put("position","Software Engineer");
        emp2.put("startdate","2016-10-05");

        HashMap<String,String> emp3 = new HashMap<>();
        emp3.put("firstname","Michaela");
        emp3.put("lastname","Michaelson");
        emp3.put("position","District Manager");
        emp3.put("startdate","2015-12-19");

        HashMap<String,String> emp4 = new HashMap<>();
        emp4.put("firstname","Jake");
        emp4.put("lastname","Jacobson");
        emp4.put("position","Programmer");
        emp4.put("startdate","");

        HashMap<String,String> emp5 = new HashMap<>();
        emp5.put("firstname","Jacquelyn");
        emp5.put("lastname","Jackson");
        emp5.put("position","DBA");
        emp5.put("startdate","");

        HashMap<String,String> emp6 = new HashMap<>();
        emp6.put("firstname","Sally");
        emp6.put("lastname","Webber");
        emp6.put("position","Web Developer");
        emp6.put("startdate","2015-12-18");

        empList.add(emp1);empList.add(emp2);empList.add(emp3);empList.add(emp4);empList.add(emp5);empList.add(emp6);

        return empList;
    }
}

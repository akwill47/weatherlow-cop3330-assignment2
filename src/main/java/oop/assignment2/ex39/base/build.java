package oop.assignment2.ex39.base;

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
        emp1.put("firstname","Tou");
        emp1.put("lastname","Xiong");
        emp1.put("position","Software Engineer");
        emp1.put("startdate","2016-10-05");

        HashMap<String,String> emp3 = new HashMap<>();
        emp1.put("firstname","Michaela");
        emp1.put("lastname","Michaelson");
        emp1.put("position","District Manager");
        emp1.put("startdate","2015-12-19");

        HashMap<String,String> emp4 = new HashMap<>();
        emp1.put("firstname","Jake");
        emp1.put("lastname","Jacobson");
        emp1.put("position","Programmer");
        emp1.put("startdate","");

        HashMap<String,String> emp5 = new HashMap<>();
        emp1.put("firstname","Jacquelyn");
        emp1.put("lastname","Jackson");
        emp1.put("position","DBA");
        emp1.put("startdate","");

        HashMap<String,String> emp6 = new HashMap<>();
        emp1.put("firstname","Sally");
        emp1.put("lastname","Webber");
        emp1.put("position","Web Developer");
        emp1.put("startdate","2015-12-18");

        empList.add(emp1);empList.add(emp2);empList.add(emp3);empList.add(emp4);empList.add(emp5);empList.add(emp6);

        return empList;
    }
}

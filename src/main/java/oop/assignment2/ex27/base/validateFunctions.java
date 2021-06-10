package oop.assignment2.ex27.base;

import java.util.regex.Pattern;

public class validateFunctions {
    public int validateName(String name) {
        String regex = "^[a-zA-Z]+$";
        int length = name.length();
        if (name.matches(regex) && length >= 2) {
            return 1;
        } else if (length < 2) {
            return 2;
        }

        else return 3;
    }
    public int validateZip(String name){
        String regex = "^[0-9]+$";
        int length = name.length();
        if(name.matches(regex) && length == 5 ){
            return 1;
        }
        else return 2;
    }

    public int validateId(String name){
        String regex = "^[A-Za-z]{2}-[0-9]{4}";
        if (name.matches(regex)){
            return 1;
        }
        else return 2;

    }

}

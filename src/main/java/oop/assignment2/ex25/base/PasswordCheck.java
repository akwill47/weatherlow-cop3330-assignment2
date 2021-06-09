package oop.assignment2.ex25.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheck {
    public int validate(String pass){
        int length = pass.length();
        boolean specialChar;
        boolean letters;
        boolean numbers;
        Pattern pat1 = Pattern.compile("[^A-zA-z0-9]");
        Matcher m1 = pat1.matcher(pass);
        if(m1.find())
            specialChar = true;
        else
            specialChar = false;

        Pattern pat2 = Pattern.compile("[0-9]");
        Matcher m2 = pat2.matcher(pass);
        if(m2.find())
            numbers = true;
        else
            numbers = false;
        Pattern pat3 = Pattern.compile("[a-zA-Z]");
        Matcher m3 = pat3.matcher(pass);
        if(m3.find())
            letters = true;
        else
            letters = false;


        if(letters == true && length >= 8 && specialChar == true && numbers == true)
            return 4;
        else if(letters == true && length >= 8 && numbers == true)
            return 3;
        else if(letters == true && length < 8)
            return 2;
        else if( numbers == true)
            return 1;


        else return 0;

    }
}

package oop.assignment2.ex25.base;

public class Output {
    public String buildString(String pass, int strength){
        if(strength == 1){
            return "The password " + "\'" + pass + "\"" + " is a very weak password.";
        }
        else if(strength == 2){
            return "The password " + "\'" + pass + "\"" + " is a weak password.";
        }
        else if(strength == 3){
            return "The password " + "\'" + pass + "\"" + " is a strong password.";
        }
        else if(strength == 4){
            return "The password " + "\'" + pass + "\"" + " is a very strong password.";
        }
        else
            return "Error validating password.";

    }

    public void displayString(String output){
        System.out.println(output);
    }
}

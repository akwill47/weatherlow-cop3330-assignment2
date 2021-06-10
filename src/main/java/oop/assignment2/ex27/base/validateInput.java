package oop.assignment2.ex27.base;

public class validateInput {
    validateFunctions validate = new validateFunctions();
    public String buildString(String name1, String name2, String zip, String id){
        String output=name1;
        int valName1 = validate.validateName(name1);
        int valName2 = validate.validateName(name2);
        int valZip = validate.validateZip(zip);
        int valId = validate.validateId(id);
        if(valName1 == 1 && valName2 == 1 && valZip == 1 && valId == 1){
            return "There were no errors found.";
        }
        if(valName1 == 2){
           output = "The first name must be at least 2 characters long.\n";
        }
        else if(valName1 == 3){
            output = "This is not a valid first name.\n";
        }
         if(name1.length() == 0){
            output += "The first name must be filled in.\n";
        }
        if(valName2 == 2 ){
            output += "The last name must be at least 2 characters long.\n";
        }
        else if(valName2 == 3){
            output += "This is not a valid last name.\n";
        }
         if(name2.length()== 0){
            output += "The last name must be filled in.\n";
        }
        if(valId == 2){
            output += "The employee ID must be in the format of AA-1234.\n";
        }
        if(valZip == 2){
           output += "The zipcode must be a 5 digit number.\n";
        }
        return output;
    }
}

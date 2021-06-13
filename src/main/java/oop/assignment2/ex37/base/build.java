package oop.assignment2.ex37.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class build {
    public String password(int length, int special, int numbers){
        getInput in = new getInput();
        int minLetters = special+numbers;
        while(minLetters>(length-(special+numbers))){
            System.out.print("Please reput a valid length to ensure an appropriate amount of letters are equal the amount of special characters and numbers: ");
            length = in.getInput();
        }
        Random r = new Random();
        String[] numList = new String[]{"1","2","3","4","5","6","7","8","9","0"};//10
        String[] specialList = new String[]{"!","@","#","$","%","&"};//6
        String[] letterList = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","t","s","u","v","w","x","y","z"};//26
        String password="";
        int count=0;
        int letterCount=0;
        int specialCount=0;
        int numCount=0;
        int randChoice;
        int numLetters= length-(special+numbers);
        while(true){
            if(count==length){
                break;
            }
            randChoice = r.nextInt(3)+1;
            if(randChoice == 1 && letterCount < numLetters){
                randChoice = r.nextInt(26);
                password+=letterList[randChoice];
                count++;
                letterCount++;

            }
            if(randChoice == 2 && numCount < numbers){
                randChoice = r.nextInt(10);
                password+=numList[randChoice];
                count++;
                numCount++;

            }
            if(randChoice == 3 && specialCount < special){
                randChoice = r.nextInt(6);
                password+=specialList[randChoice];
                count++;
                specialCount++;

            }

            if(count==length){
                break;
            }
        }
        return password;
    }
}

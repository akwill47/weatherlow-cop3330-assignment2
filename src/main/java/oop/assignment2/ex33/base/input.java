package oop.assignment2.ex33.base;

import java.util.Scanner;

public class input {
    Scanner in = new Scanner(System.in);
    public String getQuestion(){
        System.out.println("What's your question?");
        String question = in.nextLine();

        return question;
    }

}

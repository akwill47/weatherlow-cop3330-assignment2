package oop.assignment2.ex33.base;

import java.util.Random;

public class buildAnswer {
    public String build(){
        Random r = new Random();
        String[] responses = {"Yes.","No.","Maybe.","Ask again later."};
        String answer = responses[r.nextInt(4)];
        return answer;
    }
}

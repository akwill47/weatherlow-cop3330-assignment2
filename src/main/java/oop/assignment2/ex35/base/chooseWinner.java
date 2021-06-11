package oop.assignment2.ex35.base;

import java.util.ArrayList;
import java.util.Random;

public class chooseWinner {
    public String pick(ArrayList<String> contestants){
        Random r = new Random();
        String winner = contestants.get(r.nextInt(contestants.size()));

        return winner;
    }
}

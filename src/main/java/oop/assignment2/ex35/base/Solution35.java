package oop.assignment2.ex35.base;

import java.util.ArrayList;

public class Solution35 {
    public static void main(String[] args){
        build create = new build();
        chooseWinner pick = new chooseWinner();
        ArrayList<String> contestants = create.make();

        String winner = pick.pick(contestants);
        System.out.printf("The winner is... %s.",winner);

    }
}

package oop.assignment2.ex33.base;

public class Solution33 {
    public static void main(String[] args) {
        buildAnswer build = new buildAnswer();
        displayAnswer print = new displayAnswer();
        input ask = new input();

        String question = ask.getQuestion();
        String answer = build.build();

        print.display(question,answer);
    }
}

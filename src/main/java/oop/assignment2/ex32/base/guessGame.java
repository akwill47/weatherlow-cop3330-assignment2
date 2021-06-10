package oop.assignment2.ex32.base;
import java.util.Random;
import java.util.Scanner;
public class guessGame {
    Scanner in = new Scanner(System.in);
    public int guessLoop(int compNum) {
        int guess;
        int count = 0;
        while (true) {
            while (true) {
                try {
                    guess = Integer.parseInt(in.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Please enter a valid numerical number.\n");
                    count++;
                }
            }
            if(checkGuess(guess,compNum)==4){
                count++;
                break;
            }
            else count++;

        }
        System.out.printf("You got it in %d guesses!\n",count);
        return count;
    }

    public int difficulty(){
        int diff;
        while(true){
            System.out.print("\nEnter the difficulty level (1, 2, or 3): ");
            try{diff = Integer.parseInt(in.nextLine());
                if(diff == 1 || diff == 2 || diff == 3){
                    break;
                }
                System.out.print("Please enter a valid difficulty level.");
            }catch(NumberFormatException e){
                System.out.print("Please enter a valid difficulty level.");
            }
        }
        return diff;
    }

    public int generateCompNum(int diff){
        Random r = new Random();
        int compNum=0;
        if (diff == 1) {
            compNum = r.nextInt(10) + 1;
        } else if (diff == 2) {
            compNum = r.nextInt(100) + 1;
        } else if (diff == 3) {
            compNum = r.nextInt(1000) + 1;
        }
        return compNum;
    }
    public int checkGuess(int guess, int compNum){
        if (guess < compNum) {
            System.out.print("Too low. Guess again: ");
            return 2;
        } else if (guess > compNum) {
            System.out.print("Too high. Guess again: ");
            return 3;
        } else if (guess == compNum) {
            return 4;
        }
        else return 1;
    }
    public void run(){
        String nextGame = "y";

        while(nextGame.equals("y")) {
            int diff = difficulty();
            int compNum = generateCompNum(diff);
            System.out.print("I have my number. What's your guess? ");

            guessLoop(compNum);
            System.out.print("\nDo you wish to play again (Y/N)?");
            nextGame = in.nextLine();
        }
        System.out.print("\nGoodbye! I hope you had fun!");
    }
}

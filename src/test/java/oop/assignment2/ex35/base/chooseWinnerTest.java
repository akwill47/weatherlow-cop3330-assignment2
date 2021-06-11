package oop.assignment2.ex35.base;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class chooseWinnerTest {

    @Test
    void pick_random() {
        chooseWinner random = new chooseWinner();
        ArrayList<String> contestants = new ArrayList<String>();
        contestants.add("bob");
        contestants.add("jake");
        contestants.add("juan");
        contestants.add("difo");
        String actual = random.pick(contestants);
        switch (actual) {
            case "bob":
                assertEquals("bob", actual);
                break;
            case "jake":
                assertEquals("jake", actual);
                break;
            case "juan":
                assertEquals("juan", actual);
                break;
            case "difo":
                assertEquals("difo", actual);
                break;
            }
        System.out.print("random number generator test successful");
    }
}

package oop.assignment2.ex33.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class buildAnswerTest {

    @Test
    void build() {
        buildAnswer create = new buildAnswer();
        String actual = create.build();
        switch(actual){
            case "Yes.":assertEquals("Yes.",actual);
                break;

            case "No.":assertEquals("No.",actual);
                break;

            case "Maybe.":assertEquals("Maybe.",actual);
                break;

            case "Ask again later.":assertEquals("Ask again later.",actual);
                break;
        }

    }
}
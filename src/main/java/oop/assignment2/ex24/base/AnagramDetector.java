package oop.assignment2.ex24.base;

import java.util.Arrays;

public class AnagramDetector {
    public boolean isAnagram(String word1, String word2) {

        int n1 = word1.length();
        int n2 = word2.length();
        if(n1 != n2)
            return false;
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();//converts string to char arrays
        Arrays.sort(ch1);
        Arrays.sort(ch2);//sorts the arrays


        for (int i = 0; i < n1; i++)
            if (ch1[i] != ch2[i])//compares based on strlen
                return false;
        return true;
    }
}

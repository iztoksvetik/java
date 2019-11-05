package io.iztok.katas;

import java.util.Arrays;

public class LongestConsec {

    public static String longestConsec(String[] strings, int i) {
        String longest =  "";
        int last = i;
        while (last <= strings.length && last > 0) {
            String current = String.join("", Arrays.copyOfRange(strings, last - i, last));
            if (current.length() > longest.length()) {
                longest = current;
            }
            last++;
        }
        return longest;
    }
}

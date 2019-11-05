package io.iztok.katas;

import java.util.Arrays;

public class VasyaClerk {
    public static String Tickets(int[] ints) {
        int[] notes = new int[3];
        for (int note: ints) {
            notes = till(note, notes);
            if (Arrays.stream(notes).filter(num -> num < 0).findFirst().isPresent()) {
                return "NO";
            }
        }
        return "YES";
    }

    static int[] till(int note, int[] till) {
        switch (note) {
            case 100:
                till[2] += 1;
                till[1] -= 1;
                till[0] -= 1;
                break;
            case 50:
                till[1] += 1;
                till[0] -= 1;
                break;
            case 25:
                till[0] += 1;
                break;
        }
        return till;
    }
}

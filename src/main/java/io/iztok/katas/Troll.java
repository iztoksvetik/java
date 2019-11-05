package io.iztok.katas;

public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeiou]|[AEIOU]", "");
    }
}

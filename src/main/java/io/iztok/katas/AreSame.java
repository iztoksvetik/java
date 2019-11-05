package io.iztok.katas;

import java.util.Arrays;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if (a==null || b == null) return false;
        return Arrays.equals(Arrays.stream(b).sorted().toArray(), Arrays.stream(a).map(x -> x*x).sorted().toArray());
    }
}

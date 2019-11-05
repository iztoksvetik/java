package io.iztok.katas;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    static int findIt(int[] integers) {
        Map<Integer, Integer> counts = getCounts(integers);
        for (Map.Entry<Integer, Integer> val: counts.entrySet()) {
            if (val.getValue() % 2 == 1) {
                return val.getKey();
            }
        }
        return -1;
    }

    static Map<Integer, Integer> getCounts(int[] integers) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int integer: integers) {
            if (!counts.containsKey(integer)) {
                counts.put(integer, 0);
            }
            counts.put(integer, counts.get(integer) + 1);
        }
        return counts;
    }
}

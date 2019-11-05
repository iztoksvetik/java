package io.iztok.katas;

import java.util.stream.IntStream;

public class Multiples {
    public int solution(int number) {
        return IntStream.range(3, number).filter(natural -> natural % 3 == 0 || natural % 5 == 0).sum();
    }
}

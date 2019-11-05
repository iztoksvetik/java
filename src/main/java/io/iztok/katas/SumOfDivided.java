package io.iztok.katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfDivided {
    public static String sumOfDivided(int[] l) {
        int biggest = getTheBiggestIntegerIn(l);
        List<Integer> primes = getPrimesTo(biggest);

        return primes.stream()
                .filter(prime -> Arrays.stream(l).anyMatch(el -> el % prime == 0))
                .map(prime -> {
                    int sum = Arrays.stream(l).filter(el -> el % prime == 0).sum();
                    return String.format("(%d %d)", prime, sum);
                })
                .collect(Collectors.joining());
    }

    private static List<Integer> getPrimesTo(int biggest) {
        boolean[] matrix = new boolean[biggest + 1];
        Arrays.fill(matrix, true);

        for (int i = 2; i * i <= biggest; i++) {
            if (matrix[i]) {
                for (int j = i * 2; j <= biggest; j += i) {
                    matrix[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < biggest; i++) {
            if (matrix[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    private static int getTheBiggestIntegerIn(int[] integers) {
        return Arrays.stream(integers).map(Math::abs).max().orElse(0);
    }
}

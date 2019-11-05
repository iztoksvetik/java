package io.iztok.katas;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

class Decompose {
    public Decompose() {
    }

    public String decompose(long n) {
        Stream<Long> possibleSizes = LongStream.range(1, 1 << (n-1))
                .boxed().sorted(Comparator.reverseOrder());

        List<Long> bestCombination = permutations(possibleSizes, n - 1)
                .filter(permutation -> permutation.stream()
                        .reduce(0L, (a, b) -> a + (b*b)) == n * n)
                .findFirst()
                .orElse(null);

        if (bestCombination == null) {
            return null;
        }
        return bestCombination.stream()
                .filter(number -> number != 0)
                .map(Object::toString)
                .collect(Collectors.joining(" "));

    }

    private Stream<List<Long>> permutations(Stream<Long> numbers, long length) {
        return numbers.map(number -> LongStream.range(1, length + 1)
                        .map(pos -> ((1 << pos - 1) & number) != 0 ? pos : 0)
                        .boxed().collect(Collectors.toList()));
    }
}

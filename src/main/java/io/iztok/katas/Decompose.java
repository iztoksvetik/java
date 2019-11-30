package io.iztok.katas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Decompose {
    public Decompose() {
    }

    public String decompose(long n) {
        var result = find(n, n*n, n*n, new ArrayList<>());
        if (result == null) {
            return null;
        }
        Collections.reverse(result);
        return result.stream().map(Object::toString).collect(Collectors.joining(" "));
    }

    private Long next(Long rest) {
        return (long) Math.sqrt(rest);
    }

    private List<Long> find(Long start, Long rest, Long total, List<Long> current) {
        if (rest == 0) {
            if (current.stream().map(x -> x*x).reduce(Long::sum).orElse(0L).equals(total)) {
                return current;
            }
            return null;
        }
        var next = start - 1;
        if (next*next > rest) {
            next = next(rest);
        }
        while (next > 0) {
            var newCurrent = new ArrayList<>(current);
            newCurrent.add(next);
            var newResult = find(next, (rest-next*next), total, newCurrent);
            if (newResult != null) {
                return newResult;
            }
            next--;
        }
        return null;
    }
}

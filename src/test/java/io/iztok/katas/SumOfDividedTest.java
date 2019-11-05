package io.iztok.katas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SumOfDividedTest {

    @Test
    public void testOne() {
        int[] lst = new int[] {12, 15};
        int[] lst1 = new int[] {-12, -15};
        int[] lst2 = new int[] {-29804, -4209, -28265, -72769, -31744};

        assertEquals("(2 12)(3 27)(5 15)", SumOfDivided.sumOfDivided(lst));
        assertEquals("(2 -12)(3 -27)(5 -15)", SumOfDivided.sumOfDivided(lst1));
        assertEquals("(2 -12)(3 -27)(5 -15)", SumOfDivided.sumOfDivided(lst2));

    }
}

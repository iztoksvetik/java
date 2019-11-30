package io.iztok.katas;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecomposeTest {
    // 50 - [1,3,5,8,49]
    // 625 - [2,5,8,34,624]
    // 11 - [1,2,4,10]
    // 12 - [1,2,3,7,9]
    // 44 - [2,3,5,7,43]
    private Decompose decompose;
    @BeforeEach
    void setUp() {
        decompose = new Decompose();
    }

    @Test
    void test11() {
        assertEquals("1 2 4 10", decompose.decompose(11));
    }

    @Test
    void test12() {
        assertEquals("1 2 3 7 9", decompose.decompose(12));
    }

    @Test
    void test50() {
        assertEquals("1 3 5 8 49", decompose.decompose(50));
    }

    @Test
    void test625() {
        assertEquals("2 5 8 34 624", decompose.decompose(625));
    }

    @Test
    void test44() {
        assertEquals("2 3 5 7 43", decompose.decompose(44));
    }

    @Test
    void test4() {
        assertNull(decompose.decompose(4));
    }

}

package io.iztok.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VasyaClerkTest {
    @Test
    public void test1() {
        assertEquals("YES", VasyaClerk.Tickets(new int[] {25, 25, 50}));
    }
    @Test
    public void test2() {
        assertEquals("NO", VasyaClerk.Tickets(new int []{25, 100}));
    }
    @Test
    public void test3() {
        assertEquals("NO", VasyaClerk.Tickets(new int []{25, 25, 50, 50, 100}));
    }

    @Test
    public void test4() {
        assertEquals("YES", VasyaClerk.Tickets(new int []{25, 25, 50, 50, 25, 100}));
    }
}

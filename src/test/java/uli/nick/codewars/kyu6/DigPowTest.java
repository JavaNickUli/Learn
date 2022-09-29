package uli.nick.codewars.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigPowTest {

    @Test
    void digPow() {
        assertEquals(1, DigPow.digPow(89, 1));
        assertEquals(-1, DigPow.digPow(92, 1));
        assertEquals(51, DigPow.digPow(46288, 3));
    }
}
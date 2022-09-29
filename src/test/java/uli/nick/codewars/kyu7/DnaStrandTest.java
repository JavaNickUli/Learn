package uli.nick.codewars.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DnaStrandTest {

    @Test
    void makeComplement() {
        assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
        assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
        assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
    }
}
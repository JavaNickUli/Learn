package uli.nick.codewars.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpinWordsTest {

    @Test
    void spinWords() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
        assertEquals("Hey wolle sroir", new SpinWords().spinWords("Hey ellow riors"));
        assertEquals("Hey llow iors", new SpinWords().spinWords("Hey llow iors"));
    }
}
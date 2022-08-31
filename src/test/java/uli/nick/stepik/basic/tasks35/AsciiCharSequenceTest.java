package uli.nick.stepik.basic.tasks35;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class AsciiCharSequenceTest {

    AsciiCharSequence ascii = new AsciiCharSequence("Hello Underworld!".getBytes());

    @Test
    void lengthTest() {
        int actual = ascii.length();
        int expected = 17;

        then(actual == expected).isTrue();
    }

    @Test
    void charAtTest0() {
        char actual = ascii.charAt(4);
        char expected = 'o';

        then(actual == expected).isTrue();
    }

    @Test
    void charAtTest1() {
        char actual = ascii.charAt(6);
        char expected = 'U';

        then(actual == expected).isTrue();
    }

    @Test
    void subSequenceTest() {
        CharSequence actual = ascii.subSequence(6, 11);
        CharSequence expected = new AsciiCharSequence("Under".getBytes());

        then(actual.toString()).isEqualTo(expected.toString());
    }

    @Test
    void testToStringTest() {
        String actual = ascii.toString();
        String expected = "Hello Underworld!";

        then(actual).isEqualTo(expected);
    }
}

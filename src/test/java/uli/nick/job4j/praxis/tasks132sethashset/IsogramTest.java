package uli.nick.job4j.praxis.tasks132sethashset;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class IsogramTest {

    @Test
    void checkStringTrue() {
        String s = "uncopyrightables";
        boolean actual = Isogram.checkString(s);

        then(actual).isTrue();
    }

    @Test
    void checkStringFalse() {
        String s = "javascript";
        boolean actual = Isogram.checkString(s);

        then(actual).isFalse();
    }
}

package uli.nick.job4j.praxis.tasks132sethashset;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.jupiter.api.Assertions.*;

class PangramTest {

    @Test
    void checkString() {
        String string = "Jackdaws love my big sphinx of quartz";
        boolean actual = Pangram.checkString(string);

        then(actual).isTrue();
    }
}

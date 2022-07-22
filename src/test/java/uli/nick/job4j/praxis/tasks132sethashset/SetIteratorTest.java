package uli.nick.job4j.praxis.tasks132sethashset;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class SetIteratorTest {

    @Test
    void main() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        SetIterator.main(null);

        String actual = output.toString();
        String ln = System.lineSeparator();
        String expected = "Next element exist? - true." + ln + "five" + ln
                + "Next element exist? - true." + ln + "four" + ln
                + "Next element exist? - true." + ln + "one" + ln
                + "Next element exist? - true." + ln + "three" + ln
                + "Next element exist? - true." + ln + "two" + ln;

        then(actual).isEqualTo(expected);
    }
}

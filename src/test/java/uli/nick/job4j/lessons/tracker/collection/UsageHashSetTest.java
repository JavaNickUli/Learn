package uli.nick.job4j.lessons.tracker.collection;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class UsageHashSetTest {

    @Test
    void mainCheckingConsoleOutput() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        UsageHashSet.main(null);

        String actual = output.toString();
        String ln = System.lineSeparator();
        String expected = String.join(ln, "Volvo", "Toyota", "Lada", "BMW") + ln;

        then(actual).isEqualTo(expected);
    }
}

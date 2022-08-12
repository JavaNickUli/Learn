package uli.nick.job4j.praxis.tasks111firstprogram;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class Task13Test {

    @Test
    void mainTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String input = String.format("%f %f", 1.0, 0.1);
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
        Task13.main(null);

        String actual = out.toString();
        String ln = System.lineSeparator();
        String expected = String.join(ln, "1.1", "0.9", "0.1", "10.0") + ln;

        then(actual).isEqualTo(expected);
    }
}

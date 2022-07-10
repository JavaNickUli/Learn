package uli.nick.job4j.praxis.tasks112datatype;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class ShortTypeTest {

    @Test
    void whenEnterMaxValueShortThenOutMaxValueShort() {
        System.setIn(new ByteArrayInputStream("32767".getBytes()));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        ShortType.main(null);

        String actual = output.toString();
        String expected = "32767" + System.lineSeparator();

        then(actual).isEqualTo(expected);
    }

    @Test
    void whenEnter0ThenOut0() {
        System.setIn(new ByteArrayInputStream("0".getBytes()));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        ShortType.main(null);

        String actual = output.toString();
        String expected = "0" + System.lineSeparator();

        then(actual).isEqualTo(expected);
    }

    @Test
    void whenEnterMinValueShortThenOutMinValueShort() {
        System.setIn(new ByteArrayInputStream("-32768".getBytes()));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        ShortType.main(null);

        String actual = output.toString();
        String expected = "-32768" + System.lineSeparator();

        then(actual).isEqualTo(expected);
    }
}

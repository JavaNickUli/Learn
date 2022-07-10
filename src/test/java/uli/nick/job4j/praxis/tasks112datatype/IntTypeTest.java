package uli.nick.job4j.praxis.tasks112datatype;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class IntTypeTest {

    @Test
    void whenEnterMaxValueIntThenOutMaxValueInt() {
        System.setIn(new ByteArrayInputStream("2147483647".getBytes()));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        IntType.main(null);

        String actual = output.toString();
        String expected = "2147483647" + System.lineSeparator();

        then(actual).isEqualTo(expected);
    }

    @Test
    void whenEnter0ThenOut0() {
        System.setIn(new ByteArrayInputStream("0".getBytes()));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        IntType.main(null);

        String actual = output.toString();
        String expected = "0" + System.lineSeparator();

        then(actual).isEqualTo(expected);
    }

    @Test
    void whenEnterMinValueIntThenOutMinValueInt() {
        System.setIn(new ByteArrayInputStream("-2147483648".getBytes()));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        IntType.main(null);

        String actual = output.toString();
        String expected = "-2147483648" + System.lineSeparator();

        then(actual).isEqualTo(expected);
    }
}

package uli.nick.job4j.praxis.tasks112datatype;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class IntTypeTest {

    @Test
    void whenEnter4ThenOut4() {
        System.setIn(new ByteArrayInputStream("4".getBytes()));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        IntType.main(null);

        String actual = output.toString();
        String expected = "4" + System.lineSeparator();

        then(actual).isEqualTo(expected);
    }
}

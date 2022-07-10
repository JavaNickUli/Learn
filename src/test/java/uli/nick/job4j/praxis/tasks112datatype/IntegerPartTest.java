package uli.nick.job4j.praxis.tasks112datatype;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class IntegerPartTest {

    @Test
    void checkTestOut() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IntegerPart.main(null);

        String actual = out.toString();
        String expected = "2" + System.lineSeparator();

        then(actual).isEqualTo(expected);
    }
}

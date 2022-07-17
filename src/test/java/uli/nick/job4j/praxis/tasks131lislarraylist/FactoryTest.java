package uli.nick.job4j.praxis.tasks131lislarraylist;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class FactoryTest {

    @Test
    void mainCheckingOutputConsole() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        Factory.main(null);

        String actual = output.toString();
        String ln = System.lineSeparator();
        String expected = String.join(ln, "first", "second", "third", "fourth", "fifth") + ln;

        then(actual).isEqualTo(expected);
    }
}

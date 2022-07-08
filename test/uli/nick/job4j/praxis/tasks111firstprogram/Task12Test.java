package uli.nick.job4j.praxis.tasks111firstprogram;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class Task12Test {

    @Test
    public void checkOutHelloJob4j() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task12.main(null);

        String actual = out.toString();
        String expected = "Ping" + System.lineSeparator()
                + "Pong" + System.lineSeparator();

        then(actual).isEqualTo(expected);
    }
}

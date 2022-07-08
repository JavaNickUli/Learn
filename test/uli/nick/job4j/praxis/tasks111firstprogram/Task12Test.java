package uli.nick.job4j.praxis.tasks111firstprogram;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

/**
 * {@code System.lineSeparator()} - Microsoft Windows systems it returns "\r\n".
 * <pre>{@code System.out.println("Ping\nPong");}</pre>
 * conform {@code "Ping\nPong\r\n"}
 * <pre>{@code System.out.println("Ping");
 * System.out.println("Pong");}</pre>
 * conform {@code "Ping\r\nPong\r\n"}
 */

class Task12Test {

    @Test
    public void checkOutHelloJob4j() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task12.main(null);

        String actual = out.toString().replace(System.lineSeparator(), "\n");
        String expected = "Ping\nPong\n";

        then(actual).isEqualTo(expected);
    }
}

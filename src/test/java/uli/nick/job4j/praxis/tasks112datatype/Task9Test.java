package uli.nick.job4j.praxis.tasks112datatype;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class Task9Test {

    @Test
    void when5And7Then12AndNeg2And35And0() {
        System.setIn(new ByteArrayInputStream("5 7".getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task9.main(null);

        String actual = out.toString();
        String ln = System.lineSeparator();
        String expected = String.join(ln, "12", "-2", "35", "0") + ln;

        then(actual).isEqualTo(expected);
    }

    @Test
    void when7And5Then12And2And35And1() {
        System.setIn(new ByteArrayInputStream("7 5".getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task9.main(null);

        String actual = out.toString();
        String ln = System.lineSeparator();
        String expected = String.join(ln, "12", "2", "35", "1") + ln;

        then(actual).isEqualTo(expected);
    }

    @Test
    void whenNeg5And7Then2AndNeg12AndNeg35And0() {
        System.setIn(new ByteArrayInputStream("-5 7".getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task9.main(null);

        String actual = out.toString();
        String ln = System.lineSeparator();
        String expected = String.join(ln, "2", "-12", "-35", "0") + ln;

        then(actual).isEqualTo(expected);
    }

    @Test
    void whenNeg7And5ThenNeg2AndNeg12AndNeg35AndNeg1() {
        System.setIn(new ByteArrayInputStream("-7 5".getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task9.main(null);

        String actual = out.toString();
        String ln = System.lineSeparator();
        String expected = String.join(ln, "-2", "-12", "-35", "-1") + ln;

        then(actual).isEqualTo(expected);
    }

    @Test
    void when5AndNeg7ThenNeg2And12AndNeg35And0() {
        System.setIn(new ByteArrayInputStream("5 -7".getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task9.main(null);

        String actual = out.toString();
        String ln = System.lineSeparator();
        String expected = String.join(ln, "-2", "12", "-35", "0") + ln;

        then(actual).isEqualTo(expected);
    }

    @Test
    void when7AndNeg5Then2And12AndNeg35AndNeg1() {
        System.setIn(new ByteArrayInputStream("7 -5".getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task9.main(null);

        String actual = out.toString();
        String ln = System.lineSeparator();
        String expected = String.join(ln, "2", "12", "-35", "-1") + ln;

        then(actual).isEqualTo(expected);
    }

    @Test
    void when0And7Then7AndNeg7And0And0() {
        System.setIn(new ByteArrayInputStream("0 7".getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task9.main(null);

        String actual = out.toString();
        String ln = System.lineSeparator();
        String expected = String.join(ln, "7", "-7", "0", "0") + ln;

        then(actual).isEqualTo(expected);
    }

    @Test
    void when5And0Then5And5And0AndDivByZero() {
        System.setIn(new ByteArrayInputStream("5 0".getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        try {
            Task9.main(null);
        } catch (ArithmeticException e) {
            then(e.getMessage()).isEqualTo("/ by zero");
        }

        String actual = out.toString();
        String ln = System.lineSeparator();
        String expected = String.join(ln, "5", "5", "0") + ln;

        then(actual).isEqualTo(expected);
    }
}

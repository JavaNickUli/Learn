package uli.nick.job4j.praxis.tasks111firstprogram;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class PrintTest {

    @Test
    void checkPrint() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Print.main(null);

        String actual = out.toString();
        String expected = "Сегодня я молодец!";

        then(actual).isEqualTo(expected);
    }
}

package uli.nick.job4j.praxis.tasks111firstprogram;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class PraiseTest {

    @Test
    public void checkPraise() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Praise.main(null);

        String actual = out.toString();
        String expected = "Сегодня я молодец!" + System.lineSeparator();

        then(actual).isEqualTo(expected);
    }
}

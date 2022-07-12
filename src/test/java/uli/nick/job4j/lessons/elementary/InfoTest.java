package uli.nick.job4j.lessons.elementary;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.assertj.core.api.BDDAssertions.then;

class InfoTest {

    @Test
    void checkDateFormat() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Info.main(null);

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        format.setLenient(false);

        try {
            Date date = format.parse(out.toString());
            then(date).isToday();
        } catch (ParseException e) {
            throw new RuntimeException("Invalid date format: " + out);
        }

    }
}

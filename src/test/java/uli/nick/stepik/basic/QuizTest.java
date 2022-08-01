package uli.nick.stepik.basic;

import org.junit.jupiter.api.Test;
import uli.nick.stepik.basic.tasks13.Quiz;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class QuizTest {

    @Test
    void mainCheckingOutput() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        try {
            Quiz.main(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        String actual = output.toString();
        String expected = "ec5287c45f0e70ec22d52e8bcbeeb640";

        then(actual).isEqualTo(expected);
    }
}

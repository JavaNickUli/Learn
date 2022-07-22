package uli.nick.job4j.praxis.tasks131lislarraylist;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class AlphabetTest {

    @Test
    void reformatTest1() {
        String actual = Alphabet.reformat("javascript");
        String expected = "aacijprstv";

        then(actual).isEqualTo(expected);
    }

    @Test
    void reformatTest2() {
        String actual = Alphabet.reformat("websecurityconfigureradapter");
        String expected = "aabccdeeeefgiinoprrrrsttuuwy";

        then(actual).isEqualTo(expected);
    }
}

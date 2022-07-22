package uli.nick.job4j.praxis.tasks131lislarraylist;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class ArProgressionTest {

    @Test
    void checkDataIsNotZero() {
        List<Integer> data = List.of(1, 6, 11, 16, 21, 26, 31, 36, 41, 46);

        int actual = ArProgression.checkData(data);
        int expected = 235;

        then(actual).isEqualTo(expected);
    }

    @Test
    void checkDataIsZero() {
        List<Integer> data = List.of(1, 6, 11, 15, 21, 26, 31, 36, 41, 46);

        int actual = ArProgression.checkData(data);
        int expected = 0;

        then(actual).isEqualTo(expected);
    }
}

package uli.nick.job4j.praxis.tasks131lislarraylist;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class GeomProgressionTest {

    @Test
    void generateAndSum() {
        int actual = GeomProgression.generateAndSum(1, 3, 10);

        then(actual).isEqualTo(29524);
    }

    @Test
    void generateAndSumIs0() {
        int actual = GeomProgression.generateAndSum(1, -1, 10);

        then(actual).isEqualTo(0);
    }
}

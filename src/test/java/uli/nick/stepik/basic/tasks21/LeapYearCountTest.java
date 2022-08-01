package uli.nick.stepik.basic.tasks21;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class LeapYearCountTest {

    @Test
    void leapYearCountTest0() {
        then(LeapYearCount.leapYearCount(1) == 0).isTrue();
    }

    @Test
    void leapYearCountTest1() {
        then(LeapYearCount.leapYearCount(4) == 1).isTrue();
    }

    @Test
    void leapYearCountTest2() {
        then(LeapYearCount.leapYearCount(100) == 24).isTrue();
    }

    @Test
    void leapYearCountTest3() {
        then(LeapYearCount.leapYearCount(400) == 97).isTrue();
    }
}

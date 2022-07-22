package uli.nick.job4j.praxis.tasks132sethashset;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class JackpotTest {

    @Test
    void checkYourWinTrue() {
        String[] combination = {"@", "@", "@", "@"};
        boolean actual = Jackpot.checkYourWin(combination);

        then(actual).isTrue();
    }

    @Test
    void checkYourWinFalse() {
        String[] combination = {"&&", "&", "&&&", "&&&&"};
        boolean actual = Jackpot.checkYourWin(combination);

        then(actual).isFalse();
    }
}

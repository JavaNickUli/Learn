package uli.nick.job4j.praxis.tasks132sethashset;

import org.junit.jupiter.api.Test;
import uli.nick.job4j.praxis.tasks132sethashset.UniqueName.User;

import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class UniqueNameTest {

    @Test
    void collectUniqueName() {
        List<User> users = List.of(
                new User(1, "name1"),
                new User(2, "name2"),
                new User(3, "name1"),
                new User(4, "name3"),
                new User(5, "name5"),
                new User(6, "name3")
        );
        int actual = UniqueName.collectUniqueName(users);
        int expected = 4;

        then(actual).isEqualTo(expected);
    }
}

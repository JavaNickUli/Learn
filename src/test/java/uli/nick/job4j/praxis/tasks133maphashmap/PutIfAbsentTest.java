package uli.nick.job4j.praxis.tasks133maphashmap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.BDDAssertions.then;
import static uli.nick.job4j.praxis.tasks133maphashmap.PutIfAbsent.User;

class PutIfAbsentTest {

    @Test
    void addNewElementIsFalse() {
        Map<Integer, User> map = new HashMap<>(
                Map.of(
                        1, new User(1, "Name1"),
                        2, new User(2, "Name2")
                )
        );
        PutIfAbsent put = new PutIfAbsent(map);
        User user = new User(1, "Name3");
        boolean actual = put.addNewElement(user);

        then(actual).isFalse();
    }

    @Test
    void addNewElementIsTrue() {
        Map<Integer, User> map = new HashMap<>(
                Map.of(
                        1, new User(1, "Name1"),
                        2, new User(2, "Name2")
                )
        );
        PutIfAbsent put = new PutIfAbsent(map);
        User user = new User(3, "Name3");
        boolean actual = put.addNewElement(user);

        then(actual).isTrue();
    }
}

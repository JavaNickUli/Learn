package uli.nick.job4j.praxis.tasks133maphashmap;

import org.junit.jupiter.api.Test;
import uli.nick.job4j.praxis.tasks133maphashmap.PutContainsKey.User;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.BDDAssertions.then;

class PutContainsKeyTest {

    @Test
    void addNewElementWithoutCheck() {
        User one = new User(1, "Name1");
        User two = new User(2, "Name2");
        User three = new User(1, "Name3");
        List<User> list = List.of(one, two, three);

        Map<Integer, User> actual = PutContainsKey.addNewElementWithoutCheck(list);
        Map<Integer, User> expected = Map.of(1, three, 2, two);

        then(actual).isEqualTo(expected);
    }

    @Test
    void addNewElementWithCheck() {
        User one = new User(1, "Name1");
        User two = new User(2, "Name2");
        User three = new User(1, "Name3");
        List<User> list = List.of(one, two, three);

        Map<Integer, User> actual = PutContainsKey.addNewElementWithCheck(list);
        Map<Integer, User> expected = Map.of(1, one, 2, two);

        then(actual).isEqualTo(expected);
    }
}

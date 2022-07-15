package uli.nick.job4j.lessons.tracker.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class UniqueTextTest {

    @Test
    void isEqualsTrue() {
        String origin = "My cat eats a mouse and milk";
        String text = "My cat eats milk and a mouse";

        then(UniqueText.isEquals(origin, text)).isTrue();
    }

    @Test
    void isEqualsFalse() {
        String origin = "My cat eats a mouse";
        String text = "A mouse is eaten by a cat";

        then(UniqueText.isEquals(origin, text)).isFalse();
    }
}

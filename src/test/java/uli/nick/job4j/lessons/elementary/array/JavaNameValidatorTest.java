package uli.nick.job4j.lessons.elementary.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;
import static uli.nick.job4j.lessons.elementary.array.JavaNameValidator.isNameValid;

class JavaNameValidatorTest {

    @Test
    void whenFullLatValid() {
        then(isNameValid("first")).isTrue();
    }

    @Test
    void whenLatNumberValid() {
        then(isNameValid("first1")).isTrue();
    }

    @Test
    void whenLatNumberUnderValid() {
        then(isNameValid("first_user")).isTrue();
    }

    @Test
    void whenNumberInValid() {
        then(isNameValid("123")).isFalse();
    }
}

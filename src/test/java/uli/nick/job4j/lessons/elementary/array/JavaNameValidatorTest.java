package uli.nick.job4j.lessons.elementary.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;
import static uli.nick.job4j.lessons.elementary.array.JavaNameValidator.isNameValid;

class JavaNameValidatorTest {

    @Test
    void whenEmptyNameInvalid() {
        then(isNameValid("")).isFalse();
    }

    @Test
    void whenFullLatValid() {
        then(isNameValid("first")).isTrue();
    }

    @Test
    void whenFullLatAndSomeUpperCaseLettersValid() {
        then(isNameValid("fIRST")).isTrue();
    }

    @Test
    void whenLatNumberValid() {
        then(isNameValid("first1")).isTrue();
    }

    @Test
    void whenLatWithSpecialSymbolUnderValid() {
        then(isNameValid("first_user")).isTrue();
    }

    @Test
    void whenNumberInValid() {
        then(isNameValid("123")).isFalse();
    }

    @Test
    void whenFirstLatinUpperCaseIsInvalid() {
        then(isNameValid("First")).isFalse();
    }

    @Test
    void whenLatNumberAndTwoSpecialSymbolsUnderValid() {
        then(isNameValid("fir$t_u$er_1")).isTrue();
    }

    @Test
    void whenFullLatValidTest() {
        then(isNameValid("first")).isTrue();
    }

    @Test
    void whenLatNumberValidTest() {
        then(isNameValid("first1")).isTrue();
    }

    @Test
    void whenLatNumberUnderValidTest() {
        then(isNameValid("first_user")).isTrue();
    }

    @Test
    void whenNumberInValidTest() {
        then(isNameValid("123")).isFalse();
    }
}

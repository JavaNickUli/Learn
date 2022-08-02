package uli.nick.stepik.basic.tasks23;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class IsPalindromeTest {

    @Test
    void isPalindromeTest0() {
        then(IsPalindrome.isPalindrome("Madam, I'm Adam!")).isTrue();
    }

    @Test
    void isPalindromeTest1() {
        then(IsPalindrome.isPalindrome("Madam, I'm Adam or not!")).isFalse();
    }

    @Test
    void isPalindromeTest2() {
        then(IsPalindrome.isPalindrome("123454321")).isTrue();
    }

    @Test
    void isPalindromeTest3() {
        then(IsPalindrome.isPalindrome("1234543212345")).isFalse();
    }
}

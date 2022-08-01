package uli.nick.stepik.basic.tasks22;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class CharExpressionTest {

    @Test
    void charExpressionTest0() {
        then(CharExpression.charExpression(32)).isEqualTo('|');
    }

    @Test
    void charExpressionTest1() {
        then(CharExpression.charExpression(29)).isEqualTo('y');
    }

    @Test
    void charExpressionTest2() {
        then(CharExpression.charExpression(0)).isEqualTo('\\');
    }

    @Test
    void charExpressionTest3() {
        then(CharExpression.charExpression(-5)).isEqualTo('W');
    }
}

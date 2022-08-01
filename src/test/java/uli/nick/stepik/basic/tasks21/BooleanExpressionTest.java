package uli.nick.stepik.basic.tasks21;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class BooleanExpressionTest {

    @Test
    void booleanExpressionTest0() {
        then(BooleanExpression.booleanExpression(false, false, false, false)).isFalse();
    }

    @Test
    void booleanExpressionTest1() {
        then(BooleanExpression.booleanExpression(true, true, true, true)).isFalse();
    }

    @Test
    void booleanExpressionTest2() {
        then(BooleanExpression.booleanExpression(false, false, true, true)).isTrue();
    }

    @Test
    void booleanExpressionTest3() {
        then(BooleanExpression.booleanExpression(false, true, true, false)).isTrue();
    }

    @Test
    void booleanExpressionTest4() {
        then(BooleanExpression.booleanExpression(false, true, false, true)).isTrue();
    }

    @Test
    void booleanExpressionTest5() {
        then(BooleanExpression.booleanExpression(false, true, false, false)).isFalse();
    }

    @Test
    void booleanExpressionTest6() {
        then(BooleanExpression.booleanExpression(true, true, true, false)).isFalse();
    }

    @Test
    void booleanExpressionTest7() {
        then(BooleanExpression.booleanExpression(true, true, false, true)).isFalse();
    }
}

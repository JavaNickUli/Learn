package uli.nick.stepik.basic.tasks21;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class DoubleExpressionTest {

    @Test
    void doubleExpressionTest0() {
        then(DoubleExpression.doubleExpression(0.1, 0.2, 0.3)).isTrue();
    }

    @Test
    void doubleExpressionTest1() {
        then(DoubleExpression.doubleExpression(0.1, 0.2, 0.30009)).isTrue();
    }

    @Test
    void doubleExpressionTest2() {
        then(DoubleExpression.doubleExpression(0.10009, 0.2, 0.3)).isTrue();
    }

    @Test
    void doubleExpressionTest3() {
        then(DoubleExpression.doubleExpression(0.10009, -0.1, 0.0)).isTrue();
    }

    @Test
    void doubleExpressionTest4() {
        then(DoubleExpression.doubleExpression(-0.10009, -0.2, -0.3)).isTrue();
    }

    @Test
    void doubleExpressionTest5() {
        then(DoubleExpression.doubleExpression(-0.1, -0.2, -0.30009)).isTrue();
    }

    @Test
    void doubleExpressionTest6() {
        then(DoubleExpression.doubleExpression(-0.10005, -0.2, -0.29995)).isFalse();
    }

    @Test
    void doubleExpressionTest7() {
        then(DoubleExpression.doubleExpression(0.10005, -0.2, -0.0995)).isFalse();
    }
}

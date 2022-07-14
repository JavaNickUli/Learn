package uli.nick.job4j.praxis.tasks114arithmetic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class ArithmeticActionsTest {

    @Test
    void selectActionAddedPosPos() {
        String actual = ArithmeticActions.selectAction(5, 10, 15);
        then(actual).isEqualTo("added");
    }

    @Test
    void selectActionAddedPosNeg() {
        String actual = ArithmeticActions.selectAction(5, -10, -5);
        then(actual).isEqualTo("added");
    }

    @Test
    void selectActionAddedNegPos() {
        String actual = ArithmeticActions.selectAction(-5, 10, 5);
        then(actual).isEqualTo("added");
    }

    @Test
    void selectActionAddedNegNeg() {
        String actual = ArithmeticActions.selectAction(-5, -10, -15);
        then(actual).isEqualTo("added");
    }

    @Test
    void selectActionSubtractedPosPosFirstLess() {
        String actual = ArithmeticActions.selectAction(5, 10, -5);
        then(actual).isEqualTo("subtracted");
    }

    @Test
    void selectActionSubtractedPosNegFirstLess() {
        String actual = ArithmeticActions.selectAction(5, -10, 15);
        then(actual).isEqualTo("subtracted");
    }

    @Test
    void selectActionSubtractedNegPosFirstLess() {
        String actual = ArithmeticActions.selectAction(-5, 10, -15);
        then(actual).isEqualTo("subtracted");
    }

    @Test
    void selectActionSubtractedNegNegFirstLess() {
        String actual = ArithmeticActions.selectAction(-5, -10, 5);
        then(actual).isEqualTo("subtracted");
    }

    @Test
    void selectActionSubtractedPosPosFirstGreater() {
        String actual = ArithmeticActions.selectAction(10, 5, 5);
        then(actual).isEqualTo("subtracted");
    }

    @Test
    void selectActionSubtractedPosNegFirstGreater() {
        String actual = ArithmeticActions.selectAction(10, -5, 15);
        then(actual).isEqualTo("subtracted");
    }

    @Test
    void selectActionSubtractedNegPosFirstGreater() {
        String actual = ArithmeticActions.selectAction(-10, 5, -15);
        then(actual).isEqualTo("subtracted");
    }

    @Test
    void selectActionSubtractedNegNegFirstGreater() {
        String actual = ArithmeticActions.selectAction(-10, -5, -5);
        then(actual).isEqualTo("subtracted");
    }

    @Test
    void selectActionMultipliedPosPos() {
        String actual = ArithmeticActions.selectAction(5, 10, 50);
        then(actual).isEqualTo("multiplied");
    }

    @Test
    void selectActionMultipliedPosNeg() {
        String actual = ArithmeticActions.selectAction(5, -10, -50);
        then(actual).isEqualTo("multiplied");
    }

    @Test
    void selectActionMultipliedNegPos() {
        String actual = ArithmeticActions.selectAction(-5, 10, -50);
        then(actual).isEqualTo("multiplied");
    }

    @Test
    void selectActionMultipliedNegNeg() {
        String actual = ArithmeticActions.selectAction(-5, -10, 50);
        then(actual).isEqualTo("multiplied");
    }

    @Test
    void selectActionDividedPosPos() {
        String actual = ArithmeticActions.selectAction(15, 5, 3);
        then(actual).isEqualTo("divided");
    }

    @Test
    void selectActionDividedPosNeg() {
        String actual = ArithmeticActions.selectAction(15, -5, -3);
        then(actual).isEqualTo("divided");
    }

    @Test
    void selectActionDividedNegPos() {
        String actual = ArithmeticActions.selectAction(-15, 5, -3);
        then(actual).isEqualTo("divided");
    }

    @Test
    void selectActionDividedNegNeg() {
        String actual = ArithmeticActions.selectAction(-15, -5, 3);
        then(actual).isEqualTo("divided");
    }

    @Test
    void selectActionNone() {
        String actual = ArithmeticActions.selectAction(1, 10, 100);
        then(actual).isEqualTo("none");
    }
}

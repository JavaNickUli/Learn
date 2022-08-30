package uli.nick.stepik.basic.tasks35;

import java.util.function.DoubleUnaryOperator;

public class Integrate {

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double l = 0;
        while (a < b) {
            l += f.applyAsDouble(a += 1e-6);
        }
        return l * 1e-6;
    }
}

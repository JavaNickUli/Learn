package uli.nick.stepik.basic.tasks35;

import java.util.function.DoubleUnaryOperator;

/**
 * <p>Реализуйте метод, выполняющий численное интегрирование заданной функции на заданном интервале по формуле
 * левых прямоугольников.
 * <p>Функция задана объектом, реализующим интерфейс java.util.function.DoubleUnaryOperator. Его метод
 * applyAsDouble() принимает значение аргумента и возвращает значение функции в заданной точке.
 * <p>Интервал интегрирования задается его конечными точками a и b, причем a<=b. Для получения достаточно
 * точного результата используйте шаг сетки не больше 10E-6.
 */

public class Integrate {

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double l = 0;
        while (a < b) {
            l += f.applyAsDouble(a += 1e-6);
        }
        return l * 1e-6;
    }
}

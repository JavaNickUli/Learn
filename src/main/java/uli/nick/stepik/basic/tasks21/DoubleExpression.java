package uli.nick.stepik.basic.tasks21;

/**
 * <p>Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
 * <p>Допустимая погрешность – 0.0001 (1E-4)
 * <p>Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
 * <p>В качестве примера написано заведомо неправильное выражение. Исправьте его.
 */

public class DoubleExpression {

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) < 1E-4;
    }
}

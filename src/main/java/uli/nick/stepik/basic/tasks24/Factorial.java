package uli.nick.stepik.basic.tasks24;

import java.math.BigInteger;

/**
 * <p>Реализуйте метод, вычисляющий факториал заданного натурального числа.
 * <p>Факториал NN вычисляется как 1⋅2⋅...⋅N.
 * <p>Поскольку это очень быстро растущая функция, то даже для небольших NN вместимости типов int и long очень
 * скоро не хватит. Поэтому будем использовать BigInteger.
 * <p>Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода
 * добавит проверяющая система.
 */

public class Factorial {

    public static BigInteger factorial(int value) {
        BigInteger bigInteger = BigInteger.ONE;
        while (value > 1) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(value--));
        }
        return bigInteger;
//        return value > 1 ? BigInteger.valueOf(value).multiply(factorial(--value)) : BigInteger.ONE;
    }
}

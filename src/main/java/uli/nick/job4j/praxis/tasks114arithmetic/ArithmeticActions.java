package uli.nick.job4j.praxis.tasks114arithmetic;

/**
 * <p>1.3. Арифметические операции.
 * <p>В большинстве случаев в повседневной жизни мы используем 4 арифметических действия: сложение,
 * вычитание, умножение и деление.
 * <p>Необходимо реализовать метод, который принимает 3 параметра:
 * <p>1. Первый аргумент арифметического действия;
 * <p>2. Второй аргумент арифметического действия;
 * <p>3. Результат применения арифметического действия к двум первым аргументам.
 * <p>Метод должен быть реализован таким образом, чтобы он вернул строковое представление действия,
 * которое выполнилось.
 * <p>Например, первый аргумент 100, второй 200, а результат вычисления - 300 - значит метод должен вернуть
 * строку "added". Для разности - "subtracted", умножения - "multiplied", деления - "divided". Если никакого
 * арифметического действия над исходными значениями выполнить нельзя - метод должен вернуть строку "none".
 */

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        if (left + right == rsl) {
            return "added";
        } else if (left - right == rsl) {
            return "subtracted";
        } else if (left * right == rsl) {
            return "multiplied";
        } else if (left / right == rsl) {
            return "divided";
        } else {
            return "none";
        }
    }
}

// Каркас 1.3.:
//public class ArithmeticActions {
//    public static String selectAction(int left, int right, int rsl) {
//        return "none";
//    }
//}
//.

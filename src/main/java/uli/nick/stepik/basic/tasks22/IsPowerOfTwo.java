package uli.nick.stepik.basic.tasks22;

/**
 * <p>Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
 * <p>Решать можно разными способами:
 * <p>воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
 * <p>применив пару трюков из двоичной арифметики;
 * <p>написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после
 * просмотра соответствующих уроков).
 * <p>Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода
 * добавит проверяющая система.
 */

public class IsPowerOfTwo {

    public static boolean isPowerOfTwo(int value) {
        return (value != 0) && ((value & -value) == (value < 0 ? -value : value));
//        return Integer.bitCount(Math.abs(value)) == 1;
    }
}

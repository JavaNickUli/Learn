package uli.nick.stepik.basic.tasks24;

/**
 * <p>Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в
 * том же порядке массив. Массивы могут быть любой длины, в том числе нулевой.
 * <p>Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность: он будет идти по двум
 * исходным массивам и сразу формировать отсортированный результирующий массив. Так, чтобы сортировка
 * полученного массива при помощи Arrays.sort() уже не требовалась. К сожалению, автоматически это не
 * проверить, так что это остается на вашей совести :)
 * <p>Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода
 * добавит проверяющая система.
 * <p>Пример
 * <p>Если на вход подаются массивы {0, 2, 2} и {1, 3}, то на выходе должен получиться массив {0, 1, 2, 2, 3}
 */

public class MergeArrays {

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] array = new int[a1.length + a2.length];

        for (int i = 0, j = 0; i + j < array.length;) {
            array[i + j] = j == a2.length || i < a1.length && a1[i] <= a2[j] ? a1[i++] : a2[j++];
        }

        return array;
    }
}

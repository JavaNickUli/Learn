package uli.nick.job4j.praxis.tasks112datatype;

/**
 * <p>6. Возведения числа в степень
 * <p>Часто может потребоваться возвести число в степень. Вспомним немного школьную математику. Что такое
 * возведение в степень? Это умножение числа на само себя какое-то число раз.
 * <p>Например, 2 в степени 2 это 2 * 2 = 4, или 3 в степени 3 это 3 * 3 * 3 = 27.
 * <p>В Java нет готовых операторов для возведения числа в степень, но есть библиотека Math. С помощью нее мы
 * можем возвести число в степень. Синтаксис следующий:
 * <p>double имя_переменной = Math.pow(число, степень);
 * <p>Например,
 * <pre>{@code double d = Math.pow(2, 2);}</pre>
 * <p>Ниже приведен код, раскомментируйте его и возведите число 3 в квадрат, т.е. в степень 2
 */

public class MathPow {
    public static void main(String[] args) {
        double result = Math.pow(3, 2);
        System.out.println(result);
    }
}

// Каркас 6.:
//public class MathPow {
//    public static void main(String[] args) {
//        //double result = ...
//        System.out.println(result);
//    }
//}
//.

package uli.nick.job4j.praxis.tasks112datatype;

/**
 * <p>7. Получение корня из числа
 * <p>Частой задачей является также получение корня квадратного из числа. Корень это то число которое
 * возводиться в степень 2. Например (далее ^ возведение в степень) :
 * <p>2 ^ 2 = 4. Корень здесь 2
 * <p>3 ^ 2 = 9. Корень здесь 3
 * <p>Чтобы получить корень, нам нужно использовать библиотеку Math, а именно метод Math.sqrt. sqrt это
 * сокращение от square root, что значит дословно с английского "квадратный корень". Синтаксис следующий:
 * <p>double переменная = Math.sqrt(число);
 * <p>Например,
 * <pre>{@code double result = Math.sqrt(4); // = 2}</pre>
 * <p>Ниже приведен код. Вам нужно его раскоментировать и получить корень числа из 9
 */

public class MathSqrt {
    public static void main(String[] args) {
        double result = Math.sqrt(9);
        System.out.println(result);
    }
}

// Каркас 7.:
//public class MathSqrt {
//    public static void main(String[] args) {
//        //double result = ...;
//        System.out.println(result);
//    }
//}
//.

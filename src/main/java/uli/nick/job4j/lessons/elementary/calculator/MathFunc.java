package uli.nick.job4j.lessons.elementary.calculator;

/**
 * <p>4.2. Результат работы метода [#232622 #305746]
 * <p>Задание
 *
 * <p>1. Допишите в методе main код, который вызовет метод func1 с аргументом x = 100,
 * <p>Результат вычисления запишите в переменную result3.
 * <p>2. Добавьте result3 к total.
 */

public class MathFunc {

    public static void main(String[] args) {
        int result1 = function1(3);
        int result2 = function2(5);
        int result3 = function1(100);
        int total = result1 + result2 + result3;
        System.out.println(total);
    }

    public static int function1(int x) {
        return x * x + 1;
    }

    public static int function2(int x) {
        return 1 / x;
    }
}

// Каркас 4.2.:
//public class MathFunc {
//
//    public static int func1(int x) {
//        int y = x * x + 1;
//        return y;
//    }
//
//    public static int func2(int x) {
//        int y = 1 / x;
//        return y;
//    }
//
//    public static void main(String[] args) {
//        int result1 = MathFunc.func1(3);
//        int result2 = MathFunc.func2(5);
//        int total = result1 + result2;
//        System.out.println(total);
//    }
//}
//.

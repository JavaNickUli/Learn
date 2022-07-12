package uli.nick.job4j.lessons.elementary.calculator;

/**
 * <p>3. Арифметические операции. [#185 #305717]
 * <p>Задание.
 * <p>1. В методе main создайте дополнительные переменные, кроме тех, что уже созданы.
 * <p>- переменную типа int c именем four и значением 4.
 * <p>- переменную типа int с именем five и значением 5.
 * <p>- переменную типа int c именем six и значением 6.
 * <p>2. Создайте еще три переменные для хранения результата арифметических операций.
 * <p>- переменную типа int c именем fourTimeTwo и присвойте ей значение арифметической операции умножения
 * переменной four на two.
 * <p>- переменную типа int c именем fiveMinusTwo и присвойте ей значение арифметической операции вычитания
 * переменной five c two.
 * <p>- переменную типа int c именем sixDivTwo и присвойте ей значение арифметической операции деления
 * переменной six на two.
 * <p>3. Выведите на консоль переменные fourTimeTwo, fiveMinusTwo, sixDivTwo.
 */

public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int four = 4;
        int five = 5;
        int six = 6;
        int onePlusTwo = one + two;
        int fourTimesTwo = four * two;
        int fiveMinusTwo = five - two;
        int sixDivTwo = six / two;
        System.out.println(onePlusTwo);
        System.out.println(fourTimesTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(sixDivTwo);
    }
}

// Каркас 3.:
//public class Calculator {
//    public static void main(String[] args) {
//        int one = 1;
//        int two = 2;
//        int onePlusTwo = one + two;
//        System.out.println(onePlusTwo);
//    }
//}
//.

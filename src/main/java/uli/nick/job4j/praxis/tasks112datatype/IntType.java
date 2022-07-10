package uli.nick.job4j.praxis.tasks112datatype;

import java.util.Scanner;

/**
 * <p>1. Объявление переменной
 * <p>В Java есть 8 примитивных типов. int описывает число от числа от - 2 в степени 31 до 2 в степени 31 минус 1.
 * <p>Чтобы объявить переменную нужно указать ее тип, а потом имя переменной.
 * <pre>{@code int age = 1;}</pre>
 * <p>Ниже приведен код. Программа получает от пользователя число в диапазоне int и выводит его на консоль.
 * Поправьте программу, чтобы она компилировалась.
 */

public class IntType {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        System.out.println(value);
    }
}

// Каркас 1.:
//import java.util.Scanner;
//
//public class IntType {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        value = in.nextInt();
//        System.out.println(value);
//    }
//}
//.

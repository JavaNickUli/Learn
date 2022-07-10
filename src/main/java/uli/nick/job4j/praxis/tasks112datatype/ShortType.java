package uli.nick.job4j.praxis.tasks112datatype;

import java.util.Scanner;

/**
 * <p>2. Создание short переменной
 * <p>В Java есть 8 примитивных типов. short описывает число от числа от -32,768 до 32,767
 * <p>Ниже приведен код. Программа получает от пользователя число в диапазоне short и выводит его на консоль.
 * <p>Поправьте программу, чтобы она компилировалась.
 */

public class ShortType {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short value = in.nextShort();
        System.out.println(value);
    }
}

// Каркас 2.:
//import java.util.Scanner;
//
//public class ShortType {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        value = in.nextShort();
//        System.out.println(value);
//    }
//}
//.

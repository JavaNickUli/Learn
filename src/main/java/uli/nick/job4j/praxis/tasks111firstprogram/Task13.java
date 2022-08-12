package uli.nick.job4j.praxis.tasks111firstprogram;

import java.util.Scanner;

/**
 * <p>13. Работа с действительными числами
 * <p>Даны два действительных числа a и b, вывести их сумму, разность, произведение, частное - результат каждого
 * вычисления вывести в новую строку.
 */

public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}

// Каркас 13.:
//public class Task13 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        double a = input.nextDouble();
//        double b = input.nextDouble();
//        // сумма
//        // разность
//        // произведение
//        // частное
//    }
//}
//.

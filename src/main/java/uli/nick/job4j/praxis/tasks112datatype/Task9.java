package uli.nick.job4j.praxis.tasks112datatype;

import java.util.Scanner;

/**
 * <p>9. Сумма, разность, произведение, частное
 * <p>Даны два целых числа a и b. Вычислить их сумму, разность, произведение и частное.
 * <p>Результат вычислений выведите на консоль в порядке следование.
 * <p>- сумма
 * <p>- разность
 * <p>- произведение
 * <p>- часное
 */

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}

// Каркас 9.:
//import java.util.Scanner;
//
//public class Task9 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        // YOUR CODE
//    }
//}
//.

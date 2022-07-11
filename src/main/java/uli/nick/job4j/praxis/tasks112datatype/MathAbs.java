package uli.nick.job4j.praxis.tasks112datatype;

/**
 * <p>8. Модуль числа
 * <p>Что если нам нужно получить число без его знака? Например, получить 3, если имеется -3. Для этого мы можем
 * использовать функцию модуля. Модуль числа это его часть без знака. Модуль положительного числа равен ему самому.
 * <p>В Java модуль можно получить с использованием функции Math.abs. Синтаксис такой
 * <p>double переменная = Math.abs(число);
 * <p>Например,
 * <pre>{@code double result = Math.abs(-3); // = 3}</pre>
 * <p>Ниже приведен код. Вам нужно его раскоментировать и получить модуль -5
 */

public class MathAbs {
    public static void main(String[] args) {
        double result = Math.abs(-5);
        System.out.println(result);
    }
}

// Каркас 8.:
//public class MathAbs {
//    public static void main(String[] args) {
//        //double result = ...
//        System.out.println(result);
//    }
//}
//.

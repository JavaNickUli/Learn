package uli.nick.job4j.praxis.tasks111firstprogram;

/**
 * <p>3.3. Вывод без перехода на новую строку
 * <p>Иногда может потребоваться, чтоб выводилось без перехода на новую строку. Обратите внимание метод
 * System.out.println, имеет в конце ln, что с английского значит line, что подразумевает вывод с переходом на
 * новую строку. Существует другой метод System.out.print, т.е. без ln. Он не переводит на новую строку. Пример,
 * <pre>{@code System.out.print("Hello World!");}</pre>
 * <p>Различия можно увидеть, если заглянуть в консоль. Первый print, второй println
 * <pre>{@code 1 Hello World!}</pre>
 * <pre>{@code 1 Hello World!
 * 2}</pre>
 * Выведите "Сегодня я молодец!" через System.out.print
 */

public class Print {
    public static void main(String[] args) {
        System.out.print("Сегодня я молодец!");
    }
}

// Каркас 3.3.:
//public class Print {
//    public static void main(String[] args) {
//
//    }
//}
//.

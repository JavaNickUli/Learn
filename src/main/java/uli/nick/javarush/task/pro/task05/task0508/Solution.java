package uli.nick.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/**
 * <p>В этой задаче тебе нужно:
 * <p>Считать 6 строк и заполнить ими массив strings.
 * <p>Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
 * <p>Примеры.
 * <p>Массив после чтения строк:
 * <pre>{@code {"Hello", "Hello", "World", "Java", "Tasks", "World"}}</pre>
 * <p>Массив после удаления повторяющихся строк:
 * <pre>{@code {null, null, null, "Java", "Tasks", null}}</pre>
 * <p>Требования:
 * <p>В методе main(String[]) считай с клавиатуры 6 строк и заполнить ими массив strings.
 * <p>В методе main(String[]) удали(заменить строку на null) элементы из массива strings с одинаковыми строками.
 */

public class Solution {

    public static String[] strings;

    public static void main(String[] args) {

        strings = new String[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        scanner.close();

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {

                boolean duplicate = false;
                for (int j = i + 1; j < strings.length; j++) {
                    if (strings[j] != null && strings[j].equals(strings[i])) {
                        strings[j] = null;
                       duplicate = true;
                    }
                }
                if (duplicate) {
                    strings[i] = null;
                }
            }
        }

        for (String string : strings) {
            System.out.print(string + ", ");
        }
    }
}

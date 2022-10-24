package uli.nick.javarush.task.pro.task05.task0525;

/**
 * <p>С помощью продвинутой работы с массивами нужно запрограммировать Кибердракона так, чтобы он поймал
 * зараженный галабагами роботанк.
 * <p>Измени инициализацию и заполнение массива array на быструю. Массив должен быть заполнен так, чтобы
 * в консоль выводилась фраза "Mission complete".
 * <p>Остальной код программы не изменяй.
 * <p>Требования:
 * <p>В классе Solution должна быть публичная статическая переменная array типа String[].
 * <p>Проинициализируй переменную array и заполни массив с помощью "быстрого заполнения" согласно условию.
 * <p>Не изменяй остальной код программ
 */

public class Solution {
    public static String[] array;

    public static void main(String[] args) {
        String[]array = {"Amigo", "Diego", "Amigo", "Diego", "Amigo", "Diego", "robotank"};
        //array[0] = "Amigo";
        //array[1] = "Diego";
        //array[2] = "Amigo";
        //array[3] = "Diego";
        //array[4] = "Amigo";
        //array[5] = "Diego";

        boolean isMissionComplete = false;
        for (int i = 0; i < array.length; i++) {
            if ("robotank".equalsIgnoreCase(array[i])) {
                isMissionComplete = true;
                break;
            }
        }
        System.out.println(isMissionComplete ? "Mission complete" : "Mission not completed");
    }
}

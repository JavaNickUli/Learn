package uli.nick.job4j.lessons.tracker.collection;

import java.util.List;

/**
 * <p>3. Конвертация ArrayList в двухмерный массив [#10035 #311635]
 * <p>В этом задании нужно будет реализовать метод, который преобразует одномерный список в двухмерный массив.
 * <p>Рассмотрим задание на примере списка.
 * <pre>{@code List.of(1, 2, 3, 4, 5, 6, 7)}</pre>
 * <p>Нам нужно его разбить на группы, чтобы в каждой было по 3 элемента. Число элементов в группе задается во входящем параметре.
 * <p>То есть у нас получится три группы:
 * <p>1 2 3
 * <p>4 5 6
 * <p>7 0 0
 * <p>В последнюю группу вместо недостающих элементов мы добавили нули.
 * <p>В этой задаче мы сталкиваемся с первой проблемой - это определение количества групп.
 * <p>Если мы воспользуемся обычным делением, то получим округление в меньшую строну.
 * <p>Задание.
 * <p>1. Реализуйте метод конвертации списка чисел в двухмерный массив чисел.
 */

public class ConvertList2Array {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] rsl = toArray(list, 3);

        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;

        for (Integer num : list) {
            array[row][cell++] = num;
            if (cell == cells) {
                cell = 0;
                row++;
            }
        }

        return array;
    }
}

// Каркас 3.:
//import java.util.List;
//
//public class ConvertList2Array {
//
//    public static int[][] toArray(List<Integer> list, int cells) {
//        int groups = (int) Math.ceil((double) list.size() / cells);
//        int[][] array = new int[groups][cells];
//        return array;
//    }
//
//    public static void main(String[] args) {
//        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
//        int[][] rsl = toArray(list, 3);
//        for (int[] row : rsl) {
//            for (int cell : row) {
//                System.out.print(cell + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//.

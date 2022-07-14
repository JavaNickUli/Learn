package uli.nick.job4j.lessons.tracker.list;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>4. Конвертация двумерного массива в ArrayList [#48580 #311641]
 * <p>В этом задании необходимо реализовать обратную конвертацию двухмерного массива в одномерный список.
 * <p>Задание
 * <p>1. Реализуйте метод toList.
 */

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();

        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }

        return list;
    }
}

// Каркас 4.:
//import java.util.ArrayList;
//import java.util.List;
//
//public class ConvertMatrix2List {
//    public List<Integer> toList(int[][] array) {
//        List<Integer> list = new ArrayList<>();
//        for (int[] row : array) {
//            for (int cell : row) {
//
//            }
//        }
//        return list;
//    }
//}
//.

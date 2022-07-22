package uli.nick.job4j.praxis.tasks131lislarraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>1.6. Геометрическая прогрессия
 * <p>Геометри́ческая прогрессия — последовательность чисел  (называемых членами прогрессии), в которой каждое
 * последующее число, начиная со второго, получается из предыдущего умножением его на определённое число
 * q (называемое знаменателем прогрессии). Т.е. любой член геометрической прогрессии можно высчитать по формуле:
 * <p>b(n) = b(1) * q ^ (n - 1) - где значения в скобках означат номер члена геометрической прогрессии.
 * <p>Например, для b(1) = 1, q = 2 и n = 4 => b(n) будет равно 8.
 * <p>Необходимо реализовать метод, который генерирует геометрическую прогрессию и при этом принимает 3 значения:
 * <p>1. Первый элемент геометрической прогрессии;
 * <p>2. Знаменатель прогрессии;
 * <p>3. Количество элементов, которое должно содержаться в сгенерированной последовательности.
 * <p>При этом метод должен вернуть сумму элементов сгенерированной последовательности.
 */

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        List<Integer> list = new ArrayList<>(count);
        list.add(first);
        for (int i = first; i < count; i++) {
            list.add((int) Math.pow(denominator, i));
        }
        int result = 0;
        for (int num : list) {
            result += num;
        }
        return result;
    }
}

// Каркас 1.6.:
//import java.util.ArrayList;
//import java.util.List;
//
//public class GeomProgression {
//    public static int generateAndSum(int first, int denominator, int count) {
//        return 0;
//    }
//}
//.

package uli.nick.job4j.praxis.tasks112datatype;

/**
 * <p>3. Приведение типов. Целые числа
 * <p>В Java существуют различные примитивные типы для целых чисел (byte, short, int, long). Местами в программе, у
 * нас могут быть переменные одного типа, а работать нужно с другим типом. Правило простое, если:
 * <p>1. Если переменная куда мы хотим поместить значение из другой переменной по типу весит больше, т.е. может
 * включать больше чисел, то мы можем просто поместить значение
 * <p>2. В противном случае нам нужно делать явное приведение типов. Но при этом мы можем потерять часть
 * данных. Применять нужно с осторожностью
 * <p>тип1 переменная1 = (тип1) переменная2;
 * <p>Пример:
 * <pre>{@code // Ситуация 1
 * int a = 1;
 * long b = a;
 * // Ситуация 2
 * short c = 2;
 * byte d = (byte) c;}</pre>
 * <p>Ниже приведен код. Вам нужно раскоментировать строки и сделать приведение типов
 */

public class IntegerTypeConversion {
    public static void main(String[] args) {
        int num = 1;
        long numUpper = num;
        short numLower = (short) numUpper;
        System.out.println(numUpper);
        System.out.println(numLower);
    }
}

// Каркас 3.:
//public class IntegerTypeConversion {
//    public static void main(String[] args) {
//        int num = 1;
//        //long numUpper = ...;
//        //short numLower = ...;
//        //System.out.println(numUpper);
//        //System.out.println(numLower);
//    }
//}
//.

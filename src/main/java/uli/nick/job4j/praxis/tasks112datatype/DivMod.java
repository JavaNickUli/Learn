package uli.nick.job4j.praxis.tasks112datatype;

/**
 * <p>4. Целочисленное деление
 * <p>Помните школьную математику, а именно деление столбиком? Языки программирования поддерживают
 * операции, используя которые мы можем получить целую часть от деления и остаток от деления.
 * <p>В Java для этого случае два оператора:
 * <p>1. / - который находит целую часть от деления
 * <p>2. % - который находит остаток от деления
 * <p>Пример
 * <pre>{@code 5 / 2 = 2
 * 5 % 2 = 1}</pre>
 * <p>Ниже приведен код. Вам нужно раскоментировать строки и поделить число 11 нацело на 3 и получить остаток
 * от деления от 3
 */

public class DivMod {
    public static void main(String[] args) {
        int num = 11;
        int div = num / 3;
        int mod = num % 3;
        System.out.println(div);
        System.out.println(mod);
    }
}

// Каркас 4.:
//public class DivMod {
//    public static void main(String[] args) {
//        int num = 11;
//        //int div = ...;
//        //int mod = ...;
//        System.out.println(div);
//        System.out.println(mod);
//    }
//}
//.

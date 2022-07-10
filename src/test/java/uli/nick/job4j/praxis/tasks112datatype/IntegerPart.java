package uli.nick.job4j.praxis.tasks112datatype;

/**
 * <p>5. Целая часть вещественного числа
 * <p>Иногда бывает необходимо получить целую часть вещественного числа. Заметьте не округлить в сторону
 * целого, а получить целую часть, т.е. если есть число 2.9, нам нужно получить 2.
 * <p>Для этого мы можем сделать приведение типов. Из вещественного числа в целое. Например:
 * <pre>{@code double floatNum = 1.5;
 * long integerNum = (long) floatNum;}</pre>
 * <p>integerNum в итоге будет 1.
 * <p>Ниже приведен код, расскоментируйте его и приведете вещественное число к целому
 */

public class IntegerPart {
    public static void main(String[] args) {
        float floatNum = 2.6f;
        int integerNum = (int) floatNum;
        System.out.println(integerNum);
    }
}

// Каркас 1.:
//public class IntegerPart {
//    public static void main(String[] args) {
//        float floatNum = 2.6f;
//        //int integerNum = ...
//        System.out.println(integerNum);
//    }
//}
//.

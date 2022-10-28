package uli.nick.sandbox;

/**
 * <p>1. Забытая точка с запятой
 * <p>Каждый оператор в Java должен заканчиваться точкой с запятой. Исправьте ошибку в приведенном коде.
 *
 * <pre>{@code System.out.println("Hello, Job4j!");}</pre>
 * <p>
 * ​
 *  
 */

public class SandJob4j {
    public static void main(String[] args) {
        System.out.println(5.0 / 4.9);
        System.out.println(5.1 % 4.9);
        System.out.println(0.9 % 9);
        System.out.println((5.0 / 4.9 + 5.0 % 4.9) * 4.9);
        array(1, 2, 3);
        System.out.println("A" + ('\t' + '\u0003'));
    }

    static void array(int... nums) {
        for (int num : nums) {
            System.out.println(num);
        }
    }
}

// Каркас 1.:
//public class HelloWorld {
//    public static void main(String[] args) {
//        System.out.println("Hello, Job4j!")
//    }
//}
//.

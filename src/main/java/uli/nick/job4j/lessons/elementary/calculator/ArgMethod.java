package uli.nick.job4j.lessons.elementary.calculator;

/**
 * <p>4.1. Аргументы [#295521 #305742]
 * <p>Задание
 * <p>1. Ниже приведен код. Он не компилируется.
 * <p>Программа должна 4 раза вывести на консоль "Hello, Job4j, age = 6".
 * <p>Ваша задача поправить код, чтобы он компилировался.
 * <p>Метод hello принимает два аргумента: первый аргумент имеет тип String, второй аргумент имеет тип int.
 * <p>В методе main мы вызывает 4 раза метод hello. Вам нужно написать правильные аргументы.
 */

public class ArgMethod {
    public static void main(String[] args) {
        String name = "Job4j";
        int age = 6;

        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
    }

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }
}

// Каркас 4.1.:
//public class ArgMethod {
//    public static void hello(String name, int age) {
//        System.out.println("Hello, " + name + ", age = " + age);
//    }
//
//    public static void main(String[] args) {
//        String name = "Job4j";
//        int age = 6;
//        ArgMethod.hello(name);
//        ArgMethod.hello(name, age);
//        ArgMethod.hello(age);
//        ArgMethod.hello(age, name);
//    }
//}
//.

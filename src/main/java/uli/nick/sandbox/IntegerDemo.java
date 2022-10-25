package uli.nick.sandbox;

public class IntegerDemo {

    public static void main(String[] args) {
        System.out.println(compare(500, 500));
        System.out.println(compare(100, 100));
    }

    static boolean compare(Integer first, Integer second) {
        return first == second;
    }
}

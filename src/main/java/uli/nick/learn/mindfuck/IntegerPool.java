package uli.nick.learn.mindfuck;

public class IntegerPool {

    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);
        System.out.println(a < b);
        System.out.println(a > b);

        a = 127127;
        b = 127127;
        System.out.println(a == b);
        System.out.println(a < b);
        System.out.println(a > b);
    }
}

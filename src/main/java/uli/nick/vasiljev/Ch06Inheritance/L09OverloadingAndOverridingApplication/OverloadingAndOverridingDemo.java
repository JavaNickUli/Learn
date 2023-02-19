package uli.nick.vasiljev.Ch06Inheritance.L09OverloadingAndOverridingApplication;

class Alpha {

    void show() {
        System.out.println("Класс Alpha");
    }

    void show(String txt) {
        System.out.println(txt);
    }
}

class Bravo extends Alpha {

    void show() {
        System.out.println("Класс Bravo");
    }

    void show(int num) {
        System.out.println("Число " + num);
    }
}

public class OverloadingAndOverridingDemo {

    public static void main(String[] args) {
        Alpha objA = new Alpha();
        objA.show();
        objA.show("Объект objA");
        Bravo objB = new Bravo();
        objB.show();
        objB.show("Объект objB");
        objB.show(123);
    }
}

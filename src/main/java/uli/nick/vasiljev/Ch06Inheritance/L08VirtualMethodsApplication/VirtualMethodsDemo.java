package uli.nick.vasiljev.Ch06Inheritance.L08VirtualMethodsApplication;

class Alpha {

    String name;

    void objectCreated() {
        System.out.println("Создан объект класса Alpha");
    }

    void hello() {
        System.out.println("Объект класса Alpha");
    }

    void show() {
        hello();
        System.out.println("Поле name: " + name);
    }

    Alpha(String txt) {
        objectCreated();
        name = txt;
    }
}

class Bravo extends Alpha {

    void objectCreated() {
        System.out.println("Создан объект класса Bravo");
    }

    void hello() {
        System.out.println("Объект класса Bravo");
    }

    Bravo(String txt) {
        super(txt);
    }
}

public class VirtualMethodsDemo {

    public static void main(String[] args) {
        Alpha objA = new Alpha("alpha");
        objA.show();
        Bravo objB = new Bravo("bravo");
        objB.show();
    }
}

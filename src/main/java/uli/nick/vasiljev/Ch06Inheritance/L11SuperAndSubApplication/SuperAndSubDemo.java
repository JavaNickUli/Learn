package uli.nick.vasiljev.Ch06Inheritance.L11SuperAndSubApplication;

class Alpha {

    String name;

    void show() {
        String txt = "Объект класса Alpha\n";
        txt += "Поле name: " + name + "\n";
        for (int k = 1; k <= 20; k++) {
            txt += "-";
        }
        System.out.println(txt);
    }
}

class Bravo extends Alpha {

    int code;

    void show() {
        String txt = "Объект класса Bravo\n";
        txt += "Поле name: " + name + "\n";
        txt += "Поле code: " + code + "\n";
        for (int k = 1; k <= 20; k++) {
            txt += "-";
        }
        System.out.println(txt);
    }
}

public class SuperAndSubDemo {

    public static void main(String[] args) {
        Alpha objA = new Alpha();
        objA.name = "alpha";
        objA.show();
        Bravo objB = new Bravo();
        objB.name = "bravo";
        objB.code = 123;
        objB.show();
        objA = objB;
        objA.name = "charlie";
        objA.show();
        objB.show();
    }
}

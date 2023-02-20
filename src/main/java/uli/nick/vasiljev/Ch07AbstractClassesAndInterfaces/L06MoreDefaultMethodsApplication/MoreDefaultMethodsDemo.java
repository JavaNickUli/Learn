package uli.nick.vasiljev.Ch07AbstractClassesAndInterfaces.L06MoreDefaultMethodsApplication;

interface First {

    default void hello() {
        System.out.println("Метод из интерфейса First");
    }
}

interface Second {

    default void hello() {
        System.out.println("Метод из интерфейса Second");
    }
}

class MyClass implements First, Second {

    public void hello() {
        First.super.hello();
        Second.super.hello();
    }
}

public class MoreDefaultMethodsDemo {

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.hello();
    }
}

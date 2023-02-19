package uli.nick.vasiljev.Ch07AbstractClassesAndInterfaces.L02UsingInterfaceApplication;

interface MyInterface {

    int NUMBER = 100;

    int getNumber(double x);

    char getSymbol(int n);
}

class MyClass implements MyInterface {

    public int getNumber(double x) {
        return (int) x;
    }

    public char getSymbol(int n) {
        return (char) ('A' + n);
    }
}

public class UsingInterfaceDemo {

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("Статическая константа: " + MyClass.NUMBER);
        System.out.println("Целое число: " + obj.getNumber(12.5));
        System.out.println("Символ: " + obj.getSymbol(3));
    }
}

package uli.nick.vasiljev.Ch08UsingClassesAndObjects.L01MethodArgumentsApplication;

public class MethodArgumentsDemo {

    static void swap(int a, int b) {
        System.out.println("Выполняется метод swap()");
        System.out.println("Аргументы до изменения значений: " + a + " и " + b);
        int x = b;
        b = a;
        a = x;
        System.out.println("Аргументы после изменения значений: " + a + " и " + b);
        System.out.println("Завершено выполнение метода swap()");
    }

    public static void main(String[] args) {
        int m = 1000, n = 200;
        System.out.println("Переменные до вызова метода swap(): " + m + " и " + n);
        swap(m, n);
        System.out.println("Переменные после вызова метода swap(): " + m + " и " + n);
    }
}

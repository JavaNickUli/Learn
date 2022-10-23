package uli.nick.javarush.task.pro.task10.task1010;

import java.util.Objects;

public class Iphone {

    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {

        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Iphone iphone = (Iphone) o;
        if (this.price != iphone.price) return false;
        return Objects.equals(this.model, iphone.model) && Objects.equals(this.color, iphone.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, price);
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }
}
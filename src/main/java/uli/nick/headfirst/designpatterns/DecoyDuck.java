package uli.nick.headfirst.designpatterns;

public class DecoyDuck extends Duck {

    @Override
    void display() {
        System.out.println("Приманка.");
    }
}

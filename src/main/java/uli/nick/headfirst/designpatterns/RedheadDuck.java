package uli.nick.headfirst.designpatterns;

public class RedheadDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        System.out.println("Рыжая утка.");
    }

    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }
}

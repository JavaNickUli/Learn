package uli.nick.headfirst.designpatterns;

public class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        System.out.println("Кряква.");
    }

    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }
}

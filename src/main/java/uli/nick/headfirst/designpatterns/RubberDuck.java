package uli.nick.headfirst.designpatterns;

public class RubberDuck extends Duck implements Quackable{

    @Override
    public void quack() {
        System.out.println("Писк.");
    }

    @Override
    void display() {
        System.out.println("Резиновая утка.");
    }
}

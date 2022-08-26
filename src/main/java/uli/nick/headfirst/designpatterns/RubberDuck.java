package uli.nick.headfirst.designpatterns;

public class RubberDuck extends Duck{

    @Override
    public void quack() {
        System.out.println("Tcc.");
    }

    @Override
    void display() {
        System.out.println("Резиновая утка.");
    }
}

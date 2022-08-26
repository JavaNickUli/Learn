package uli.nick.headfirst.designpatterns;

public class DuckConstruct {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redhead = new RedheadDuck();
        mallard.display();
        mallard.quack();
        mallard.swim();
        redhead.display();
        redhead.quack();
        redhead.swim();
    }
}

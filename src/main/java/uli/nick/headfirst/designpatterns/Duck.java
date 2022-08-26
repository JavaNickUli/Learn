package uli.nick.headfirst.designpatterns;

public abstract class Duck {

    public void quack() {
        System.out.println("Кря!");
    }

    public void swim() {
        System.out.println("Утка плавает.");
    }

    public void fly() {
        System.out.println("Утка летает.");
    }

    abstract void display();
}

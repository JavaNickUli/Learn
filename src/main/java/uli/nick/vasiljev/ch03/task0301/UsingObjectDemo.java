package uli.nick.vasiljev.ch03.task0301;

import javax.swing.*;

class MyClass {

    int number;
    char symbol;
}

public class UsingObjectDemo {

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.number = 100;
        obj.symbol = 'A';
        String text = "Число: " + obj.number + "\n";
        text += "Символ: " + obj.symbol;
        JOptionPane.showMessageDialog(null, text);
    }
}

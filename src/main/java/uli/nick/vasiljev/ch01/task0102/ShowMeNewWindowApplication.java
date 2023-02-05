package uli.nick.vasiljev.ch01.task0102;

import javax.swing.*;

public class ShowMeNewWindowApplication {

    public static void main(String[] args) {
        String title = "Сообщение";
        String text = "Продолжаем изучать Java";
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.WARNING_MESSAGE);
    }
}

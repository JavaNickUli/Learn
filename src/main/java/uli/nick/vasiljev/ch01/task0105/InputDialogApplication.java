package uli.nick.vasiljev.ch01.task0105;

import javax.swing.*;

public class InputDialogApplication {

    public static void main(String[] args) {
        String text;
        text = JOptionPane.showInputDialog("Введите текст:");
        JOptionPane.showMessageDialog(null, "Вы ввели такой текст:\n" + text);
    }
}

package uli.nick.vasiljev.Ch01Begin.L4InputDialogApplication;

import javax.swing.*;

public class InputDialogDemo {

    public static void main(String[] args) {
        String text;
        text = JOptionPane.showInputDialog("Введите текст:");
        JOptionPane.showMessageDialog(null, "Вы ввели такой текст:\n" + text);
    }
}

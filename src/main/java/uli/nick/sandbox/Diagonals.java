package uli.nick.sandbox;

public class Diagonals {
    public static void main(String[] args) {
        draw(7);
    }

    public static void draw(int size) {
        for (int cell = 0, row = 0; row < size; cell++) {
            System.out.print(row == cell || row == size - 1 - cell ? "0" : " ");
            if (cell == size - 1) {
                cell = -1;
                row++;
                System.out.println();
            }
        }
    }
}

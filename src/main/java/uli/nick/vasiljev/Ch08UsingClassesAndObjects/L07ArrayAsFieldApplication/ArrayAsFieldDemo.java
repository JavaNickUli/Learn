package uli.nick.vasiljev.Ch08UsingClassesAndObjects.L07ArrayAsFieldApplication;

class Binomial {

    private int[] binoms;

    Binomial(int n) {
        binoms = new int[n + 1];
        binoms[0] = 1;
        for (int k = 1; k <= n; k++) {
            binoms[k] = binoms[k - 1] * (n - k + 1) / k;
        }
    }

    public String toString() {
        String txt = "| ";
        for (int k = 0; k < binoms.length; k++) {
            txt += binoms[k] + " | ";
        }
        return txt;
    }
}

public class ArrayAsFieldDemo {

    public static void main(String[] args) {
        Binomial A = new Binomial(5);
        Binomial B = new Binomial(10);
        System.out.println(A);
        System.out.println(B);
    }
}

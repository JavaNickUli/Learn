package uli.nick.roman;

public enum RomanEnum {

    M(1000), D(500), C(100), L(50), X(10), V(5), I(1);

    private final int numeric;

    RomanEnum(int numeric) {
        this.numeric = numeric;
    }

    public int num() {
        return this.numeric;
    }
}


package uli.nick.roman;

public enum SignsEnum {

    ADD('+'), SUB('-'), MUL('*'), DIV('/');

    private final char sign;

    SignsEnum(char sign) {
        this.sign = sign;
    }

    public char sign() {
        return this.sign;
    }
}

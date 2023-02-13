package uli.nick.learn.mindfuck;

import java.util.HashSet;
import java.util.Set;

public class CharLetter {

    public static void main(String[] args) {
        Letter a = new Letter('a');
        Set<Letter> letters = new HashSet<>();
        letters.add(a);
        System.out.println(letters.contains(a) + " " + letters.size());
        a.ch = 'c';
        System.out.println(letters.contains(a) + " " + letters.size());
    }
}

class Letter {

    char ch;

    public Letter(char ch) {
        this.ch = ch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letter letter = (Letter) o;
        return ch == letter.ch;
    }

    @Override
    public int hashCode() {
        return ch;
    }
}

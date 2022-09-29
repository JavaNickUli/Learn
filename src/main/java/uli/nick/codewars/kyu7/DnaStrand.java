package uli.nick.codewars.kyu7;

/**
 * Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the
 * development and functioning of living organisms.
 * If you want to know more: http://en.wikipedia.org/wiki/DNA
 * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your function receives one
 * side of the DNA (string, except for Haskell); you need to return the other complementary side. DNA strand is
 * never empty or there is no DNA at all (again, except for Haskell).
 * More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)
 * Example: (input --> output)
 * <pre>{@code
 * "ATTGC" --> "TAACG"
 * "GTAT" --> "CATA"
 * }</pre>
 */

public class DnaStrand {

    public static String makeComplement(String dna) {
        String enumDna = "ACGT";
        char[] charsDna = dna.toCharArray();
        for (int i = 0; i < charsDna.length; i++) {
            charsDna[i] = enumDna.charAt(3 - enumDna.indexOf(charsDna[i]));
        }
        return String.valueOf(charsDna);
    }

    public static String makeComplement1(String dna) {
        return dna
                .replace("T","a")
                .replace("A","T")
                .replace("G","c")
                .replace("C","g")
                .toUpperCase();
    }
}

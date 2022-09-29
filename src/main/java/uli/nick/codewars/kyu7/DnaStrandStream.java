package uli.nick.codewars.kyu7;

import java.util.HashMap;
import java.util.stream.Collectors;

public class DnaStrandStream {

    public static String makeComplement(String dna) {
        return dna.chars().map(c -> switch (c) {
            case 'A' -> 'T';
            case 'T' -> 'A';
            case 'C' -> 'G';
            case 'G' -> 'C';
            default -> 'X';
        }).collect(StringBuilder::new, (sb, c) -> sb.append((char)c), StringBuilder::append).toString();
    }

    private static final HashMap<Character, Character> map = new HashMap<>(4);
    static {map.put('A', 'T'); map.put('T', 'A'); map.put('C', 'G'); map.put('G', 'C');}

    public static String makeComplement1(String dna) {
        return dna.chars().mapToObj(c -> String.valueOf(map.get((char)c))).collect(Collectors.joining());
    }
}

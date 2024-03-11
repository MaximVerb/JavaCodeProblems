package Strings_Numbers_Math.finding_first_non_repeated_character;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatedCharacter("hhhhhevvvvv"));
    }

    public static String firstNonRepeatedCharacter(String str) {
        Map<Character, Integer> chars = new LinkedHashMap<>();//a LinkedHashMap saves the order in which the keys were inserted

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            chars.compute(ch, (k, v) -> v == null ? 1 : ++v);
        }

        for(Map.Entry<Character,Integer> rec : chars.entrySet()) {
            if(rec.getValue() == 1) {
                return String.valueOf(Character.toChars(rec.getKey()));
            }
        }

        return String.valueOf(Character.toChars(Character.MIN_VALUE));
    }
}

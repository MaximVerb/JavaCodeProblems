package Strings_Numbers_Math.count_duplicate_characters;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<Character,Integer> duplicatesCounted = countDuplicateCharacters("Hello World, Good morning");
        duplicatesCounted.entrySet()
                .forEach(entry -> System.out.println("The character is " + entry.getKey() + " and the value is " + entry.getValue()));
        Map<Character,Long> duplicatesCountedTwo = countDuplicateCharactersTwo("Hello World, Good morning");
        System.out.printf("\n\n-----------------------------\n\n");
        duplicatesCounted.entrySet()
                .forEach(entry -> System.out.println("The character is " + entry.getKey() + " and the value is " + entry.getValue()));
    }


    //first solution
    public static Map<Character, Integer> countDuplicateCharacters(String phrase) {
        phrase = phrase.replaceAll("\\s", "");
        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);

            result.compute(ch, (k, v) -> v == null ? 1 : ++v);
        }
        return result;
    }

    //solution two: relies on String.chars()
    public static Map<Character,Long> countDuplicateCharactersTwo(String phrase) {
        phrase = phrase.replaceAll("\\s", "");
        return phrase.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c , Collectors.counting()));
    }


}

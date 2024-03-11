package Strings_Numbers_Math.reversing_letters_and_words;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    private static final  Pattern PATTERN = Pattern.compile(" +");

    public static void main(String[] args) {
        System.out.println(reverseWordsSecondSolution("Hello World"));
    }

    public static String reverseWords(String str) {
        return null;
    }

    public static String reverseWordsSecondSolution(String str) {
        return PATTERN.splitAsStream(str)
                .map(w -> new StringBuilder(w).reverse())
                .collect(Collectors.joining(" "));
    }
}

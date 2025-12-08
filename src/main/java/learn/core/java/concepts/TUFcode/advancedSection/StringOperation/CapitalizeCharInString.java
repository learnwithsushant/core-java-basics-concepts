package learn.core.java.concepts.TUFcode.advancedSection.StringOperation;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeCharInString {

    public static void main(String[] args) {
        String input = "java streams are powerful";

        String result = Arrays.stream(input.split("\\s+"))
                .map(word -> {
                    if (word.length() == 1) {
                        return word.toUpperCase();
                    } else {
                        char first = Character.toUpperCase(word.charAt(0));
                        char last = Character.toUpperCase(word.charAt(word.length() - 1));
                        String middle = word.substring(1, word.length() - 1);
                        return first + middle + last;
                    }
                })
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}

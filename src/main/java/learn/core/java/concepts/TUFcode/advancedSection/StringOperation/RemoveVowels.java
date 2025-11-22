package learn.core.java.concepts.TUFcode.advancedSection.StringOperation;

import java.util.stream.Collectors;

public class RemoveVowels {
    public static void main(String[] args) {
        String input = "Beautiful Day";

        String result = input.chars()  // 1️⃣ Stream of int (Unicode values)
                .mapToObj(c -> (char) c)  // 2️⃣ Convert to Character Stream
                .filter(ch -> "aeiouAEIOU".indexOf(ch) == -1)  // 3️⃣ Keep only non-vowels
                .map(String::valueOf)  // 4️⃣ Convert each char back to String
                .collect(Collectors.joining());

        System.out.println(result);
    }
}

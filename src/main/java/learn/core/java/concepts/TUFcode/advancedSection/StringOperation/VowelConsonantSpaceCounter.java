package learn.core.java.concepts.TUFcode.advancedSection.StringOperation;

public class VowelConsonantSpaceCounter {
    public static void main(String[] args) {
        String str = "Java Streams are powerful";

        int[] counts = str.toLowerCase()
                .chars()                           // IntStream of code points
                .mapToObj(c -> (char) c)           // Convert each to Character
                .collect(
                        () -> new int[3],              // supplier: new array [vowel, consonant, space]
                        (arr, ch) -> {                 // accumulator: update counts
                            if ("aeiou".indexOf(ch) != -1)
                                arr[0]++;               // vowel count
                            else if (ch == ' ')
                                arr[2]++;               // space count
                            else if (ch >= 'a' && ch <= 'z')
                                arr[1]++;               // consonant count
                        },
                        (a1, a2) -> {                   // combiner: merge arrays (for parallel streams)
                            a1[0] += a2[0];
                            a1[1] += a2[1];
                            a1[2] += a2[2];
                        }
                );

        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
        System.out.println("Spaces: " + counts[2]);
    }
}

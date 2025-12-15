package learn.core.java.concepts.TUFcode.advancedSection.Arrays;

import java.util.Arrays;

public class ConsecutiveUsingLambda {

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1, 0, 1};

        int longest = Arrays.stream(
                        Arrays.toString(nums)
                                .replaceAll("[\\[\\],]", "")
                                .trim()
                                .split("0"))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .mapToInt(s -> s.length())
                .max()
                .orElse(0);

        System.out.println("Consecutive no. of 1's :: "+longest);

        // Bug in this implementation
    }
}

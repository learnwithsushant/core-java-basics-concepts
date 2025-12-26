package learn.core.java.concepts.TUFcode.advancedSection.Arrays;

import java.util.Arrays;

public class ConsecutiveUsingLambda {

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,0,0,1, 1, 0, 1, 1, 1, 0, 1};

        int longest = Arrays.stream(nums)
                .mapToObj(String::valueOf)     // "1", "1", "0", ...
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString()
                .split("0")
                .length == 0 ? 0 :
                Arrays.stream(
                                Arrays.stream(nums)
                                        .mapToObj(String::valueOf)
                                        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                                        .toString()
                                        .split("0"))
                        .mapToInt(String::length)
                        .max()
                        .orElse(0);



        System.out.println("Consecutive no. of 1's :: "+longest);
    }
}

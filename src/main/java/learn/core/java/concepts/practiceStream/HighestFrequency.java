package learn.core.java.concepts.practiceStream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestFrequency {
    public static void main(String[] args) {

        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};

        int majority = Arrays.stream(nums)
                .boxed()  // convert int → Integer Stream
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()) // pick highest frequency
                .get()   // Optional → Map.Entry
                .getKey();

        System.out.println("Majority Element = " + majority);
    }
}

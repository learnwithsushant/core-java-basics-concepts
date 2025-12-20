package learn.core.java.concepts.TUFcode.advancedSection.Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateArrayLeft {
    public static void main(String[] args) {
       nomalImplementation();
       lambdaBasedImplementation();
    }

    private static void lambdaBasedImplementation() {
        System.out.println("Lambda Based Implementation");
        int[] nums = {5, 4, 3, 2, 1};

        nums = IntStream.concat(
                Arrays.stream(nums).skip(1),   // elements from index 1 to end
                Arrays.stream(nums).limit(1)   // first element
        ).toArray();

        Arrays.stream(nums).forEach(System.out::println);
    }

    private static void nomalImplementation() {
        int nums[] = {1, 2, 3, 4, 5}, firstElt = nums[0], i = 1;

        for (; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[i - 1] = firstElt;

        Arrays.stream(nums).forEach(System.out::println);
    }
}

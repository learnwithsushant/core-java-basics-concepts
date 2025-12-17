package learn.core.java.concepts.TUFcode.advancedSection.Arrays;

import java.util.Arrays;

public class RotateArrayLeft {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5}, firstElt = nums[0], i = 1;

        for (; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[i - 1] = firstElt;

        Arrays.stream(nums).forEach(System.out::println);
    }
}

package learn.core.java.concepts.TUFcode.advancedSection.Arrays;

import java.util.stream.IntStream;

public class ArrayUpperBound {

    public static void main(String[] args) {
        int[] nums = {2, 4, 4, 0, 10};

        System.out.println("Element present at largest index is: "+ performReverseLinearSearch(nums,4) );
    }


    private static int performReverseLinearSearch(int[] nums, int target) {
        return IntStream.iterate(nums.length - 1, i -> i >= 0, i -> i - 1)
                .filter(i -> nums[i] == target)
                .findFirst()
                .orElse(-1);
    }

}

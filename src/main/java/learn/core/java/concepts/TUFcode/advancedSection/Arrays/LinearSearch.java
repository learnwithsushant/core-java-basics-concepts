package learn.core.java.concepts.TUFcode.advancedSection.Arrays;

import java.util.stream.IntStream;

public class LinearSearch {

    public static void main(String[] args) {
    int[] nums = {2, -4, 4, 0, 10};

        System.out.println("Element is present at target: "+ performLinearSearch(nums,10) );
    }

    private static int performLinearSearch(int[] nums, int target){
        int index = -1;
        for(int i =0;i<nums.length;i++){

            if (nums[i]==target) {
                index=i;
                break;
            }
        }

        return index;
    }
    private static int performLinearSearchUsingLambda(int[] nums, int target) {
        return IntStream.range(0, nums.length)
                .filter(i -> nums[i] == target)
                .findFirst()
                .orElse(-1);
    }


}

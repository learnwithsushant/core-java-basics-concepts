package learn.core.java.concepts.TUFcode.Recursion;

import java.util.List;

public class ReverseArrayUsingRecursion {
    static int[] nums ;
    public static void main(String[] args) {

        nums = new int[]{1, 3, 3, 3, 5};

        reverseArray(0,nums.length-1,nums);

        for(int n : nums){
            System.out.print(n);
        }

    }

    private static void reverseArray(int start, int end, int[] nums){
        // Base case
        if (start >= end) return;

        // Swap characters at left and right positions
        int temp = nums[start];
        nums[start]= nums[end];
        nums[end]=temp;

        // Recursive call with updated indices
        reverseArray(start + 1, end - 1,nums);

    }
}

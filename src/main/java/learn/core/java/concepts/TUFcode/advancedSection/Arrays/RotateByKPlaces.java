package learn.core.java.concepts.TUFcode.advancedSection.Arrays;

import java.util.Arrays;

public class RotateByKPlaces {

    public static void main(String[] args) {
        int[] nums = {3, 4, 1, 5, 3, -5};

        nums = splitArrayAndRotate(nums, 2);

        Arrays.stream(nums).forEach(System.out::print);
    }


    public static int[] splitArrayAndRotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        // reversing 1st half
        rotateArray(nums, 0, k - 1);
        // reversing 2nd half
        rotateArray(nums, k, n - 1);
        // reversing the entire array
        rotateArray(nums, 0, n - 1);

        return nums;
    }

public static int[] rotateArray(int[] nums,int start, int end){

       while (start < end) {
           int temp = nums[start];
           nums[start] = nums[end];
           nums[end] = temp;
           start++;
           end--;
       }

       return nums;
    }
}

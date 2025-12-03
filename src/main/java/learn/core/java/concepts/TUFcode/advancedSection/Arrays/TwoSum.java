package learn.core.java.concepts.TUFcode.advancedSection.Arrays;

import java.util.Arrays;

public class TwoSum {

    /*Given an array of integers nums and an integer target. Return the indices(0 - indexed) of two elements in nums such that they add up to target.



Each input will have exactly one solution, and the same element cannot be used twice. Return the answer in increasing order.*/

    public static void main(String[] args) {
        int[] sum = new int[2];

        int[] nums = {1, 6, 2, 10, 3};

        int target = 7;

        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    sum[0]=i;
                    sum[1]=j;
                    break;
                }
            }
        }

        Arrays.stream(sum).forEach(System.out::println);


    }
}

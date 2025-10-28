package learn.core.java.concepts.TUFcode.advancedSection.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {8,7,6,5,4,3,2,1};

        Arrays.stream(insertion_sort(nums)).forEach(System.out::println);
    }

    private static int[] insertion_sort(int[] nums){
        int size = nums.length;

        for(int i = 1;i<size;i++){
            int j = i;

            while(j>0&&(nums[j-1]>nums[j])){

                int temp = nums[j-1];
                nums[j-1]=nums[j];
                nums[j]=temp;

                j-=1;

            }


        }

        return nums;
    }
}
